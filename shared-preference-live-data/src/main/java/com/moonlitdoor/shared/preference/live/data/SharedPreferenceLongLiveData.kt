package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences

class SharedPreferenceLongLiveData(sharedPrefs: SharedPreferences, key: String, default: Long) : SharedPreferenceLiveData<Long>(sharedPrefs, key, default) {
  override fun getValueFromPreferences(key: String, default: Long): Long = preferences.getLong(key, default)
}