package com.uc.utspt_0706011910004;

public class AdapterUser {
    private String mName, mAge, mAddress;

    public AdapterUser(String name, String age, String address){
        mName = name;
        mAge = age;
        mAddress = address;
    }

    public AdapterUser(int name) {

    }

    public String getmName() {
        return mName;
    }

    public String getmAge() {
        return mAge;
    }

    public String getmAddress() {
        return mAddress;
    }
}
