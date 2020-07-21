package com.assesment.a4sure.Utils;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleyUtil {
    private static VolleyUtil instance = new VolleyUtil();
    private final Object object = new Object();
    private RequestQueue requestQueue;

    private VolleyUtil() {
    }

    public static  VolleyUtil getInstance() {
        return instance;
    }

    public  RequestQueue getRequestQueue(Context context) {
        if (requestQueue == null) {
            synchronized (object) {
                if (requestQueue == null) {
                    requestQueue = Volley.newRequestQueue(context);
                }
            }
        }

        return requestQueue;
    }
}
