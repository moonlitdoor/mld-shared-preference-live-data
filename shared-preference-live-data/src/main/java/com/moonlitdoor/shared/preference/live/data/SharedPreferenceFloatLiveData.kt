package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences


/**
 * SharedPreferenceFloatLiveData is a float data holder class that can be observed within a given lifecycle which
 * is backed by a float shared preference.
 *
 * @param sharedPreferences The Shared Preferences where the data will be stored
 * @param key The shared preference key
 * @param default The default value for the Shared Preference
 */
class SharedPreferenceFloatLiveData(sharedPrefs: SharedPreferences, key: String, default: Float) : SharedPreferenceLiveData<Float>(sharedPrefs, key, default) {
  override fun getValueFromPreferences(key: String, default: Float): Float = preferences.getFloat(key, default)
}