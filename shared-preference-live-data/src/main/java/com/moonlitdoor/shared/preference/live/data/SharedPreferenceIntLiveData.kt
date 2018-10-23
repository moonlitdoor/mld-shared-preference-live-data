package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences


/**
 * SharedPreferenceIntLiveData is a int data holder class that can be observed within a given lifecycle which
 * is backed by a int shared preference.
 *
 * @param sharedPreferences The Shared Preferences where the data will be stored
 * @param key The shared preference key
 * @param default The default value for the Shared Preference
 */
class SharedPreferenceIntLiveData(sharedPrefs: SharedPreferences, key: String, default: Int) : SharedPreferenceLiveData<Int>(sharedPrefs, key, default) {
  override fun getValueFromPreferences(key: String, default: Int): Int = preferences.getInt(key, default)
}