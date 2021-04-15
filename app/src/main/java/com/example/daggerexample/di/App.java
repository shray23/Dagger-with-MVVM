package com.example.daggerexample.di;

import android.app.Application;

import com.example.daggerexample.model.User;

public class App extends Application {

    private DataComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        //needs to run once to generate it
        component = DaggerDataComponent.builder()
                .dataModule(new DataModule(new User("this", "that")))
                .build();

    }


    public DataComponent getComponent() {
        return component;
    }
}
