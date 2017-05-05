package me.rakshakhegde.dagger_android_injector.dependencies

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import me.rakshakhegde.dagger_android_injector.App
import javax.inject.Singleton

/**
 * Created by rakshakhegde on 26/04/17.
 */

@Singleton
@Component(modules = arrayOf(
		AndroidSupportInjectionModule::class,
		InjectorsModule::class
))
interface AppComponent : AndroidInjector<App> {

	@Component.Builder
	abstract class Builder : AndroidInjector.Builder<App>()
}
