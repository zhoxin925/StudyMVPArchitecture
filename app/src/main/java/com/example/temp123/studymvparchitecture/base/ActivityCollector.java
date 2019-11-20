package com.example.temp123.studymvparchitecture.base;

import android.app.Activity;
import android.os.Process;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by temp123 on 2019/11/19.
 */

public class ActivityCollector {

    private static ActivityCollector instance;
    private Set<Activity> activities;

    public synchronized static ActivityCollector getInstance() {
        if(instance == null) {
            instance = new ActivityCollector();
        }
        return instance;
    }

    public void addActivity(Activity activity) {
        if(activities == null) {
            activities = new HashSet<>();
        }
        activities.add(activity);
    }

    public void removeActivity(Activity activity) {
        if(activities != null && activities.contains(activity)) {
            activities.remove(activity);
        }
    }

    public void exitApp() {
        if(activities != null && !activities.isEmpty()) {
            synchronized (activities) {
                for(Activity activity : activities) {
                    activity.finish();
                }
            }
        }
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

}
