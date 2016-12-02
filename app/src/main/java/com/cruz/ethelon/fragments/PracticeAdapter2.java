package com.cruz.ethelon.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.cruz.ethelon.R;

/**
 * Created by Acer on 26/11/2016.
 */

public class PracticeAdapter2 extends RecyclerView.Adapter<PracticeAdapter2.ViewHolder> {

    private int[] images = { R.drawable.similaract,
            };

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView itemImage;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.itemImage);
        }
    }

    @Override
    public PracticeAdapter2.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_staggered,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PracticeAdapter2.ViewHolder holder, int position) {
        holder.itemImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }
}
