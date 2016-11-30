package com.cruz.ethelon.fragments;

import android.content.Context;
import android.webkit.WebView;

/**
 * Created by Acer on 29/11/2016.
 */

public class GifWebView extends WebView {
    public GifWebView(Context context, String path){
        super(context);
        loadUrl(path);
    }
}
