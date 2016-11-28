package com.cruz.ethelon.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.cruz.ethelon.NotificationController;
import com.cruz.ethelon.R;
import com.cruz.ethelon.notificationAdapter;
import com.cruz.ethelon.recyclerAdapter;

/**
 * Created by Acer on 22/11/2016.
 */

public class NotificationFragment extends Fragment{
    FrameLayout fl;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.notification_list,container,false);
        fl = (FrameLayout) rootView.findViewById(R.id.menu_frame);

        RecyclerView listView = (RecyclerView) rootView.findViewById(R.id.listView);
        layoutManager = new LinearLayoutManager(rootView.getContext());
        listView.setLayoutManager(layoutManager);

        adapter = new notificationAdapter();
        listView.setAdapter(adapter);
        return rootView;
    }
}
