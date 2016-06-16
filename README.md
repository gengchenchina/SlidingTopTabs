# SlingTopTabs
horizontal-scrollable-tabs

![image](https://github.com/gengchenchina/SlidingTopTabs/blob/master/sliding_top_tabs.png)


```
<com.gengchenchina.slidingtoptabs.library.TopSlidingTabs
        android:id="@+id/top_tabs"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#ffffff"
        tst:tstIndicatorColor="#ef6e21"
        tst:tstIndicatorHeight="1.5dp"
        tst:tstIsSelectedBold="true"
        tst:tstIsSelectedCenter="true"
        tst:tstVerticalPadding="8dp"
        tst:tstHorizontalTabMargin="15dp"
        tst:tstIsShowUnderline="true"
        tst:tstUnderlineColor="#999999"
        tst:tstUnderlineHeight="1dp"
        android:textColor="#666666"
        android:textSize="16sp"/>
```


```java
private String[] tabTexts = {"三亚", "斐济", "拉斯维加斯", "纽约", "迪拜", "香港", "北海道", "塞班岛"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TopSlidingTabs topSlidingTabs = (TopSlidingTabs) findViewById(R.id.top_tabs);

        topSlidingTabs.setTabs(tabTexts);

    }
```

