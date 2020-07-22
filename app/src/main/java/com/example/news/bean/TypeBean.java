package com.example.news.bean;

/*
* 绑定接口名称和类型的类
* */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TypeBean implements Serializable {
    private int id; //进行数据库的存取
    private String title;
    private String url;
    private boolean isShow; //是否被选中

    public TypeBean(int id, String title, String url, boolean isShow) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.isShow = isShow;
    }

    public TypeBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    public static List<TypeBean> getTypeList(){
        List<TypeBean>mDatas=new ArrayList<>();
        TypeBean tb1 = new TypeBean(1,"头条",NewsURL.headline_url,true);
        TypeBean tb2 = new TypeBean(2,"社会",NewsURL.society_url,true);
        TypeBean tb3 = new TypeBean(3,"国内",NewsURL.home_url,true);
        TypeBean tb4 = new TypeBean(4,"国际",NewsURL.international_url,true);
        TypeBean tb5 = new TypeBean(5,"娱乐",NewsURL.entertainment_url,true);
        TypeBean tb6 = new TypeBean(6,"体育",NewsURL.sport_url,true);
        TypeBean tb7 = new TypeBean(7,"军事",NewsURL.military_url,true);
        TypeBean tb8 = new TypeBean(8,"科技",NewsURL.science_url,true);
        TypeBean tb9 = new TypeBean(9,"财经",NewsURL.fiance_url,true);
        TypeBean tb10 = new TypeBean(10,"时尚",NewsURL.fashion_url,true);
        mDatas.add(tb1);
        mDatas.add(tb2);
        mDatas.add(tb3);
        mDatas.add(tb4);
        mDatas.add(tb5);
        mDatas.add(tb6);
        mDatas.add(tb7);
        mDatas.add(tb8);
        mDatas.add(tb9);
        mDatas.add(tb10);
        return  mDatas;
    }
}
