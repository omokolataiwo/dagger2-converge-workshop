package com.hxvz.android.daggerthings;

import dagger.Component;

@Component(modules = {PersonModule.class})
interface PersonComponent {
    void inject(MainActivity mainActivity);
}
