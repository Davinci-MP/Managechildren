package com.example.doancuoiky.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.doancuoiky.Dialog.NewClassDialog;
import com.example.doancuoiky.model.Classes;

public class ClassesDAO {
    private SQLiteDatabase db;

    public ClassesDAO(Context context) {
        DbHelper helper = new DbHelper(context);
        this.db = helper.getWritableDatabase();

    }

    public ClassesDAO(NewClassDialog newClassDialog) {
    }

    public long insert(Classes emp){
        ContentValues values = new ContentValues();
        values.put("id",emp.getId());
        values.put("name",emp.getName());

        return db.insert("classes",null,values);
    }
}
