package me.rakshakhegde.dagger_android_injector.screens.main_screen;

import dagger.Module;
import dagger.Provides;

/**
 * Created by rakshakhegde on 26/04/17.
 */
@Module
public class MainModule {

	@Provides
	MainView mainView(MainActivity act) {
		return act;
	}
}
