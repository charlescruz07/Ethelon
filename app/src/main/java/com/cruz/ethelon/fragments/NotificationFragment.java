package com.cruz.ethelon.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.cruz.ethelon.NotificationController;
import com.cruz.ethelon.R;
import com.cruz.ethelon.notificationAdapter;

/**
 * Created by Acer on 22/11/2016.
 */

public class NotificationFragment extends Fragment{
    FrameLayout fl;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.notification_list,container,false);
        fl = (FrameLayout) rootView.findViewById(R.id.menu_frame);

        ListView listView = (ListView) rootView.findViewById(R.id.listView);
        NotificationController controller = new NotificationController();
        notificationAdapter adapter = new notificationAdapter(rootView.getContext(), R.layout.list_item_notification2,
                controller.getNotifications());
        listView.setAdapter(adapter);
        return rootView;
    }
}
