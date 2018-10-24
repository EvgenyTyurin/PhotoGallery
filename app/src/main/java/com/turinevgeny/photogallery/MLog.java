package com.turinevgeny.photogallery;

import android.content.Context;
import android.widget.Toast;

/**
 * Run-time message-based logger
 */

class MLog {

    // Show log message
    static void log(Context context, String message){
        Toast.makeText(context,
                message,
                Toast.LENGTH_SHORT).show();
    }

}
