package me.rakshakhegde.dagger_android_injector.dependencies;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import me.rakshakhegde.dagger_android_injector.App;

/**
 * Created by rakshakhegde on 26/04/17.
 */

@Singleton
@Component(modules = {
		InjectorsModule.class
})
public interface AppComponent extends AndroidInjector<App> {
}
