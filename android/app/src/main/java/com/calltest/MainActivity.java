package com.calltest;

import com.facebook.react.ReactActivity;
import io.neson.react.notification.NotificationPackage;    // <- Add this line 
 
public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {

        //  new NotificationPackage();

        return "callTest";
    }
}
