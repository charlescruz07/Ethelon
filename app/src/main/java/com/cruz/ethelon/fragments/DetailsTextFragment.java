package com.cruz.ethelon.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cruz.ethelon.R;

/**
 * Created by Acer on 28/11/2016.
 */

public class DetailsTextFragment extends Fragment {

    TextView textDetails;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.act_details_text,container,false);
        textDetails = (TextView) rootView.findViewById(R.id.kobe);
        textDetails.setText("Time: 10:00 am \n" +
                "Date: December 10, 2016 \n" +
                "Location: USJ-R Basak Campus \n" +
                "for more info call 09257772302 \n" +
                "look for Anton Wycoco");
        return rootView;
    }
}
