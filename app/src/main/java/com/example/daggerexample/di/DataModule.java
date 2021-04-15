package com.example.daggerexample.di;

import android.app.Application;
import android.content.Context;

import com.example.daggerexample.model.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DataModule {
    private User userObj;
    private Application application;

    public DataModule (User user){
        this.userObj = user;
    }

   /* @Provides
    @Singleton
    public Context provideContext() {
        return application;
    } */

    @Provides
    @Singleton
    User providesUser (){
        return new User("Shray", "Bhatia");
    }
}
