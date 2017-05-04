package me.rakshakhegde.dagger_android_injector;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
//import me.rakshakhegde.dagger_android_injector.dependencies.DaggerAppComponent;


/**
 * Created by rakshakhegde on 26/04/17.
 */

public class App extends DaggerApplication {

	@Override
	protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
		return null;
	}
}
