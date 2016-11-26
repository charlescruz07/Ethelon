package com.cruz.ethelon;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Window;
import android.widget.RatingBar;
import android.widget.TextView;

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
        setContentView(R.layout.activity_details_layout);
        rb = (RatingBar) findViewById(R.id.ratingBar);
        rb.setNumStars(5);
        rb.setRating(Float.parseFloat("4"));

        TextView details = (TextView) findViewById(R.id.details);
        details.setText("Time: 10:00 am \n" +
                "Date: December 10, 2016 \n" +
                "Location: USJ-R Basak Campus \n" +
                "for more info call 09257772302 \n" +
                "look for Anton Wycoco");

        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().replace(R.id.shit, new PracticeFragment()).commit();
        fm.beginTransaction().replace(R.id.shit2, new PracticeFragment2()).commit();
    }
}
