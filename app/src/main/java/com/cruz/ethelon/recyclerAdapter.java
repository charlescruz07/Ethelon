package com.cruz.ethelon;

import android.content.Intent;
import android.media.Image;
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

    private String[] actName = {"Feeding Program",
            "Disaster Relief",
            "Children Vaccination",
            "Tuli Operation",
            "Dental Mission",
            "Feeding Program",
            "Disaster Relief",
            "Medical Mission"};

    private String[] actDetails = {"Rise Above Foundation",
            "Ramon Aboitiz Foundation Inc.", "Rise Above Foundation",
            "Ramon Aboitiz Foundation Inc.", "Rise Above Foundation",
            "Ramon Aboitiz Foundation Inc.", "Rise Above Foundation",
            "Ramon Aboitiz Foundation Inc."};

    private String[] actHost = {"Lorem Epsum",
            "Item two details", "Item three details",
            "Item four details", "Item file details",
            "Item six details", "Item seven details",
            "Item eight details"};

    private int[] images = { R.drawable.v1,
            R.drawable.v1,
            R.drawable.v1,
            R.drawable.v1,
            R.drawable.v1,
            R.drawable.v1,
            R.drawable.v1,
            R.drawable.v1};


    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView itemImage, joinBtn, referBtn;
        public TextView activityName,activityDetails;
        int joinClick = 0, referClick = 0;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.antonshit);
            joinBtn = (ImageView) itemView.findViewById(R.id.hearty);
            referBtn = (ImageView) itemView.findViewById(R.id.share);

            itemImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setClass(v.getContext(),ActivityDetails.class);
                    v.getContext().startActivity(intent);
                }
            });

            joinBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(joinClick == 0){
                    joinBtn.setImageResource(R.drawable.ic_heart_red);
                    joinClick = 1;
                    }else {
                        joinBtn.setImageResource(R.drawable.ic_heart);
                        joinClick = 0;
                    }
                }
            });

            referBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(referClick == 0){
                    referBtn.setImageResource(R.drawable.ic_arrow_red);
                    referClick = 1;
                    }else {
                        referBtn.setImageResource(R.drawable.ic_arrow);
                        referClick =0 ;
                    }
                }
            });
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override public void onClick(View v) {
//                    int position = getAdapterPosition();
//
//                    Snackbar.make(v, "Click detected on item " + position,
//                            Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();
//                }
//            });


        }
    }



    @Override
    public recyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout2,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(recyclerAdapter.ViewHolder holder, int position) {
        holder.itemImage.setImageResource(images[position]);
//        holder.activityName.setText(actName[position]);
//        holder.activityDetails.setText(actDetails[position]);
    }

    @Override
    public int getItemCount() {
        return actName.length;
    }


}
