package com.frogermcs.recipes.dagger_activities_multibinding.di;

import android.app.Application;
import android.content.Context;

import com.frogermcs.recipes.dagger_activities_multibinding.Utils;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by froger_mcs on 14/09/16.
 */

@Module
public abstract class AppModule {

    @Binds
    abstract Context provideContext(Application application);

//    not necessary, but works
//    @Provides
//    @Singleton
//    static Utils provideUtils() {
//        return new Utils();
//    }
}