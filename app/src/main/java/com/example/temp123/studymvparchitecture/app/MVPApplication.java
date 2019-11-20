package com.example.temp123.studymvparchitecture.app;

import android.app.Application;

/**
 * Created by temp123 on 2019/11/19.
 */

public class MVPApplication extends Application{

    private static MVPApplication appInstace;

    public MVPApplication getAppInstace() {
        return appInstace;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appInstace = this;
    }
}
