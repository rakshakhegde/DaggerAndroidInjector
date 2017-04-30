[![BuddyBuild Continuous Integration](https://dashboard.buddybuild.com/api/statusImage?appID=5902e07342b8090001523d74&branch=kotlin&build=latest)](https://dashboard.buddybuild.com/apps/5902e07342b8090001523d74/build/latest?branch=kotlin)

# Dagger Android Injector - Kotlin

Sample project to demonstrate how to use the new [**dagger-android**](https://google.github.io/dagger/android.html) module in latest Dagger [v2.11-rc1](https://github.com/google/dagger/releases/tag/dagger-2.11-rc1). Along with [Proguard rules](https://github.com/rakshakhegde/DaggerAndroidInjector/blob/master/app/proguard-rules.pro#L27). Also shows [MVVM pattern](https://labs.ribot.co.uk/approaching-android-with-mvvm-8ceec02d5442) and [Unit Test](https://github.com/rakshakhegde/DaggerAndroidInjector/blob/master/app/src/test/java/me/rakshakhegde/dagger_android_injector/screens/main_screen/MainViewModelTest.java) setup with [Mockito](https://github.com/rakshakhegde/DaggerAndroidInjector/blob/master/app/build.gradle#L44) on the side.

### Show some :heart:
[![GitHub stars](https://img.shields.io/github/stars/rakshakhegde/DaggerAndroidInjector.svg?style=social&label=Star)](https://github.com/rakshakhegde/DaggerAndroidInjector) [![GitHub forks](https://img.shields.io/github/forks/rakshakhegde/DaggerAndroidInjector.svg?style=social&label=Fork)](https://github.com/rakshakhegde/DaggerAndroidInjector/fork) [![GitHub watchers](https://img.shields.io/github/watchers/rakshakhegde/DaggerAndroidInjector.svg?style=social&label=Watch)](https://github.com/rakshakhegde/DaggerAndroidInjector) [![GitHub followers](https://img.shields.io/github/followers/rakshakhegde.svg?style=social&label=Follow)](https://github.com/rakshakhegde)  
[![Twitter Follow](https://img.shields.io/twitter/follow/rakshakhegde.svg?style=social)](https://twitter.com/rakshakhegde)

## Motivation
Right now you maybe getting the Application instance from Activity and injecting ("hydrating") instances based off of that. But the latest version of dagger basically decouples your Activity from knowing who your `Injector` is.

So this sample project was built because I myself spent a bit of time getting **dagger-android** module setup at my company [Instavans](http://www.instavans.com/). There are things like getting all the correct library versions to work together. So here is a working starting point on how to use Dagger's `@ContributesAndroidInjector` which you can build upon.

*(click on the images to go to the source)*

<p align="center">

<a href="https://github.com/rakshakhegde/DaggerAndroidInjector/blob/master/app/src/main/java/me/rakshakhegde/dagger_android_injector/screens/main_screen/MainActivity.java#L30">
<img alt="MainActivity Demo" src="/ART/main_activity.png" width=600"></img>
</a>

<a href="https://github.com/rakshakhegde/DaggerAndroidInjector/blob/master/app/src/main/java/me/rakshakhegde/dagger_android_injector/dependencies/InjectorsModule.java#L14">
<img alt="Injectors Module Demo" src="/ART/injectors_module.png" width="600"></img>
</a>

</p>


## License

```txt
Copyright 2017 Rakshak R.Hegde

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
