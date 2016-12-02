package com.cruz.ethelon.admin;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.cruz.ethelon.R;

/**
 * Created by Acer on 30/11/2016.
 */

public class CreateActivity3Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.admin_create_activity3,container,false);
        TextView img = (TextView) rootView.findViewById(R.id.completeBtn) ;

        return rootView;
    }
}
