package com.example.emartin.bindr;

import android.provider.BaseColumns;

//http://developer.android.com/training/basics/data-storage/databases.html
//Name
//3 pics
//Personal Summary
//Zip code

//Contract class:  Defines DB schema
public class BindrDatabaseContract {

    private static final String TEXT_TYPE = "TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + BindrDatabaseContract.TABLE_NAME + " (" +
                    BindrDatabaseContract.COLUMN_NAME_ENTRY_ID + " INTEGER PRIMARY KEY," +
                    BindrDatabaseContract.COLUMN_NAME_PICTURE + TEXT_TYPE + COMMA_SEP +
                    BindrDatabaseContract.COLUMN_NAME_SUMMARY + TEXT_TYPE + COMMA_SEP +
                    BindrDatabaseContract.COLUMN_NAME_ZIP + " )";
    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + BindrDatabaseContract.TABLE_NAME;
    //http://www.tutorialspoint.com/android/android_sqlite_database.htm
    private static final String SQL_EDIT_PROFILE =
            "EDIT PROFILE " + BindrDatabaseContract.TABLE_NAME //....

    public BindrDatabaseContract(){}

    public static abstract class ProfileEntry implements BaseColumns {

        public static final String TABLE_NAME = "users";
        public static final String COLUMN_NAME_ENTRY_ID = "profileid";
        public static final String COLUMN_NAME_PICTURE = "photo";
        public static final String COLUMN_NAME_SUMMARY = "summary";
        //int
        public static final String COLUMN_NAME_ZIP = "zipcode";
    }

}
