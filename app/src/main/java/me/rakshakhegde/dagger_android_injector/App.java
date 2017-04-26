package me.rakshakhegde.dagger_android_injector;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by rakshakhegde on 26/04/17.
 */

public class App extends Application implements HasActivityInjector {

	@Inject
	DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

	@Override
	public void onCreate() {
		super.onCreate();

		DaggerAppComponent
				.builder()
				.app(this)
				.build()
				.inject(this);
	}

	@Override
	public AndroidInjector<Activity> activityInjector() {
		return dispatchingAndroidInjector;
	}
}
