package me.rakshakhegde.dagger_android_injector.screens.main_screen

import me.rakshakhegde.dagger_android_injector.R
import javax.inject.Inject

/**
 * Created by rakshakhegde on 26/04/17.
 */

class MainViewModel @Inject constructor(private val V: MainView) {

	fun showBtnClicked() = V.showMessage(R.string.showing_toast)
}
