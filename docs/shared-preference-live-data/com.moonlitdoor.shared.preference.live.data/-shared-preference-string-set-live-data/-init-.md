---
title: SharedPreferenceStringSetLiveData.<init> - shared-preference-live-data
---

[shared-preference-live-data](../../index.html) / [com.moonlitdoor.shared.preference.live.data](../index.html) / [SharedPreferenceStringSetLiveData](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`SharedPreferenceStringSetLiveData(sharedPrefs: `[`SharedPreferences`](https://developer.android.com/reference/android/content/SharedPreferences.html)`, key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`

SharedPreferenceStringSetLiveData is a string set data holder class that can be observed within a given lifecycle which
is backed by a string set shared preference.

### Parameters

`sharedPreferences` - The Shared Preferences where the data will be stored

`key` - The shared preference key

`default` - The default value for the Shared Preference