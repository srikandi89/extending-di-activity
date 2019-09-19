package com.testing.mydilibrary;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuilderModule {
    @ContributesAndroidInjector
    abstract LibTestActivity bindLibTestActivity();
}
