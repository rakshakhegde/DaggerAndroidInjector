package me.rakshakhegde.dagger_android_injector

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import me.rakshakhegde.dagger_android_injector.dependencies.DaggerAppComponent
import javax.inject.Inject


/**
 * Created by rakshakhegde on 26/04/17.
 */

class App : Application(), HasActivityInjector {

	@Inject
	lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

	override fun onCreate() {
		super.onCreate()

		DaggerAppComponent
				.builder()
				.app(this)
				.build()
				.inject(this)
	}

	override fun activityInjector() = dispatchingAndroidInjector
}
