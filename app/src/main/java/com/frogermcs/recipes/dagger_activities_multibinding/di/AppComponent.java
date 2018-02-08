package com.frogermcs.recipes.dagger_activities_multibinding.di;

import android.app.Application;

import com.frogermcs.recipes.dagger_activities_multibinding.MyApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by froger_mcs on 14/09/16.
 */
@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                AppModule.class,
                ActivityBuilder.class
        }
)
public interface AppComponent extends AndroidInjector<DaggerApplication> {
    void inject(MyApplication application);

    @Override
    void inject(DaggerApplication instance);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}