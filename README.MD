# Dagger Android Injector

Sample project to demonstrate how to use the new [**dagger-module**](https://google.github.io/dagger/android.html) in latest Dagger v2.11-rc1. Also shows MVVM and Unit Test setup with Mockito on the side.

### Show some :heart:
[![GitHub stars](https://img.shields.io/github/stars/rakshakhegde/DaggerAndroidInjector.svg?style=social&label=Star)](https://github.com/rakshakhegde/DaggerAndroidInjector) [![GitHub forks](https://img.shields.io/github/forks/rakshakhegde/DaggerAndroidInjector.svg?style=social&label=Fork)](https://github.com/rakshakhegde/DaggerAndroidInjector/fork) [![GitHub watchers](https://img.shields.io/github/watchers/rakshakhegde/DaggerAndroidInjector.svg?style=social&label=Watch)](https://github.com/rakshakhegde/DaggerAndroidInjector) [![GitHub followers](https://img.shields.io/github/followers/rakshakhegde.svg?style=social&label=Follow)](https://github.com/rakshakhegde)  
[![Twitter Follow](https://img.shields.io/twitter/follow/rakshakhegde.svg?style=social)](https://twitter.com/rakshakhegde)

## Motivation
Right now you maybe getting the Application instance from Activity and injecting ("hydrating") instances based off of that. But the latest version of dagger basically decouples your Activity from knowing who your `Injector` is.

So this sample project was built because I myself spent a bit of time getting **dagger-android** module setup. There are things like getting all the correct library versions to work together. So here is a working demo on how to use Dagger's `@ContributesAndroidInjector` introduced in version **2.11-rc1**.

<p align="center">

<a href="https://github.com/rakshakhegde/DaggerAndroidInjector/blob/master/app/src/main/java/me/rakshakhegde/dagger_android_injector/screens/main_screen/MainActivity.java#L30">
<img alt="MainActivity Demo" src="/ART/main_activity.png" width="800"></img>
</a>

<a href="https://github.com/rakshakhegde/DaggerAndroidInjector/blob/master/app/src/main/java/me/rakshakhegde/dagger_android_injector/dependencies/InjectorsModule.java#L14">
<img alt="Injectors Module Demo" src="/ART/injectors_module.png" width="600"></img>
</a>

</p>
