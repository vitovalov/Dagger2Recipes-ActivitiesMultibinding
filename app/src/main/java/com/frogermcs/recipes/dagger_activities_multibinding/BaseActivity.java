package com.frogermcs.recipes.dagger_activities_multibinding;

import android.os.Bundle;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by froger_mcs on 09/08/16.
 */
public abstract class BaseActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
