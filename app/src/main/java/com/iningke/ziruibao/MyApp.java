package com.iningke.ziruibao;

import android.app.Application;

/**
 * Created by iningke on 2016/10/24.
 */
public class MyApp extends Application {
    protected static MyApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static MyApp getApplication() {
        return mInstance;
    }
}
