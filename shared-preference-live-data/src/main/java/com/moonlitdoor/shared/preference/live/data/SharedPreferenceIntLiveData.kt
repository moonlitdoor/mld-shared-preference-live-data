package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences

class SharedPreferenceIntLiveData(sharedPrefs: SharedPreferences, key: String, default: Int) : SharedPreferenceLiveData<Int>(sharedPrefs, key, default) {
  override fun getValueFromPreferences(key: String, default: Int): Int = preferences.getInt(key, default)
}