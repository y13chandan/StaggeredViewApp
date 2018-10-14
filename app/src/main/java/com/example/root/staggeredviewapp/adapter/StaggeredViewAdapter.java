package com.example.root.staggeredviewapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.root.staggeredviewapp.R;
import com.example.root.staggeredviewapp.libs.Utils;
import com.example.root.staggeredviewapp.model.Category;

import java.util.List;

public class StaggeredViewAdapter extends RecyclerView.Adapter<StaggeredViewAdapter.ViewHolder> {
    private Context ctx;
    private Integer[] imageholders;
    private List<Category> categories;

    public StaggeredViewAdapter(Context ctx, Integer[] imageholders) {
        this.ctx = ctx;
        this.imageholders = imageholders;
        categories = Utils.getCategoryData();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.layout_image_category_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(position);
    }

    @Override
    public int getItemCount() {
        return imageholders.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_category);
            textView = itemView.findViewById(R.id.txt_category_title);
        }

        public void onBind(int position) {
            imageView.setImageDrawable(ContextCompat.getDrawable(ctx, imageholders[position]));
            textView.setText(categories.get(position).getCategoryName());
        }
    }
}
