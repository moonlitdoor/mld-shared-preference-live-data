package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences


/**
 * SharedPreferenceStringNullableLiveData is a nullable string data holder class that can be observed within a given lifecycle which
 * is backed by a nullable string shared preference.
 *
 * @param sharedPreferences The Shared Preferences where the data will be stored
 * @param key The shared preference key
 * @param default The default value for the Shared Preference
 */
class SharedPreferenceStringNullableLiveData(sharedPrefs: SharedPreferences, key: String, default: String?) : SharedPreferenceLiveData<String?>(sharedPrefs, key, default) {
  override fun getValueFromPreferences(key: String, default: String?): String? = preferences.getString(key, default)
}
