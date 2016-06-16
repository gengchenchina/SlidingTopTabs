package com.gengchenchina.slidingtoptabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gengchenchina.slidingtoptabs.library.TopSlidingTabs;

public class MainActivity extends AppCompatActivity {

    private String[] tabTexts = {"三亚", "斐济", "拉斯维加斯", "纽约", "迪拜", "香港", "北海道", "塞班岛"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopSlidingTabs topSlidingTabs = (TopSlidingTabs) findViewById(R.id.top_tabs);

        topSlidingTabs.setTabs(tabTexts);

    }
}
