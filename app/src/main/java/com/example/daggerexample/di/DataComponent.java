package com.example.daggerexample.di;

import com.example.daggerexample.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DataModule.class)
public interface DataComponent {
    void inject(MainActivity mainActivity);
}
