package com.bestnbest.satyajeetjena.utils;

import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;

public class AppUtils {
	public static String loadJSONFromAsset(Context context, String filename) {
		String json;
		try {

			InputStream is = context.getAssets().open(filename+".json");

			int size = is.available();

			byte[] buffer = new byte[size];

			is.read(buffer);
			
			is.close();

			json = new String(buffer, "UTF-8");
			Log.v("AppUtils", "JSONArray=>"+json);
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
		return json;
	}
}
