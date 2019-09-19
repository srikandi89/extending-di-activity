package com.testing.mydilibrary;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Provides
    Context provideContext(App application) {
        return application.getApplicationContext();
    }
}
