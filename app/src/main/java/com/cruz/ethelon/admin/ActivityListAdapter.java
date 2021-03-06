package com.cruz.ethelon.admin;

import android.app.Activity;
import android.content.Context;
import android.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cruz.ethelon.R;

/**
 * Created by Acer on 30/11/2016.
 */

public class ActivityListAdapter extends RecyclerView.Adapter<ActivityListAdapter.ViewHolder> {

    Context context;
    public ActivityListAdapter(Context context){
        this.context = context;
    }

    private String[] acts = {"Card making for\nPhilippine soldiers",
    "Inmate Counseling",
    "Feeding Program",
    "Dental Mission",
    "Disaster Relief",
    "House Making for \nTyphoon Victims",
    "Sports Programs for \nstreet children"};

    private String[] dates = {
            "Thursday, Dec. 8, 10:00am",
            "Friday, Dec. 16, 2:00pm",
            "Tuesday, Jan. 10, 4:00pm",
            "Saturday, Jan. 14, 1:00pm",
            "Sunday, Feb. 5, 8:00am",
            "Wednesday, Feb.8, 9:00am",
            "Saturday, Feb. 11, 10:00am"};

    @Override
    public ActivityListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ActivityListAdapter.ViewHolder holder, int position) {
        holder.actName.setText(acts[position]);
        holder.actDate.setText(dates[position]);
    }

    @Override
    public int getItemCount() {
        return acts.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView actName,actDate;
        TextView editBtn, deleteBtn;
        public ViewHolder(final View itemView) {
            super(itemView);
            FragmentManager fm = ((Activity)context).getFragmentManager();
            fm.beginTransaction().add(new ActivitiesFragment(),"act_frag").commit();
            fm.beginTransaction().add(new CreateActivityFragment(),"create_act_frag").commit();
            actName = (TextView)itemView.findViewById(R.id.actName);
            actDate = (TextView)itemView.findViewById(R.id.actDate);
            editBtn = (TextView)itemView.findViewById(R.id.editBtn);
            deleteBtn = (TextView)itemView.findViewById(R.id.deleteBtn);

            editBtn.setOnClickListener(new View.OnClickListener() {
                FragmentManager fm = ((Activity)context).getFragmentManager();
                @Override
                public void onClick(View v) {
                    fm.beginTransaction().replace(R.id.fram2,new CreateActivityFragment()).addToBackStack("act_frag").commit();
                }
            });

            deleteBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((ViewGroup)v.getParent()).removeAllViews();
                }
            });
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fm = ((Activity)context).getFragmentManager();
                    fm.beginTransaction().replace(R.id.fram2, new AdminActivityDetails()).addToBackStack("act_frag").commit();
                }
            });
        }
    }
}
