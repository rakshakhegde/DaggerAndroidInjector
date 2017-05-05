package me.rakshakhegde.dagger_android_injector.dependencies;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import me.rakshakhegde.dagger_android_injector.App;

/**
 * Created by rakshakhegde on 26/04/17.
 */

@Singleton
@Component(modules = {
		AndroidSupportInjectionModule.class,
		InjectorsModule.class
})
public interface AppComponent extends AndroidInjector<App> {

	@Component.Builder
	abstract class Builder extends AndroidInjector.Builder<App> {
	}
}
