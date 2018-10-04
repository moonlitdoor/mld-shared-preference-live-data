package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences

class SharedPreferenceBooleanLiveData(sharedPrefs: SharedPreferences, key: String, default: Boolean) : SharedPreferenceLiveData<Boolean>(sharedPrefs, key, default) {
  override fun getValueFromPreferences(key: String, default: Boolean): Boolean = preferences.getBoolean(key, default)
}