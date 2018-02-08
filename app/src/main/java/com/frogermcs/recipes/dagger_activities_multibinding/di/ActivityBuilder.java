package com.frogermcs.recipes.dagger_activities_multibinding.di;


import com.frogermcs.recipes.dagger_activities_multibinding.main_activity.MainActivity;
import com.frogermcs.recipes.dagger_activities_multibinding.main_activity.MainActivityModule;
import com.frogermcs.recipes.dagger_activities_multibinding.second_activity.SecondActivity;
import com.frogermcs.recipes.dagger_activities_multibinding.second_activity.SecondActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by mertsimsek on 25/05/2017.
 */
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector(modules = {SecondActivityModule.class})
    abstract SecondActivity bindSecondActivity();

}
