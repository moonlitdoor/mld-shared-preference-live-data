package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences

class SharedPreferenceStringSetLiveData(sharedPrefs: SharedPreferences, key: String, default: Set<String>) : SharedPreferenceLiveData<Set<String>>(sharedPrefs, key, default) {
  override fun getValueFromPreferences(key: String, default: Set<String>): MutableSet<String> = preferences.getStringSet(key, default) ?: mutableSetOf()
}