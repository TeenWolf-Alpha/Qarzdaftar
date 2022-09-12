package com.example.qarzdaftar;

import com.orm.SugarApp;
import com.orm.SugarContext;

public class Sugar extends SugarApp {

    @Override
    public void onCreate() {
        super.onCreate();
        SugarContext.init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();

        SugarContext.terminate();
    }
}
