package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences

class SharedPreferenceStringLiveData(sharedPrefs: SharedPreferences, key: String, default: String) : SharedPreferenceLiveData<String>(sharedPrefs, key, default) {
  override fun getValueFromPreferences(key: String, default: String): String = preferences.getString(key, default) ?: ""
}