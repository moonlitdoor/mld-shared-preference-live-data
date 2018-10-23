---
title: SharedPreferenceLiveData - shared-preference-live-data
---

[shared-preference-live-data](../../index.html) / [com.moonlitdoor.shared.preference.live.data](../index.html) / [SharedPreferenceLiveData](./index.html)

# SharedPreferenceLiveData

`abstract class SharedPreferenceLiveData<T> : LiveData<`[`T`](index.html#T)`>, `[`OnSharedPreferenceChangeListener`](https://developer.android.com/reference/android/content/SharedPreferences/OnSharedPreferenceChangeListener.html)

SharedPreferenceLiveData is a generic data holder class that can be observed within a given lifecycle which
is backed by a shared preference.

### Parameters

`preferences` - The SharedPreferences where the data will be stored.

`key` - The shared preference key.

`default` - The default value for the shared preference.

**Parameters**

### Constructors

| [&lt;init&gt;](-init-.html) | `SharedPreferenceLiveData(preferences: `[`SharedPreferences`](https://developer.android.com/reference/android/content/SharedPreferences.html)`, key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`T`](index.html#T)`)`<br>SharedPreferenceLiveData is a generic data holder class that can be observed within a given lifecycle which is backed by a shared preference. |

### Properties

| [preferences](preferences.html) | `val preferences: `[`SharedPreferences`](https://developer.android.com/reference/android/content/SharedPreferences.html)<br>The SharedPreferences where the data will be stored. |

### Functions

| [getValueFromPreferences](get-value-from-preferences.html) | `abstract fun getValueFromPreferences(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, default: `[`T`](index.html#T)`): `[`T`](index.html#T)<br>Gets the value from the shared preferences. |
| [onActive](on-active.html) | `open fun onActive(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>This callback can be used to know that this LiveData is being used thus should be kept up to date. |
| [onInactive](on-inactive.html) | `open fun onInactive(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>This callback can be used to know that there are no current observers in an active state. |
| [onSharedPreferenceChanged](on-shared-preference-changed.html) | `open fun onSharedPreferenceChanged(sharedPreferences: `[`SharedPreferences`](https://developer.android.com/reference/android/content/SharedPreferences.html)`?, key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Called when the backing shared preference has changes while the an observer is in the active state. |

### Inheritors

| [SharedPreferenceBooleanLiveData](../-shared-preference-boolean-live-data/index.html) | `class SharedPreferenceBooleanLiveData : `[`SharedPreferenceLiveData`](./index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>SharedPreferenceBooleanLiveData is a boolean data holder class that can be observed within a given lifecycle which is backed by a boolean shared preference. |
| [SharedPreferenceFloatLiveData](../-shared-preference-float-live-data/index.html) | `class SharedPreferenceFloatLiveData : `[`SharedPreferenceLiveData`](./index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>`<br>SharedPreferenceFloatLiveData is a float data holder class that can be observed within a given lifecycle which is backed by a float shared preference. |
| [SharedPreferenceIntLiveData](../-shared-preference-int-live-data/index.html) | `class SharedPreferenceIntLiveData : `[`SharedPreferenceLiveData`](./index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`<br>SharedPreferenceIntLiveData is a int data holder class that can be observed within a given lifecycle which is backed by a int shared preference. |
| [SharedPreferenceLongLiveData](../-shared-preference-long-live-data/index.html) | `class SharedPreferenceLongLiveData : `[`SharedPreferenceLiveData`](./index.html)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>`<br>SharedPreferenceLongLiveData is a long data holder class that can be observed within a given lifecycle which is backed by a long shared preference. |
| [SharedPreferenceStringLiveData](../-shared-preference-string-live-data/index.html) | `class SharedPreferenceStringLiveData : `[`SharedPreferenceLiveData`](./index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>`<br>SharedPreferenceStringLiveData is a string data holder class that can be observed within a given lifecycle which is backed by a string shared preference. |
| [SharedPreferenceStringNullableLiveData](../-shared-preference-string-nullable-live-data/index.html) | `class SharedPreferenceStringNullableLiveData : `[`SharedPreferenceLiveData`](./index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?>`<br>SharedPreferenceStringNullableLiveData is a nullable string data holder class that can be observed within a given lifecycle which is backed by a nullable string shared preference. |
| [SharedPreferenceStringSetLiveData](../-shared-preference-string-set-live-data/index.html) | `class SharedPreferenceStringSetLiveData : `[`SharedPreferenceLiveData`](./index.html)`<`[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>>`<br>SharedPreferenceStringSetLiveData is a string set data holder class that can be observed within a given lifecycle which is backed by a string set shared preference. |

