package com.module.b.app;

import android.app.Application;

import com.module.base.ApplicationService;


/**
 * Created by milo on 2018/5/15.
 */

public class DebugMyApp extends Application implements ApplicationService {


    public static DebugMyApp getInstance() {
        return DebugMyAppHolder.INSTANCE;
    }

    public static class DebugMyAppHolder {
        private static DebugMyApp INSTANCE = new DebugMyApp();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        loadModuleApplicationService(this);
    }

    @Override
    public Application getApplication() {
        return this;
    }

    @Override
    public void loadModuleApplicationService(Application application) {

    }
}
