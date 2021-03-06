package com.cruz.ethelon.admin;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cruz.ethelon.R;


/**
 * Created by Acer on 02/12/2016.
 */

public class VolunteersFragment extends Fragment {

    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    View charles;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.notification_list,container,false);
        RecyclerView listView = (RecyclerView) rootView.findViewById(R.id.listView);
        layoutManager = new LinearLayoutManager(rootView.getContext());
        listView.setLayoutManager(layoutManager);

        adapter = new VolunteersAdapter(charles);
        listView.setAdapter(adapter);
        return rootView;
    }

    public void setViewzz(View rootView){
        this.charles = rootView;
    }
}
