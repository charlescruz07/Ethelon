package com.cruz.ethelon.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.cruz.ethelon.R;

/**
 * Created by Acer on 28/11/2016.
 */

public class DetailsTextAdapter extends RecyclerView.Adapter<DetailsTextAdapter.ViewHolder> {
    @Override
    public DetailsTextAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.act_details_text,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtDetails.setText("Time: 10:00 am \n" +
                "Date: December 10, 2016 \n" +
                "Location: USJ-R Basak Campus \n" +
                "for more info call 09257772302 \n" +
                "look for Anton Wycoco");
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView txtDetails;

        public ViewHolder(View itemView) {
            super(itemView);
            txtDetails = (TextView) itemView.findViewById(R.id.kobe);
        }
    }
}
