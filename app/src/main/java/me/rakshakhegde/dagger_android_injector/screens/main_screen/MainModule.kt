package me.rakshakhegde.dagger_android_injector.screens.main_screen

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class MainModule {

    @Binds
    abstract fun mainView(act: MainActivity): MainView

    @Module
    companion object {
        @JvmStatic @Provides
        fun providesUnusedData(): String = "Unused Data"
    }
    // Add more @Provides here
}
