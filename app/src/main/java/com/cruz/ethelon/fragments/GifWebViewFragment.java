package com.cruz.ethelon.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.cruz.ethelon.R;

/**
 * Created by Acer on 29/11/2016.
 */

public class GifWebViewFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.web_view,container,false);

        //GifWebView view = new GifWebView(rootView.getContext(), "file:///android_asset/starboyzz.gif");
        WebView wv = (WebView) rootView.findViewById(R.id.webby);
        wv.loadUrl("file:///android_asset/starboyzz.gif");
        return rootView;
    }
}
