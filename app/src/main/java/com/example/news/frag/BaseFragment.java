package com.example.news.frag;

import androidx.fragment.app.Fragment;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.news.UniteApp;

public class BaseFragment extends Fragment implements Response.Listener<String>, Response.ErrorListener {
    public void loadDate(String url){
        //创建网络请求对象 StringRequest
        StringRequest request=new StringRequest(url,this,this);

        //将请求添加到请求队列中
        UniteApp.getHttpQueue().add(request);
    }

    @Override
    public void onErrorResponse(VolleyError error) {
        //获取网络请求失败时，会回调的函数
    }

    @Override
    public void onResponse(String response) {
        //获取网络请求成功时，会回调的函数
    }
}
