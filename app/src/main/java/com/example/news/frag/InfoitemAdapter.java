package com.example.news.frag;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.news.R;
import com.example.news.bean.InfoBean;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/*每一个Fragment当中的ListView的适配器*/
public class InfoitemAdapter extends BaseAdapter {

    Context context;
    List<InfoBean.ResultBean.DataBean> mDatas;
    ImageLoader imageLoader;
    DisplayImageOptions options; //图片加载配置信息

    public InfoitemAdapter(Context context, List<InfoBean.ResultBean.DataBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
        imageLoader=ImageLoader.getInstance();
        options=new DisplayImageOptions.Builder()
                .showImageOnLoading(null)
                .showImageForEmptyUri(null)
                .showImageOnFail(null)
                .cacheInMemory(true).cacheOnDisk(true).considerExifParams(true)
                .bitmapConfig(Bitmap.Config.RGB_565).build();
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        //1.判断内存中是否有复用的view
        if(convertView==null){
            //2.将布局转换成新的view进行使用
            convertView= LayoutInflater.from(context).inflate(R.layout.item_newsfrag_lv,null);
            holder=new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        //获取指定位置的数据源
        InfoBean.ResultBean.DataBean dataBean = mDatas.get(position);
        holder.titleTv.setText(dataBean.getTitle());
        holder.sourceTv.setText(dataBean.getAuthor_name());
        holder.timeTv.setText(dataBean.getDate());

        //获取三张图片的地址
        String pic1 = dataBean.getThumbnail_pic_s();
        String pic2 = dataBean.getThumbnail_pic_s02();
        String pic3 = dataBean.getThumbnail_pic_s03();

        if (TextUtils.isEmpty(pic1)) {
            holder.iv1.setVisibility(View.GONE);
        }else {
            holder.iv1.setVisibility(View.VISIBLE);
            imageLoader.displayImage(pic1,holder.iv1,options);
        }

        if (TextUtils.isEmpty(pic2)) {
            holder.iv2.setVisibility(View.GONE);
        }else {
            holder.iv2.setVisibility(View.VISIBLE);
            imageLoader.displayImage(pic2,holder.iv2,options);
        }

        if (TextUtils.isEmpty(pic3)) {
            holder.iv3.setVisibility(View.GONE);
        }else {
            holder.iv3.setVisibility(View.VISIBLE);
            imageLoader.displayImage(pic3,holder.iv3,options);
        }

        return convertView;
    }

    class ViewHolder{
        TextView titleTv,sourceTv,timeTv;
        ImageView iv1,iv2,iv3;
        public ViewHolder(View view){
            titleTv=view.findViewById(R.id.item_newsfrag_tv_title);
            sourceTv=view.findViewById(R.id.item_news_tv_source);
            timeTv=view.findViewById(R.id.item_news_tv_time);
            iv1=view.findViewById(R.id.item_news_iv1);
            iv2=view.findViewById(R.id.item_news_iv2);
            iv3=view.findViewById(R.id.item_news_iv3);
        }
    }
}
