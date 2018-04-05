package test.com.newquizapp;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by manojselvin on 5/4/18.
 */

public class WebAppInterface {
    Context mContext;
    String data;

    WebAppInterface(Context ctx){
        this.mContext=ctx;
    }


    @android.webkit.JavascriptInterface
    public void sendData(String data) {
        //Get the string value to process
        this.data=data;
        Toast.makeText(mContext, data, Toast.LENGTH_LONG).show();
    }
}