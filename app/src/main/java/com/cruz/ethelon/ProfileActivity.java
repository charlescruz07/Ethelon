package com.cruz.ethelon;

import android.app.Activity;
import android.app.FragmentManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.cruz.ethelon.fragments.HomeFragment;
import com.cruz.ethelon.fragments.NotificationFragment;
import com.cruz.ethelon.fragments.PointsFragment;

/**
 * Created by Acer on 29/11/2016.
 */

public class ProfileActivity extends Activity{

    ImageView editprof, points, port;
    TextView edit, point, por;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.profile_layout);

        editprof = (ImageView)findViewById(R.id.editImage);
        points = (ImageView)findViewById(R.id.pointsImage);
        port = (ImageView)findViewById(R.id.portImage);
        edit = (TextView)findViewById(R.id.editTxt);


        TabLayout tabs = (TabLayout)findViewById(R.id.tabsID);
        editprof.setImageResource(R.drawable.edit);
        points.setImageResource(R.drawable.tropred);
        port.setImageResource(R.drawable.port);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tabId) {
                FragmentManager fm = getFragmentManager();

                if (tabId.getPosition() == 0){

                }

                if(tabId.getPosition() == 1){
                    fm.beginTransaction().replace(R.id.coor,new PointsFragment()).commit();

                }
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
