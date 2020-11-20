package com.example.havefun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTabHost;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.havefun.Fragment.AllFragment;
import com.example.havefun.Fragment.MainFragment;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private Map<String,ImageView> imageViewMap=new HashMap<>();
    private Map<String,TextView> textViewMap=new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取FragmentTabHost引用
        FragmentTabHost fragmentTabHost=findViewById(android.R.id.tabhost);
        //初始化
          fragmentTabHost.setup(this,
                  getSupportFragmentManager(),//管理多个Fragment对象的管理器
                  android.R.id.tabcontent);//显示内容界面的控件id
        //第一个页面
        TabHost.TabSpec tab1=fragmentTabHost.newTabSpec("first_tab").setIndicator(getTabSpecView("first_tab","主页",R.drawable.main));
        fragmentTabHost.addTab(tab1, MainFragment.class,null);
        //第二个页面
        TabHost.TabSpec tab2=fragmentTabHost.newTabSpec("second_tab").setIndicator(getTabSpecView("second_tab","所有活动",R.drawable.all));
        fragmentTabHost.addTab(tab2, AllFragment.class,null);
        //第三个页面
        TabHost.TabSpec tab3=fragmentTabHost.newTabSpec("third_tab").setIndicator(getTabSpecView("third_tab","发布",R.drawable.add));
        fragmentTabHost.addTab(tab3, AllFragment.class,null);
        //第四个页面
        TabHost.TabSpec tab4=fragmentTabHost.newTabSpec("fourth_tab").setIndicator(getTabSpecView("fourth_tab","消息",R.drawable.news));
        fragmentTabHost.addTab(tab4, AllFragment.class,null);
        //第五个页面
        TabHost.TabSpec tab5=fragmentTabHost.newTabSpec("fifth_tab").setIndicator(getTabSpecView("fifth_tab","我的",R.drawable.my));
        fragmentTabHost.addTab(tab5, AllFragment.class,null);
        //设置颜色改变的监听器
        fragmentTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                //修改图片和文字颜色
                switch (tabId){
                    case "first_tab"://选择了主页
                        imageViewMap.get("first_tab").setImageResource(R.drawable.main_y);
                        textViewMap.get("first_tab").setTextColor(getResources().getColor(R.color.yellow));
                        imageViewMap.get("second_tab").setImageResource(R.drawable.all);
                        textViewMap.get("second_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("third_tab").setImageResource(R.drawable.add);
                        textViewMap.get("third_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("fourth_tab").setImageResource(R.drawable.news);
                        textViewMap.get("fourth_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("fifth_tab").setImageResource(R.drawable.my);
                        textViewMap.get("fifth_tab").setTextColor(getResources().getColor(R.color.gray));
                        break;
                    case "second_tab"://选择了所有活动
                        imageViewMap.get("first_tab").setImageResource(R.drawable.main);
                        textViewMap.get("first_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("second_tab").setImageResource(R.drawable.all_y);
                        textViewMap.get("second_tab").setTextColor(getResources().getColor(R.color.yellow));
                        imageViewMap.get("third_tab").setImageResource(R.drawable.add);
                        textViewMap.get("third_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("fourth_tab").setImageResource(R.drawable.news);
                        textViewMap.get("fourth_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("fifth_tab").setImageResource(R.drawable.my);
                        textViewMap.get("fifth_tab").setTextColor(getResources().getColor(R.color.gray));
                        break;
                    case "third_tab"://选择了发布
                        imageViewMap.get("first_tab").setImageResource(R.drawable.main);
                        textViewMap.get("first_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("second_tab").setImageResource(R.drawable.all);
                        textViewMap.get("second_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("third_tab").setImageResource(R.drawable.add_y);
                        textViewMap.get("third_tab").setTextColor(getResources().getColor(R.color.yellow));
                        imageViewMap.get("fourth_tab").setImageResource(R.drawable.news);
                        textViewMap.get("fourth_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("fifth_tab").setImageResource(R.drawable.my);
                        textViewMap.get("fifth_tab").setTextColor(getResources().getColor(R.color.gray));
                        break;
                    case "fourth_tab"://选择了消息
                        imageViewMap.get("first_tab").setImageResource(R.drawable.main);
                        textViewMap.get("first_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("second_tab").setImageResource(R.drawable.all);
                        textViewMap.get("second_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("third_tab").setImageResource(R.drawable.add);
                        textViewMap.get("third_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("fourth_tab").setImageResource(R.drawable.news_y);
                        textViewMap.get("fourth_tab").setTextColor(getResources().getColor(R.color.yellow));
                        imageViewMap.get("fifth_tab").setImageResource(R.drawable.my);
                        textViewMap.get("fifth_tab").setTextColor(getResources().getColor(R.color.gray));
                        break;
                    case "fifth_tab"://选择了主页
                        imageViewMap.get("first_tab").setImageResource(R.drawable.main);
                        textViewMap.get("first_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("second_tab").setImageResource(R.drawable.all);
                        textViewMap.get("second_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("third_tab").setImageResource(R.drawable.add);
                        textViewMap.get("third_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("fourth_tab").setImageResource(R.drawable.news);
                        textViewMap.get("fourth_tab").setTextColor(getResources().getColor(R.color.gray));
                        imageViewMap.get("fifth_tab").setImageResource(R.drawable.my_y);
                        textViewMap.get("fifth_tab").setTextColor(getResources().getColor(R.color.yellow));
                        break;
                }
            }
        });
    }

    public View getTabSpecView(String tag, String title, int drawable){
        View view = getLayoutInflater().inflate(R.layout.icon,null);
        //获取当前视图控件的引用
        ImageView icon=view.findViewById(R.id.icon);
        icon.setImageResource(drawable);
        TextView tv_title =view.findViewById(R.id.title);
        tv_title.setText(title);
        //将ImageView对象存储到Map
        imageViewMap.put(tag,icon);
        //将TextView对象存储到Map
        textViewMap.put(tag,tv_title);
        return view;
    }
}
