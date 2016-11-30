package com.cruz.ethelon;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cruz.ethelon.fragments.DetailsTextAdapter;

import org.w3c.dom.Text;

/**
 * Created by Acer on 30/11/2016.
 */

public class PointsAdapter extends RecyclerView.Adapter<PointsAdapter.ViewHolder> {

    private String[] title = {"Points Earned: "};
    private String[] points = {"1000"};


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtTitle, txtPoints;

        public ViewHolder(View itemView) {
            super(itemView);

            txtTitle = (TextView) itemView.findViewById(R.id.pointsEarned);
            txtPoints = (TextView) itemView.findViewById(R.id.badgesEarned);
        }
    }





    @Override
    public PointsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.points_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PointsAdapter.ViewHolder holder, int position) {

        holder.txtTitle.setText(title[position]);
        holder.txtPoints.setText(points[position]);
    }

    @Override
    public int getItemCount() {
        return title.length;
    }


}
