package com.example.nirav.listview;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by nirav on 01-Apr-19.
 */

public class DataBase extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "User.db";
    public static final String TABLE_NAME = "Usertable";
    public static final String TABLE_NAME2 = "Transfertable";
    public static final String COLA_1 = "ID";
    public static final String COLA_2 = "NAME";
    public static final String COLA_3 = "SURNAME";
    public static final String COLA_4 = "EMAIL_ID";
    public static final String COLA_5 = "CREDITS";
    public static final String COLB_1 = "SENDER";
    public static final String COLB_2 = "CREDIT";
    public static final String COLB_3 = "RECIPIENT";

    public DataBase(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SURNAME TEXT,EMAIL_ID TEXT, CREDITS INTEGER )");
        sqLiteDatabase.execSQL("create table " + TABLE_NAME2 +" (SENDER TEXT,CREDIT INTEGER,RECIPIENT TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME2);
        onCreate(sqLiteDatabase);

    }

    public boolean insertData(String name, String surname, String emailid, String credits) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLA_2,name);
        contentValues.put(COLA_3,surname);
        contentValues.put(COLA_4,emailid);
        contentValues.put(COLA_5,credits);

        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }

    public boolean updateData(String id,String credits) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLA_1,id);
        contentValues.put(COLA_5,credits);
        db.update(TABLE_NAME, contentValues, "ID = ?",new String[] { id });
        return true;
    }
    public boolean insertData2(String sender,String credit,String recipient) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues Values = new ContentValues();
        Values.put(COLB_1,sender);
        Values.put(COLB_2,credit);
        Values.put(COLB_3,recipient);

        long result = db.insert(TABLE_NAME2,null ,Values);
        if(result == -1)
            return false;
        else
            return true;
    }
}
