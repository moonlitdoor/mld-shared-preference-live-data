package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences


/**
 * SharedPreferenceStringSetLiveData is a string set data holder class that can be observed within a given lifecycle which
 * is backed by a string set shared preference.
 *
 * @param sharedPreferences The Shared Preferences where the data will be stored
 * @param key The shared preference key
 * @param default The default value for the Shared Preference
 */
class SharedPreferenceStringSetLiveData(sharedPrefs: SharedPreferences, key: String, default: Set<String>) : SharedPreferenceLiveData<Set<String>>(sharedPrefs, key, default) {
  override fun getValueFromPreferences(key: String, default: Set<String>): MutableSet<String> = preferences.getStringSet(key, default) ?: mutableSetOf()
}