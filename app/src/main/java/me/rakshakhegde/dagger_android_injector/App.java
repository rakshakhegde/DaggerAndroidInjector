package me.rakshakhegde.dagger_android_injector;

import dagger.android.DaggerApplication;
import me.rakshakhegde.dagger_android_injector.dependencies.AppComponent;
import me.rakshakhegde.dagger_android_injector.dependencies.DaggerAppComponent;
//import me.rakshakhegde.dagger_android_injector.dependencies.DaggerAppComponent;


/**
 * Created by rakshakhegde on 26/04/17.
 */

public class App extends DaggerApplication {

	@Override
	protected AppComponent applicationInjector() {
		return DaggerAppComponent.create();
	}
}
