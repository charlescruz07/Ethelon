package com.cruz.ethelon.admin;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.cruz.ethelon.R;

/**
 * Created by Acer on 30/11/2016.
 */

public class CreateActivityFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.admin_create_activity,container,false);
        FrameLayout step2 = (FrameLayout) rootView.findViewById(R.id.step2);
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().add(new CreateActivityFragment(),"step1");

        step2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                fm.beginTransaction().replace(R.id.fram2,new CreateActivity2Fragment()).addToBackStack("step1").commit();
            }
        });
        return rootView;
    }
}
