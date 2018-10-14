package com.example.root.staggeredviewapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.root.staggeredviewapp.R;

public class MenuDetailsFragment extends Fragment {

    public static MenuDetailsFragment newInstance() {
        MenuDetailsFragment fragment = new MenuDetailsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu_details, container, false);
        return view;
    }
}
