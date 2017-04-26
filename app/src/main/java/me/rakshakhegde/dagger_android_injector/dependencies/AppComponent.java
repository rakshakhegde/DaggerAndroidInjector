package me.rakshakhegde.dagger_android_injector.dependencies;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import me.rakshakhegde.dagger_android_injector.App;

/**
 * Created by rakshakhegde on 26/04/17.
 */

@Singleton
@Component(modules = {
		InjectorsModule.class
})
public interface AppComponent {

	void inject(App app);

	@Component.Builder
	interface Builder {

		@BindsInstance
		Builder app(App application);

		AppComponent build();
	}
}
