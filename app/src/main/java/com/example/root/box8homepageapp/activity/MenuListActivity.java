package com.example.root.box8homepageapp.activity;

import android.media.Image;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.root.box8homepageapp.R;
import com.example.root.box8homepageapp.adapter.ViewPagerAdapter;
import com.example.root.box8homepageapp.fragment.MenuDetailsFragment;
import com.example.root.box8homepageapp.libs.Utils;
import com.example.root.box8homepageapp.model.Category;

import java.util.ArrayList;
import java.util.List;

import static com.example.root.box8homepageapp.libs.Utils.getCategoryData;

public class MenuListActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager mPager;
    private ImageView backButton;
    private ViewPagerAdapter mAdapter;
    private int navigatedPosition;
    private List<Category> categories = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);
        if (getIntent() != null) {
            navigatedPosition = getIntent().getIntExtra("position", 0);
            initView();
        }
    }

    private void initView() {
        categories = getCategoryData();
        tabLayout = findViewById(R.id.tab_bar);
        mPager = findViewById(R.id.view_pager);
        backButton = findViewById(R.id.backButton);
        tabLayout.setupWithViewPager(mPager);
        setupViewPager();
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void setupViewPager() {
        if (categories != null && categories.size() > 0) {
            mAdapter = new ViewPagerAdapter(getSupportFragmentManager(), categories);
            int categorySize = categories.size();
            for (int i = 0; i < categorySize; i++) {
                mAdapter.addFragment(MenuDetailsFragment.newInstance());
            }
            mPager.setAdapter(mAdapter);
            mPager.setCurrentItem(navigatedPosition);
        }
    }

}
