package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences


/**
 * SharedPreferenceBooleanLiveData is a boolean data holder class that can be observed within a given lifecycle which
 * is backed by a boolean shared preference.
 *
 * @param sharedPreferences The Shared Preferences where the data will be stored
 * @param key The shared preference key
 * @param default The default value for the Shared Preference
 */
class SharedPreferenceBooleanLiveData(sharedPrefs: SharedPreferences, key: String, default: Boolean) : SharedPreferenceLiveData<Boolean>(sharedPrefs, key, default) {
  override fun getValueFromPreferences(key: String, default: Boolean): Boolean = preferences.getBoolean(key, default)
}