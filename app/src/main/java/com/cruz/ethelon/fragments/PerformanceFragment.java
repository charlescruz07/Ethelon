package com.cruz.ethelon.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.cruz.ethelon.R;

/**
 * Created by Acer on 01/12/2016.
 */

public class PerformanceFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.performance_layout,container,false);

        RelativeLayout pointBtn, rankBtn;
        pointBtn = (RelativeLayout) rootView.findViewById(R.id.yay);
        rankBtn = (RelativeLayout) rootView.findViewById(R.id.yay2);
        final FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.antoni,new PerformancePointsFragment()).commit();

        pointBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fm.beginTransaction().replace(R.id.antoni,new PerformancePointsFragment()).commit();
            }
        });

        rankBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fm.beginTransaction().replace(R.id.antoni,new PerformanceRankFragment()).commit();
            }
        });

        return rootView;
    }
}
