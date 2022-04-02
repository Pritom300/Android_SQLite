package com.example.android_sqlite.util;

public class Util {

    //Database Related Items
    public static final int DATABASE_VERSION = 1;   //we will never change thats why we call static and final!
    public static final String DATABASE_NAME = "contact_db";
    public static final String TABLE_NAME = "contacts";


    //contacts table column names
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";
    public static final String KEY_PHONE_NUMBER = "phone_number";

}
