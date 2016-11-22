package com.cruz.ethelon.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cruz.ethelon.R;
import com.cruz.ethelon.recyclerAdapter;

/**
 * Created by Acer on 22/11/2016.
 */

public class HomeFragment extends Fragment{

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_home,container,false);
        recyclerView = (RecyclerView) rootview.findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(rootview.getContext());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new recyclerAdapter();
        recyclerView.setAdapter(adapter);
        return rootview;
    }
}