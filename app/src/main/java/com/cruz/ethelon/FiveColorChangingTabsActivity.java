package com.cruz.ethelon;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.view.Window;

import com.cruz.ethelon.fragments.HomeFragment;
import com.cruz.ethelon.fragments.NotificationFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;

/**
 * Created by iiro on 7.6.2016.
 */
public class FiveColorChangingTabsActivity extends Activity {

    BottomBarTab notif;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main_menu);

        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.menu_frame, new HomeFragment()).commit();

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        notif = bottomBar.getTabWithId(R.id.tab_notification);
        notif.setBadgeCount(10);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {

                FragmentManager fm = getFragmentManager();

                if (tabId == R.id.tab_home){
                    fm.beginTransaction().replace(R.id.menu_frame,new HomeFragment()).commit();
                }

                if(tabId == R.id.tab_notification){
                    fm.beginTransaction().replace(R.id.menu_frame,new NotificationFragment()).commit();
                    notif.removeBadge();
                }
            }
        });

        bottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(@IdRes int tabId) {
                //Toast.makeText(getApplicationContext(), TabMessage.get(tabId, true), Toast.LENGTH_LONG).show();
            }
        });

    }
}