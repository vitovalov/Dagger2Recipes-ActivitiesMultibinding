package com.frogermcs.recipes.dagger_activities_multibinding.second_activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by vito on 08/02/2018.
 */



@Module
public abstract class SecondActivityModule {
    @Provides
    static SecondActivityPresenter provideSecondActivityPresenter(SecondActivity ac) {
        return new SecondActivityPresenter(ac);
    }
}