package me.rakshakhegde.dagger_android_injector.screens.main_screen;

import javax.inject.Inject;

import me.rakshakhegde.dagger_android_injector.R;

/**
 * Created by rakshakhegde on 26/04/17.
 */

public class MainViewModel {

	private MainView V;

	@Inject
	MainViewModel(MainView V) {
		this.V = V;
	}

	public void showBtnClicked() {
		V.showMessage(R.string.showing_toast);
	}
}
