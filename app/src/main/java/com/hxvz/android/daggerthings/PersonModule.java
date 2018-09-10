package com.hxvz.android.daggerthings;

import dagger.Module;
import dagger.Provides;

@Module
class PersonModule {
    @Provides
    Knowledge providesKnowledge() {
        return new Knowledge(new AsteriskBookFormatter());
    }
    @Provides
    Person providesPerson(Programmer programmer, Knowledge knowledge) {
        return new Person(programmer, knowledge);
    }
}
