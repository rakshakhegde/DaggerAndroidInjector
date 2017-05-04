package me.rakshakhegde.dagger_android_injector.screens.main_screen;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by rakshakhegde on 26/04/17.
 */
@Module
public abstract class MainModule {

	@Binds
	abstract MainView mainView(MainActivity act);

	@Provides
	static String providesUnusedData() {
		return "Unused Data";
	}

	// Add more @Provides here
}
