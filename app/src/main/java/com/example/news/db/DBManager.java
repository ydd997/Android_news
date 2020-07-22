package com.example.news.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.news.bean.TypeBean;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    public static SQLiteDatabase database;

    public static void initDB(Context context){
        DBOpenHelper helper=new DBOpenHelper(context);
        database=helper.getWritableDatabase();
    }

    /*获取数据库中全部行的内容，存储到集合当中*/
    public static List<TypeBean>getAllTypeList(){
        List<TypeBean>list=new ArrayList<>();
        Cursor cursor=database.query("itype",null,null,null,null,null,null);
        while (cursor.moveToNext()){
            int id = cursor.getInt(cursor.getColumnIndex("id"));
            String title = cursor.getString(cursor.getColumnIndex("title"));
            String url = cursor.getString(cursor.getColumnIndex("url"));
            String showstr = cursor.getString(cursor.getColumnIndex("isshow"));
            Boolean isshow = Boolean.valueOf(showstr);
            TypeBean typeBean=new TypeBean(id,title,url,isshow);
            list.add(typeBean);
        }
        return list;
    }

    /*修改数据库当中信息的选中记录*/
    public static void updateTypeList(List<TypeBean>typeList){
        for (int i = 0; i < typeList.size(); i++) {
            TypeBean typeBean = typeList.get(i);
            String title = typeBean.getTitle();
            ContentValues values = new ContentValues();
            values.put("isshow",String.valueOf(typeBean.isShow()));
            database.update("itype",values,"title=?",new String[]{title}); //在主线程中直接修改数据库（该数据库数据量比较少可以这样做）
        }
    }

    /*获取所有要求显示内容的集合*/
    public static  List<TypeBean>getSelectTypeList(){
        List<TypeBean>list = new ArrayList<>();
        Cursor cursor = database.query("itype", null, "isshow='true'", null, null, null, null);
        while (cursor.moveToNext()) {
            int id = cursor.getInt(cursor.getColumnIndex("id"));
            String title = cursor.getString(cursor.getColumnIndex("title"));
            String url = cursor.getString(cursor.getColumnIndex("url"));
            TypeBean bean = new TypeBean(id, title, url, true);
            list.add(bean);
        }
        return list;
    }
}
