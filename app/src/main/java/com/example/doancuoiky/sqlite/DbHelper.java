package com.example.doancuoiky.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "doancuoiky";
    private static final int DB_VERSION = 1;

    public DbHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String classSql = "CREATE TABLE classes(id integer primary key autoincrement," + "name  text not null)";
        String studdentSql = "CREATE TABLE students( id text primary key," + "name text not null, classid integer, dob text,"+"FOREIGN KEY (classid) REFERENCES classes(id)) ";
        db.execSQL(classSql);
        db.execSQL(studdentSql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String classesSql = "DROP TABLE IF EXISTS classes";
        String studentSql = "DROP TABLE IF EXISTS students";

        db.execSQL(studentSql);
        db.execSQL(classesSql);

        onCreate(db);

    }
}
