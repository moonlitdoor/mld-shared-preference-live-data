---
title: SharedPreferenceBooleanLiveData.<init> - shared-preference-live-data
---

[shared-preference-live-data](../../index.html) / [com.moonlitdoor.shared.preference.live.data](../index.html) / [SharedPreferenceBooleanLiveData](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`SharedPreferenceBooleanLiveData(sharedPrefs: `[`SharedPreferences`](https://developer.android.com/reference/android/content/SharedPreferences.html)`, key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)`

SharedPreferenceBooleanLiveData is a boolean data holder class that can be observed within a given lifecycle which
is backed by a boolean shared preference.

### Parameters

`sharedPreferences` - The Shared Preferences where the data will be stored

`key` - The shared preference key

`default` - The default value for the Shared Preference