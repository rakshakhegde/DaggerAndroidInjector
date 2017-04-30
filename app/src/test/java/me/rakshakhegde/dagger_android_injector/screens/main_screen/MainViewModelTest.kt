package me.rakshakhegde.dagger_android_injector.screens.main_screen

import me.rakshakhegde.dagger_android_injector.R
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

/**
 * Created by rakshakhegde on 27/04/17.
 */
class MainViewModelTest {

	@Test
	fun showBtnClicked() {
		// Setup
		val mockView = mock(MainView::class.java)

		// Wiring
		val VM = MainViewModel(mockView)
		VM.showBtnClicked()

		// Verify
		verify(mockView).showMessage(R.string.showing_toast)
	}

}
