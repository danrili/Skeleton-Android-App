package com.testreactnativeapp;

import android.os.Bundle;
import com.facebook.react.module.annotations.*;
import com.facebook.react.ReactActivity;
import com.heapanalytics.android.Heap;

public class MainActivity extends ReactActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Heap.init(getApplicationContext(), "11");
    }
    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "TestReactNativeApp";
    }
}
