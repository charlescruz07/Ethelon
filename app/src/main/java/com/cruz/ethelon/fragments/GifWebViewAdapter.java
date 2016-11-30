package com.cruz.ethelon.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;

import com.cruz.ethelon.R;

/**
 * Created by Acer on 29/11/2016.
 */

public class GifWebViewAdapter extends RecyclerView.Adapter<GifWebViewAdapter.ViewHolder> {
    class ViewHolder extends RecyclerView.ViewHolder{

        //public ImageView itemImage;
        public WebView web;

        public ViewHolder(View itemView) {
            super(itemView);
            web = (WebView) itemView.findViewById(R.id.webby);
        }
    }

    @Override
    public GifWebViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.web_view,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }
}
