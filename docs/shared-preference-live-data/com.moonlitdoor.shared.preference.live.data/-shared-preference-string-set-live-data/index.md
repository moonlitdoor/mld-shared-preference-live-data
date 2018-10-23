---
title: SharedPreferenceStringSetLiveData - shared-preference-live-data
---

[shared-preference-live-data](../../index.html) / [com.moonlitdoor.shared.preference.live.data](../index.html) / [SharedPreferenceStringSetLiveData](./index.html)

# SharedPreferenceStringSetLiveData

`class SharedPreferenceStringSetLiveData : `[`SharedPreferenceLiveData`](../-shared-preference-live-data/index.html)`<`[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>>`

SharedPreferenceStringSetLiveData is a string set data holder class that can be observed within a given lifecycle which
is backed by a string set shared preference.

### Parameters

`sharedPreferences` - The Shared Preferences where the data will be stored

`key` - The shared preference key

`default` - The default value for the Shared Preference

### Constructors

| [&lt;init&gt;](-init-.html) | `SharedPreferenceStringSetLiveData(sharedPrefs: `[`SharedPreferences`](https://developer.android.com/reference/android/content/SharedPreferences.html)`, key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>SharedPreferenceStringSetLiveData is a string set data holder class that can be observed within a given lifecycle which is backed by a string set shared preference. |

### Inherited Properties

| [preferences](../-shared-preference-live-data/preferences.html) | `val preferences: `[`SharedPreferences`](https://developer.android.com/reference/android/content/SharedPreferences.html)<br>The SharedPreferences where the data will be stored. |

### Functions

| [getValueFromPreferences](get-value-from-preferences.html) | `fun getValueFromPreferences(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>): `[`MutableSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<br>Gets the value from the shared preferences. |

### Inherited Functions

| [onActive](../-shared-preference-live-data/on-active.html) | `open fun onActive(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>This callback can be used to know that this LiveData is being used thus should be kept up to date. |
| [onInactive](../-shared-preference-live-data/on-inactive.html) | `open fun onInactive(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>This callback can be used to know that there are no current observers in an active state. |
| [onSharedPreferenceChanged](../-shared-preference-live-data/on-shared-preference-changed.html) | `open fun onSharedPreferenceChanged(sharedPreferences: `[`SharedPreferences`](https://developer.android.com/reference/android/content/SharedPreferences.html)`?, key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Called when the backing shared preference has changes while the an observer is in the active state. |
