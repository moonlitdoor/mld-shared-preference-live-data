---
title: SharedPreferenceFloatLiveData - shared-preference-live-data
---

[shared-preference-live-data](../../index.html) / [com.moonlitdoor.shared.preference.live.data](../index.html) / [SharedPreferenceFloatLiveData](./index.html)

# SharedPreferenceFloatLiveData

`class SharedPreferenceFloatLiveData : `[`SharedPreferenceLiveData`](../-shared-preference-live-data/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>`

SharedPreferenceFloatLiveData is a float data holder class that can be observed within a given lifecycle which
is backed by a float shared preference.

### Parameters

`sharedPreferences` - The Shared Preferences where the data will be stored

`key` - The shared preference key

`default` - The default value for the Shared Preference

### Constructors

| [&lt;init&gt;](-init-.html) | `SharedPreferenceFloatLiveData(sharedPrefs: `[`SharedPreferences`](https://developer.android.com/reference/android/content/SharedPreferences.html)`, key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`)`<br>SharedPreferenceFloatLiveData is a float data holder class that can be observed within a given lifecycle which is backed by a float shared preference. |

### Inherited Properties

| [preferences](../-shared-preference-live-data/preferences.html) | `val preferences: `[`SharedPreferences`](https://developer.android.com/reference/android/content/SharedPreferences.html)<br>The SharedPreferences where the data will be stored. |

### Functions

| [getValueFromPreferences](get-value-from-preferences.html) | `fun getValueFromPreferences(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`): `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Gets the value from the shared preferences. |

### Inherited Functions

| [onActive](../-shared-preference-live-data/on-active.html) | `open fun onActive(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>This callback can be used to know that this LiveData is being used thus should be kept up to date. |
| [onInactive](../-shared-preference-live-data/on-inactive.html) | `open fun onInactive(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>This callback can be used to know that there are no current observers in an active state. |
| [onSharedPreferenceChanged](../-shared-preference-live-data/on-shared-preference-changed.html) | `open fun onSharedPreferenceChanged(sharedPreferences: `[`SharedPreferences`](https://developer.android.com/reference/android/content/SharedPreferences.html)`?, key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Called when the backing shared preference has changes while the an observer is in the active state. |

