package com.example.root.box8homepageapp.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.root.box8homepageapp.R;
import com.example.root.box8homepageapp.adapter.GalleryImagePagerAdapter;
import com.example.root.box8homepageapp.libs.Utils;
import com.example.root.box8homepageapp.model.Category;
import com.google.android.flexbox.AlignSelf;
import com.google.android.flexbox.FlexboxLayout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import static com.example.root.box8homepageapp.libs.Utils.getCategoryData;

public class MainActivity extends BaseActivity {
    private ViewPager mPager;
    private TabLayout tabLayout;
    private FlexboxLayout flexboxLayout;
    private GalleryImagePagerAdapter mPagerAdapter;
    private int currentPage = 0;
    private Timer timer;
    private final long DELAY_MS = 500;//delay in milliseconds before task is to be executed
    private final long PERIOD_MS = 2000; // time in milliseconds between successive task executions.
    private Integer[] imageIds = {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5};
    private Integer[] imageholders = {R.drawable.imageholder1, R.drawable.imageholder9, R.drawable.imageholder3,R.drawable.imageholder7,R.drawable.imageholder5};
    private int NUM_PAGES;
    private List<Category> categories;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialiseView();
    }

    private void initialiseView() {
        categories = getCategoryData();
        NUM_PAGES = imageIds.length;
        flexboxLayout = findViewById(R.id.flex_layout);
        mPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_dots);
        mPagerAdapter = new GalleryImagePagerAdapter(this, imageIds);
        mPager.setAdapter(mPagerAdapter);
        tabLayout.setupWithViewPager(mPager, true);
        setTheCategoryLayout();
        settingHandlerAndTimer();
    }

    private void settingHandlerAndTimer() {
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };

        timer = new Timer(); // This will create a new Thread
        timer .schedule(new TimerTask() { // task to be scheduled
            @Override
            public void run() {
                handler.post(Update);
            }
        }, DELAY_MS, PERIOD_MS);
    }

    private void setTheCategoryLayout() {
        int size = imageIds.length;
        for (int i = 0;i < size; i++) {
            ConstraintLayout layout = (ConstraintLayout) LayoutInflater.from(this).inflate(R.layout.layout_image_category_card, null);
            ImageView imageView = (ImageView) layout.findViewById(R.id.img_category);
            TextView textView = layout.findViewById(R.id.txt_category_title);
            imageView.setImageDrawable(ContextCompat.getDrawable(this, imageholders[i]));
            textView.setText(categories.get(i).getCategoryName());
            flexboxLayout.addView(layout);
            ViewGroup.LayoutParams lp = imageView.getLayoutParams();
            FlexboxLayout.LayoutParams layoutParams = (FlexboxLayout.LayoutParams)layout.getLayoutParams();
            final int finalI = i;
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    navigateToMenuListActivity(finalI);
                }
            });
        }
    }

    private void navigateToMenuListActivity(int position) {
        Intent intent = new Intent(this, MenuListActivity.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }




}
