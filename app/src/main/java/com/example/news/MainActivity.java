package com.example.news;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.news.add.AddItemActivity;
import com.example.news.bean.TypeBean;
import com.example.news.db.DBManager;
import com.example.news.frag.NewsInfoAdapter;
import com.example.news.frag.NewsInfoFragment;
import com.example.news.view.PagerSlidingTabStrip;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ViewPager mainVp;
    PagerSlidingTabStrip tabStrip;
    ImageView addIv;
    List<Fragment>fragmentList; // ViewPager 所显示的内容
    List<TypeBean>selectTypeList; //所选中的类型的集合
    private NewsInfoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainVp=findViewById(R.id.main_vp);
        tabStrip=findViewById(R.id.main_tabstrip);
        addIv=findViewById(R.id.main_iv_add);
        addIv.setOnClickListener(this);  //添加点击事件的监听
        fragmentList=new ArrayList<>();
        selectTypeList=new ArrayList<>();
        initPager();  //初始化页面

        //创建适配器对象
        adapter = new NewsInfoAdapter(getSupportFragmentManager(), this, fragmentList, selectTypeList);
        //设置适配器
        mainVp.setAdapter(adapter);
        //关联TapStrip和ViewPager
        tabStrip.setViewPager(mainVp);
    }

    private void initPager() {
        /*初始化页面的函数*/
        //List<TypeBean> typeList = TypeBean.getTypeList(); //获取全部

        List<TypeBean> typeList = DBManager.getSelectTypeList(); //获取选中的栏目的页面

        selectTypeList.addAll(typeList);
        for (int i = 0; i < selectTypeList.size(); i++) {
            TypeBean typeBean = selectTypeList.get(i); //得到每一个栏目的信息对象
            NewsInfoFragment infoFragment = new NewsInfoFragment();
            //向Fragment当中传值
            Bundle bundle = new Bundle();
            bundle.putSerializable("type",typeBean);
            infoFragment.setArguments(bundle);
            fragmentList.add(infoFragment);
        }
    }

    //实现点击加号从MainActivity跳转到AddItemActivity界面
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_iv_add:
                Intent intent = new Intent(MainActivity.this, AddItemActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        //先清空ViewPager的数据源，再清空选中列表的数据源
        fragmentList.clear(); //首先将fragment整体清空
        selectTypeList.clear(); //将选中的列表清空

        initPager(); //重新加载ViewPager的显示页

        //提示上下都更新数据
        adapter.notifyDataSetChanged(); //通知adapter更新
        tabStrip.notifyDataSetChanged(); //通知上面的PagerSlidingTab更新
    }
}
