package com.example.root.box8homepageapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.root.box8homepageapp.R;

import java.util.ArrayList;

public class GalleryImagePagerAdapter extends PagerAdapter {
    private Context mContext;
    private Integer[] imgaeIds;
    private LayoutInflater mLayoutInflater;

    public GalleryImagePagerAdapter(Context mContext, Integer[] imageIds) {
        this.mContext = mContext;
        this.imgaeIds = imageIds;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);;
    }

    @Override
    public int getCount() {
        return imgaeIds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((ConstraintLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.layout_image_view, container, false);
        ImageView imageView = itemView.findViewById(R.id.image_view);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageDrawable(ContextCompat.getDrawable(mContext, imgaeIds[position]));
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        super.setPrimaryItem(container, position, object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ConstraintLayout) object);
    }
}
