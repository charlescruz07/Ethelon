package com.cruz.ethelon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Acer on 19/11/2016.
 */

public class NotificationController {
    private List<Notification> nNotifications;

    public NotificationController(){
        nNotifications = new ArrayList<>();
        nNotifications.add(new Notification("Charles Cruz","has sent you a message",R.drawable.movie01));
        nNotifications.add(new Notification("Charles Cruz","has sent you a message",R.drawable.movie02));
        nNotifications.add(new Notification("Charles Cruz","has sent you a message",R.drawable.movie03));
        nNotifications.add(new Notification("Charles Cruz","has sent you a message",R.drawable.movie04));
        nNotifications.add(new Notification("Charles Cruz","has sent you a message",R.drawable.movie05));
        nNotifications.add(new Notification("Charles Cruz","has sent you a message",R.drawable.movie06));
        nNotifications.add(new Notification("Charles Cruz","has sent you a message",R.drawable.movie07));
        nNotifications.add(new Notification("Charles Cruz","has sent you a message",R.drawable.movie08));
        nNotifications.add(new Notification("Charles Cruz","has sent you a message",R.drawable.movie09));
        nNotifications.add(new Notification("Charles Cruz","has sent you a message",R.drawable.movie10));
    }

    public List<Notification> getNotifications() {
        return nNotifications;
    }
}
