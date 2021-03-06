package com.cruz.ethelon;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Window;
import android.widget.RatingBar;
import android.widget.TextView;

import com.cruz.ethelon.fragments.DetailsTextFragment;
import com.cruz.ethelon.fragments.GifWebView;
import com.cruz.ethelon.fragments.GifWebViewFragment;
import com.cruz.ethelon.fragments.HomeFragment;
import com.cruz.ethelon.fragments.PracticeAdapter;
import com.cruz.ethelon.fragments.PracticeFragment;
import com.cruz.ethelon.fragments.PracticeFragment2;
import com.riontech.staggeredtextgridview.StaggeredTextGridView;

/**
 * Created by Acer on 24/11/2016.
 */

public class ActivityDetails extends Activity
{
    RatingBar rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_details);

        //GifWebView view = new GifWebView(this, "file:///android_asset/starboyzz.gif");
        //setContentView(view);

        TabLayout tab = (TabLayout) findViewById(R.id.tab_menu);
        tab.addTab(tab.newTab().setText("Details"));
        tab.addTab(tab.newTab().setText("Pictures"));
        tab.addTab(tab.newTab().setText("Similar Activities"));

        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.ff,new GifWebViewFragment()).commit();
        fm.beginTransaction().replace(R.id.tab_frame,new DetailsTextFragment()).commit();


        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 0) {
                    FragmentManager fm = getFragmentManager();
                    fm.beginTransaction().replace(R.id.tab_frame, new DetailsTextFragment()).commit();

                } else if (tab.getPosition() == 1) {
                    FragmentManager fm = getFragmentManager();
                    fm.beginTransaction().replace(R.id.tab_frame, new PracticeFragment()).commit();
                } else if (tab.getPosition() == 2) {
                    FragmentManager fm = getFragmentManager();
                    fm.beginTransaction().replace(R.id.tab_frame, new PracticeFragment2()).commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
//        TextView details = (TextView) findViewById(R.id.details);
//        details.setText("Time: 10:00 am \n" +
//                "Date: December 10, 2016 \n" +
//                "Location: USJ-R Basak Campus \n" +
//                "for more info call 09257772302 \n" +
//                "look for Anton Wycoco");
//
//        FragmentManager fm = getFragmentManager();
//        fm.beginTransaction().replace(R.id.shit, new PracticeFragment()).commit();
//        fm.beginTransaction().replace(R.id.shit2, new PracticeFragment2()).commit();
    }
}
