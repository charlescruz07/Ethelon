package com.cruz.ethelon.admin;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cruz.ethelon.R;
import com.cruz.ethelon.fragments.PracticeAdapter;

/**
 * Created by Acer on 02/12/2016.
 */

public class StaggeredAscPicsFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_show,container,false);
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(rootView.getContext());
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new AssociatedPicsAdapter();
        recyclerView.setAdapter(adapter);
        GridLayoutManager sgm = new GridLayoutManager(rootView.getContext(),2);
        recyclerView.setLayoutManager(sgm);
        return rootView;
    }
}
