package com.nytimes.android.external.register.di;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent extends ObjectGraph {
}
