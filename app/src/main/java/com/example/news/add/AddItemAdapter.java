package com.example.news.add;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.news.R;
import com.example.news.bean.TypeBean;

import java.util.List;

public class AddItemAdapter extends BaseAdapter {
    Context context;
    List<TypeBean>mDatas;

    //通过构造方法将上面两个内容传递进来
    public AddItemAdapter(Context context, List<TypeBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {
        return mDatas.size(); //返回一共显示的字段
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position); //返回当前位置的数据源
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.item_add_lv,null);

        //初始化convertView当中的控件
        TextView nameTv=convertView.findViewById(R.id.item_add_tv);
        final ImageView iv=convertView.findViewById(R.id.item_add_iv);

        //获取指定位置的数据
        final TypeBean typeBean=mDatas.get(position); //获取到当前位置的数据源
        nameTv.setText(typeBean.getTitle());

        //当isShow()设置为true的时候，对应的后面为对号，当isShow()为false的时候，对应的后面为加号，就是不选中
        if (typeBean.isShow()){
            iv.setImageResource(R.mipmap.subscribe_checked);
        }else {
            iv.setImageResource(R.mipmap.subscribe_unchecked);
        }

        //为了避免所有的选项都没有选中ViewPager没有东西可以显示，默认前两项是选中的
        if (position == 0 || position == 1) {
            iv.setVisibility(View.INVISIBLE);
        }else {
            iv.setVisibility(View.VISIBLE);
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    typeBean.setShow(!typeBean.isShow());  //改变选中的状态
                    if (typeBean.isShow()) {
                        iv.setImageResource(R.mipmap.subscribe_checked);
                    } else {
                        iv.setImageResource(R.mipmap.subscribe_unchecked);
                    }
                }
            });
        }
        return convertView;
    }
}
