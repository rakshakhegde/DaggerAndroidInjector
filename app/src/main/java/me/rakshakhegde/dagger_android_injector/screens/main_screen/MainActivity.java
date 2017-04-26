package me.rakshakhegde.dagger_android_injector.screens.main_screen;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import me.rakshakhegde.dagger_android_injector.R;
import me.rakshakhegde.dagger_android_injector.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements MainView {

	/**
	 * MVVM pattern
	 */
	@Inject
	MainViewModel VM;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		/*
		  Make sure you're injecting before onCreate. Order matters if using Fragments.
		  On Activity restore, if injection is done after onCreate, app could crash if Fragments
		  try to inject first.
		 */
		AndroidInjection.inject(this);

		super.onCreate(savedInstanceState);

		ActivityMainBinding binding = DataBindingUtil.setContentView(this,
				R.layout.activity_main);
		binding.setVM(VM);
	}

	@Override
	public void showMessage(int message) {
		Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
	}
}
