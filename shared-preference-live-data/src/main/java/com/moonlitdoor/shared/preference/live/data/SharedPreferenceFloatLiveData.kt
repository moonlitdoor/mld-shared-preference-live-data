package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences

class SharedPreferenceFloatLiveData(sharedPrefs: SharedPreferences, key: String, default: Float) : SharedPreferenceLiveData<Float>(sharedPrefs, key, default) {
  override fun getValueFromPreferences(key: String, default: Float): Float = preferences.getFloat(key, default)
}