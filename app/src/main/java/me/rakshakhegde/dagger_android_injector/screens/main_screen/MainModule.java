package me.rakshakhegde.dagger_android_injector.screens.main_screen;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/***
 * I am unable to get this equivalent code working in Kotlin. Help me pls!
 *
 * {@code
 *
 * @Module
 * abstract class MainModule {
 *
 *      @Binds
 *      abstract fun mainView(act: MainActivity): MainView
 *
 *      companion object {
 *          @Provides
 *          fun providesUnusedData(): String = "Unused Data"
 *      }
 *      // Add more @Provides here
 * }
 *
 * }
 */
@Module
public abstract class MainModule {

	@Binds
	abstract MainView mainView(MainActivity act);

	@Provides
	static String providesUnusedData() {
		return android.os.Build.MODEL;
	}

	// Add more @Provides here
}
