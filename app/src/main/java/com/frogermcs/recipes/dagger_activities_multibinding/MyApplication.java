package com.frogermcs.recipes.dagger_activities_multibinding;



import android.app.Activity;
import android.app.Application;

import com.frogermcs.recipes.dagger_activities_multibinding.di.AppComponent;
import com.frogermcs.recipes.dagger_activities_multibinding.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by froger_mcs on 14/09/16.
 */

public class MyApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> activityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().application(this).build().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityInjector;
    }

//    Equivalent to implementing HasActivityInjector but with Inheritance from DaggerApplication
//    @Override
//    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
//        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
//
//        appComponent.inject(this);
//
//        return appComponent;
//    }

}