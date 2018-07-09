package com.rtstl.parcelabledemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<Student> list = new ArrayList<>();
    Button btn_send;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;
        btn_send = findViewById(R.id.btn_send);
        btn_send.setOnClickListener(this);

        list.clear();
        list.add(new Student("Avik", "Male", "Behala", "Class 10"));
        list.add(new Student("Ronit", "Male", "Behala", "Class 11"));
        list.add(new Student("Rupsha", "Male", "Behala", "Class 12"));
        list.add(new Student("Sneha", "Male", "Behala", "Class 4"));
        list.add(new Student("Arnab", "Male", "Behala", "Class 5"));
        list.add(new Student("Ranit", "Male", "Behala", "Class 6"));
        list.add(new Student("Roxy", "Male", "Behala", "Class 7"));
        list.add(new Student("RockStar", "Male", "Behala", "Class 8"));

    }

    @Override
    public void onClick(View v) {
        if (v == btn_send) {
            Intent intent = new Intent(mContext, SecondActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("student_list", list);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}
