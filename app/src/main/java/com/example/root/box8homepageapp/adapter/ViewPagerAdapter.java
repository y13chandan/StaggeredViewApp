package com.example.root.box8homepageapp.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.root.box8homepageapp.model.Category;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragmentList = new ArrayList<>();
    private List<Category> categories;

    public ViewPagerAdapter(FragmentManager fragmentManager, List<Category> categories) {
        super(fragmentManager);
        this.categories = categories;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return categories.get(position).getCategoryName();
    }

    public void addFragment(Fragment fragment) {
        fragmentList.add(fragment);
    }

}
