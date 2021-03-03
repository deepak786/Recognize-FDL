package com.sample.recognizefdl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;

public class Utility {
    /**
     * check if the given link is firebase dynamic link which our app can support
     * <p>
     * return true if yes otherwise false
     */
    public static boolean isFdl(Context context, String link) {
        if (!TextUtils.isEmpty(link)) {
            Uri uri = Uri.parse(link);
            if (uri != null && uri.getHost() != null) {
                String host = uri.getHost();
                // match this host with all the FDL links that our app can support
                String[] fdls = context.getResources().getStringArray(R.array.fdls);
                for (String fdl : fdls) {
                    if (fdl.equalsIgnoreCase(host)) {
                        // this host is our FDL
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
