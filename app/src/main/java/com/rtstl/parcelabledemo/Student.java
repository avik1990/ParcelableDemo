package com.rtstl.parcelabledemo;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable{

    String name;
    String gender;
    String address;
    String classname;

    public Student() {
    }

    public Student(String name, String gender, String address, String classname) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.classname = classname;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }


    //////////////////////////////////////////////

    protected Student(Parcel in) {
        name = in.readString();
        gender = in.readString();
        address = in.readString();
        classname = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(gender);
        dest.writeString(address);
        dest.writeString(classname);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {

        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };


}
