package com.example.news.frag;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.android.volley.VolleyError;
import com.example.news.DescActivity;
import com.example.news.R;
import com.example.news.bean.InfoBean;
import com.example.news.bean.TypeBean;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsInfoFragment extends BaseFragment {
    ListView infoLv;
    private String url;
    //listView的数据源
    List<InfoBean.ResultBean.DataBean> mData;
    private InfoitemAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_news_info, container, false);
        infoLv=view.findViewById(R.id.newsfrag_lv);
        //获取Activity传递的数据
        Bundle bundle = getArguments();
        TypeBean typeBean= (TypeBean) bundle.getSerializable("type");
        url = typeBean.getUrl();

        mData = new ArrayList<>();
        //创建ListView的适配器对象

        adapter = new InfoitemAdapter(getActivity(), mData);
        infoLv.setAdapter(adapter);

        loadDate(url);
        setListener();
        return view;
    }

    /*设置ListView中每一项点击事件的函数*/
    private void setListener() {
        infoLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //获取指定位置的数据源
                InfoBean.ResultBean.DataBean dataBean = mData.get(position);
                String url = dataBean.getUrl();
                Intent intent = new Intent(getActivity(), DescActivity.class); //从所在的Activity跳转到DescActivity当中
                //在跳转的过程中进行传值
                intent.putExtra("url",url);
                startActivity(intent);
            }
        });
    }

    //获取数据成功时，会调用的函数
    @Override
    public void onResponse(String response) {
        InfoBean infoBean = new Gson().fromJson(response, InfoBean.class);
        List<InfoBean.ResultBean.DataBean> list = infoBean.getResult().getData();
        //添加到数据源中
        mData.addAll(list);
        //提示adapter数据源发送变化了，更新数据
        adapter.notifyDataSetChanged();
    }

    //获取数据失败时，会调用的函数
    @Override
    public void onErrorResponse(VolleyError error) {

    }
}
