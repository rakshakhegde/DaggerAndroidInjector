package me.rakshakhegde.dagger_android_injector.screens.main_screen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import dagger.android.AndroidInjection;
import me.rakshakhegde.dagger_android_injector.R;

public class MainActivity extends AppCompatActivity implements MainView {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		AndroidInjection.inject(this);

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
}
