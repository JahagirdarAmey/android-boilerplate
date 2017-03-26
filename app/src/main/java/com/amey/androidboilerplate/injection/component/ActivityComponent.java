package com.amey.androidboilerplate.injection.component;

import dagger.Subcomponent;
import com.amey.androidboilerplate.injection.PerActivity;
import com.amey.androidboilerplate.injection.module.ActivityModule;
import com.amey.androidboilerplate.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
