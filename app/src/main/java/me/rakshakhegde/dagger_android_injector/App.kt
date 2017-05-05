package me.rakshakhegde.dagger_android_injector

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import me.rakshakhegde.dagger_android_injector.dependencies.DaggerAppComponent


/**
 * Created by rakshakhegde on 26/04/17.
 */

class App : DaggerApplication() {

	override fun applicationInjector(): AndroidInjector<App> = DaggerAppComponent
			.builder()
			.create(this@App)
}
