package com.frogermcs.recipes.dagger_activities_multibinding.main_activity;

import com.frogermcs.recipes.dagger_activities_multibinding.Utils;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vito on 08/02/2018.
 */


@Module
public abstract class MainActivityModule {

    @Provides
    static MainActivityPresenter provideMainActivityPresenter(MainActivity mainActivity, Utils utils) {
        return new MainActivityPresenter(mainActivity, utils);
    }
}