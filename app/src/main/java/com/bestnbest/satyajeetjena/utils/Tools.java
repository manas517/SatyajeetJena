package com.bestnbest.satyajeetjena.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Tools {

    public static boolean isNetworkAvailable(Context ctx) {
        boolean val = false;
        try{
            ConnectivityManager connectivityManager = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            val = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }catch (Exception e){

        }
        return  val;
    }
}
