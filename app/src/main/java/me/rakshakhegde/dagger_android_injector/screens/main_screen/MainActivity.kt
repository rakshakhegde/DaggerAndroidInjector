package me.rakshakhegde.dagger_android_injector.screens.main_screen

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import me.rakshakhegde.dagger_android_injector.R
import me.rakshakhegde.dagger_android_injector.databinding.ActivityMainBinding
import org.jetbrains.anko.act
import org.jetbrains.anko.longToast
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {

	/**
	 * MVVM pattern
	 */
	@Inject
	lateinit var VM: MainViewModel

	override fun onCreate(savedInstanceState: Bundle?) {

		/*
		  Make sure you're injecting before onCreate. Order matters if using Fragments.
		  On Activity restore, if injection is done after onCreate, app could crash if Fragments
		  try to inject first.

		  Good practice in Kotlin to always be specific as to what `this` is.
		 */
		AndroidInjection.inject(this@MainActivity)

		super.onCreate(savedInstanceState)

		val binding: ActivityMainBinding = DataBindingUtil
				.setContentView(act, R.layout.activity_main)
		binding.vm = VM
	}

	override fun showMessage(message: Int) = longToast(message)
}
