package com.frogermcs.recipes.dagger_activities_multibinding;

import javax.inject.Inject;

/**
 * Created by froger_mcs on 18/10/2016.
 */

public class Utils {

    @Inject
    public Utils() {
    }

    public String getHardcodedText() {
        return "hardcoded text";
    }
}
