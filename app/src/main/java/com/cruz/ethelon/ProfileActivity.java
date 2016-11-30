package com.cruz.ethelon;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.app.FragmentManager;

import com.cruz.ethelon.fragments.ActivitiesFragment;
import com.cruz.ethelon.fragments.NotificationFragment;


/**
 * Created by Acer on 29/11/2016.
 */

public class ProfileActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);

        TabLayout tab = (TabLayout) findViewById(R.id.tab_menu);
        tab.addTab(tab.newTab().setText("Portfolio"));
        tab.addTab(tab.newTab().setText("Badges"));
        tab.addTab(tab.newTab().setText("Reedemables"));

        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            FragmentManager fm = getFragmentManager();
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0)
                    fm.beginTransaction().replace(R.id.frameyy,new NotificationFragment()).commit();
                else if(tab.getPosition() == 1)
                    fm.beginTransaction().replace(R.id.frameyy,new ActivitiesFragment()).commit();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
