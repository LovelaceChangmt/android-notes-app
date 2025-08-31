package com.example.endoftermhomework;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MySQLiteOpenHelper extends SQLiteOpenHelper
{
    private  static  final  String TABLE_NAME_USER="user";
    private static final String CREATE_TABLE_SQL_USER = "create table "+TABLE_NAME_USER+"(_id integer primary key autoincrement,account text,password text)";
    public MySQLiteOpenHelper(@Nullable Context context, @Nullable String name,@Nullable SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);
    }
    public MySQLiteOpenHelper(Context context){super(context,"data.dp",null,1);}



    @Override
    public  void  onCreate(SQLiteDatabase db){db.execSQL(CREATE_TABLE_SQL_USER);}

    @Override
    public  void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){

    }
    public boolean register(UserBean userBean){
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("account",userBean.getAccount());
        contentValues.put("password",userBean.getPassword());
        long l= db.insert("user",null,contentValues);
        return  l!=-1;
    }
    public boolean login(String account, String password){
        SQLiteDatabase db1= getWritableDatabase();
        boolean result=false;
        Cursor user =db1.query("user",null,"account like?",new String[]{account},null,null,null);
        if (user != null) {
            while (user.moveToNext()) {
                String account1=user.getString(1);
                result=account1.equals(account);
                String password3=user.getString(2);
                result=password3.equals(password);
                return  result;
            }

        }
        return  false;
    }

}
