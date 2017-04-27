package me.rakshakhegde.dagger_android_injector.screens.main_screen;

import org.junit.Test;

import me.rakshakhegde.dagger_android_injector.R;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by rakshakhegde on 27/04/17.
 */
public class MainViewModelTest {

	@Test
	public void showBtnClicked() throws Exception {
		// Setup
		MainView mockView = mock(MainView.class);

		// Wiring
		MainViewModel VM = new MainViewModel(mockView);
		VM.showBtnClicked();

		// Verify
		verify(mockView).showMessage(R.string.showing_toast);
	}

}
