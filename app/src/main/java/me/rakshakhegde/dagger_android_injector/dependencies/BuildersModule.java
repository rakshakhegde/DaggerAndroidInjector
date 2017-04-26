package me.rakshakhegde.dagger_android_injector.dependencies;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import me.rakshakhegde.dagger_android_injector.screens.main_screen.MainActivity;

/**
 * Created by rakshakhegde on 26/04/17.
 */
@Module
public abstract class BuildersModule {

	@ContributesAndroidInjector
	abstract MainActivity mainActivity();
}
