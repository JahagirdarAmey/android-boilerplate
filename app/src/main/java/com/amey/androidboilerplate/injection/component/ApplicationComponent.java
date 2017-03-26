package com.amey.androidboilerplate.injection.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import com.amey.androidboilerplate.data.DataManager;
import com.amey.androidboilerplate.data.SyncService;
import com.amey.androidboilerplate.data.local.DatabaseHelper;
import com.amey.androidboilerplate.data.local.PreferencesHelper;
import com.amey.androidboilerplate.data.remote.RibotsService;
import com.amey.androidboilerplate.injection.ApplicationContext;
import com.amey.androidboilerplate.injection.module.ApplicationModule;
import com.amey.androidboilerplate.util.RxEventBus;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(SyncService syncService);

    @ApplicationContext Context context();
    Application application();
    RibotsService ribotsService();
    PreferencesHelper preferencesHelper();
    DatabaseHelper databaseHelper();
    DataManager dataManager();
    RxEventBus eventBus();

}
