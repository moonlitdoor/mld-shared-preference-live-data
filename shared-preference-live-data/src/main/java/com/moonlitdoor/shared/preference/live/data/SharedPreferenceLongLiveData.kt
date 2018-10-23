package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences


/**
 * SharedPreferenceLongLiveData is a long data holder class that can be observed within a given lifecycle which
 * is backed by a long shared preference.
 *
 * @param sharedPreferences The Shared Preferences where the data will be stored
 * @param key The shared preference key
 * @param default The default value for the Shared Preference
 */
class SharedPreferenceLongLiveData(sharedPrefs: SharedPreferences, key: String, default: Long) : SharedPreferenceLiveData<Long>(sharedPrefs, key, default) {
  override fun getValueFromPreferences(key: String, default: Long): Long = preferences.getLong(key, default)
}