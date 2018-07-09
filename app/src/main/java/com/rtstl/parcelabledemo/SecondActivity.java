package com.rtstl.parcelabledemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ArrayList<Student> myArray = new ArrayList<>();
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;
        myArray=(ArrayList<Student>)getIntent().getSerializableExtra("student_list");
        Toast.makeText(mContext,""+myArray.size(),Toast.LENGTH_SHORT).show();
    }
}
