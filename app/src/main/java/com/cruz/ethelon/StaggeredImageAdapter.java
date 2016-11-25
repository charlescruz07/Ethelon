package com.cruz.ethelon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import org.json.JSONArray;

/**
 * Created by Acer on 26/11/2016.
 */

public class StaggeredImageAdapter extends BaseAdapter{
    private Context context;
    private JSONArray jArray;


    public StaggeredImageAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView view = (ImageView) LayoutInflater.from(context).inflate(R.layout.row_item_image,null);
        return view;
    }
}
