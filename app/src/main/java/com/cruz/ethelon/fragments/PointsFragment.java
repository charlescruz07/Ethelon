package com.cruz.ethelon.fragments;




import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.cruz.ethelon.PointsAdapter;
import com.cruz.ethelon.R;
import com.cruz.ethelon.notificationAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class PointsFragment extends Fragment {


    FrameLayout fl;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    public PointsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_points,container,false);
        fl = (FrameLayout) rootView.findViewById(R.id.menu_frame);

//        RecyclerView listView = (RecyclerView) rootView.findViewById(R.id.recView);
//        layoutManager = new LinearLayoutManager(rootView.getContext());
//        listView.setLayoutManager(layoutManager);

        adapter = new PointsAdapter();
//        listView.setAdapter(adapter);
        return rootView;
    }

}
