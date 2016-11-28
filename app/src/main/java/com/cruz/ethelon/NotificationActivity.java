package com.cruz.ethelon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by Acer on 19/11/2016.
 */

public class NotificationActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_list);

            ListView listView = (ListView) findViewById(R.id.listView);
            NotificationController controller = new NotificationController();
//            notificationAdapter adapter = new notificationAdapter(this, R.layout.list_item_notification2,
//                    controller.getNotifications());
//            listView.setAdapter(adapter);
    }
}
