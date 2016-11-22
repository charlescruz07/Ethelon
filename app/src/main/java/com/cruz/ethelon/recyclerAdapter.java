package com.cruz.ethelon;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Acer on 19/11/2016.
 */

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.ViewHolder>{

    private String[] actName = {"Chapter One",
            "Chapter Two",
            "Chapter Three",
            "Chapter Four",
            "Chapter Five",
            "Chapter Six",
            "Chapter Seven",
            "Chapter Eight"};

    private String[] actDetails = {"Item one details",
            "Item two details", "Item three details",
            "Item four details", "Item file details",
            "Item six details", "Item seven details",
            "Item eight details"};

    private String[] actHost = {"Lorem Epsum",
            "Item two details", "Item three details",
            "Item four details", "Item file details",
            "Item six details", "Item seven details",
            "Item eight details"};

    private int[] images = { R.drawable.v2,
            R.drawable.v2,
            R.drawable.v2,
            R.drawable.v2,
            R.drawable.v2,
            R.drawable.v2,
            R.drawable.v2,
            R.drawable.v2};


    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView itemImage;
        public TextView activityName,activityDetails,activityHost;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.itemImage);
            activityName = (TextView)itemView.findViewById(R.id.activityName);
            activityDetails = (TextView)itemView.findViewById(R.id.activityDetails);
            activityHost = (TextView)itemView.findViewById(R.id.activityHost);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }
    }

    @Override
    public recyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(recyclerAdapter.ViewHolder holder, int position) {
        holder.itemImage.setImageResource(images[position]);
        holder.activityName.setText(actName[position]);
        holder.activityDetails.setText(actDetails[position]);
        holder.activityHost.setText(actHost[position]);
    }

    @Override
    public int getItemCount() {
        return actName.length;
    }


}
