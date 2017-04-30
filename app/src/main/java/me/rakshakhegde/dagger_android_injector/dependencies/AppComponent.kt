package me.rakshakhegde.dagger_android_injector.dependencies

import dagger.BindsInstance
import dagger.Component
import me.rakshakhegde.dagger_android_injector.App
import javax.inject.Singleton

/**
 * Created by rakshakhegde on 26/04/17.
 */

@Singleton
@Component(modules = arrayOf(InjectorsModule::class))
interface AppComponent {

	fun inject(app: App)

	@Component.Builder
	interface Builder {

		@BindsInstance
		fun app(application: App): Builder

		fun build(): AppComponent
	}
}
