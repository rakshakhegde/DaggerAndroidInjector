package me.rakshakhegde.dagger_android_injector.dependencies;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import me.rakshakhegde.dagger_android_injector.App;

/**
 * Created by rakshakhegde on 26/04/17.
 */

@Singleton
@Component(modules = {
		AndroidSupportInjectionModule.class,
		BuildersModule.class,
		NetworkModule.class
})
public interface AppComponent {

	public void inject(App app);

	@Component.Builder
	public interface Builder {

		@BindsInstance
		public Builder app(App app);

		public AppComponent build();
	}
}
