package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences
import androidx.lifecycle.LiveData


/**
 * SharedPreferenceLiveData is a generic data holder class that can be observed within a given lifecycle which
 * is backed by a shared preference.
 *
 * @param preferences The SharedPreferences where the data will be stored.
 * @param key The shared preference key.
 * @param default The default value for the shared preference.
 * @param <T> The type of data held by this instance.
 */
abstract class SharedPreferenceLiveData<T>(protected val preferences: SharedPreferences, private val key: String, private val default: T) : LiveData<T>(), SharedPreferences.OnSharedPreferenceChangeListener {

  /**
   * Called when the backing shared preference has changes while the an observer is in the active state.
   */
  override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences?, key: String?) {
    if (key == this.key) {
      value = getValueFromPreferences(key, default)
    }
  }

  /**
   * Gets the value from the shared preferences.
   */
  protected abstract fun getValueFromPreferences(key: String, default: T): T

  /**
   * This callback can be used to know that this LiveData is being used thus should be kept
   * up to date.
   */
  override fun onActive() {
    value = getValueFromPreferences(key, default)
    preferences.registerOnSharedPreferenceChangeListener(this)
  }

  /**
   * This callback can be used to know that there are no current observers in an active state.
   */
  override fun onInactive() {
    preferences.unregisterOnSharedPreferenceChangeListener(this)
  }
}