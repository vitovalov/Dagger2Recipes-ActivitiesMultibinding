package com.frogermcs.recipes.dagger_activities_multibinding;



import com.frogermcs.recipes.dagger_activities_multibinding.di.AppComponent;
import com.frogermcs.recipes.dagger_activities_multibinding.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by froger_mcs on 14/09/16.
 */

public class MyApplication extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();

        appComponent.inject(this);
        
        return appComponent;
    }

}