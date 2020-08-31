package com.zsxsoft.cordova.x5;

import android.os.Bundle;
import org.apache.cordova.*;
import com.tencent.smtt.sdk.QbSdk;

public class X5Activity extends CordovaActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        QbSdk.initX5Environment(this, null);
        super.onCreate(savedInstanceState);

        // enable Cordova apps to be started in the background
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("cdvStartInBackground", false)) {
            moveTaskToBack(true);
        }

        // Set by <content src="index.html" /> in config.xml
        loadUrl(launchUrl);
    }
}
