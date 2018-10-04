package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences
import androidx.lifecycle.LiveData

internal abstract class SharedPreferenceLiveData<T>(val preferences: SharedPreferences, val key: String, private val default: T) : LiveData<T>(), SharedPreferences.OnSharedPreferenceChangeListener {

  override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences?, key: String?) {
    if (key == this.key) {
      value = getValueFromPreferences(key, default)
    }
  }

  abstract fun getValueFromPreferences(key: String, default: T): T

  override fun onActive() {
    value = getValueFromPreferences(key, default)
    preferences.registerOnSharedPreferenceChangeListener(this)
  }

  override fun onInactive() {
    preferences.unregisterOnSharedPreferenceChangeListener(this)
  }
}