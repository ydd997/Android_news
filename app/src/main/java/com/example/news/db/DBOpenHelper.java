package com.example.news.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.news.bean.NewsURL;

public class DBOpenHelper extends SQLiteOpenHelper {
    public DBOpenHelper(@Nullable Context context) {
        super(context, "info.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="create table itype(id integer primary key,title varchar(10) unique not null,url text not null,isshow varchar(10) not null)";
        db.execSQL(sql);
        String inserSql="insert into itype values(?,?,?,?)";
        db.execSQL(inserSql,new Object[]{1,"头条", NewsURL.headline_url,"true"});
        db.execSQL(inserSql,new Object[]{2,"社会",NewsURL.society_url,"true"});
        db.execSQL(inserSql,new Object[]{3,"国内",NewsURL.home_url,"true"});
        db.execSQL(inserSql,new Object[]{4,"国际",NewsURL.entertainment_url,"true"});
        db.execSQL(inserSql,new Object[]{5,"娱乐",NewsURL.entertainment_url,"true"});
        db.execSQL(inserSql,new Object[]{6,"体育",NewsURL.sport_url,"false"});
        db.execSQL(inserSql,new Object[]{7,"军事",NewsURL.military_url,"false"});
        db.execSQL(inserSql,new Object[]{8,"科技",NewsURL.science_url,"false"});
        db.execSQL(inserSql,new Object[]{9,"财经",NewsURL.fiance_url,"false"});
        db.execSQL(inserSql,new Object[]{10,"时尚",NewsURL.fashion_url,"false"});
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
