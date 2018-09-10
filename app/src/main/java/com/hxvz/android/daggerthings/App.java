package com.hxvz.android.daggerthings;

import android.app.Application;

public class App extends Application {
    private PersonComponent personComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        personComponent = DaggerPersonComponent
                .builder().build();
    }

    PersonComponent getPersonComponent() {
        return personComponent;
    }
}
