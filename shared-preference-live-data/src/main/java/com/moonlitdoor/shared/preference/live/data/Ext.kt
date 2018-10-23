package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences

/**
 * Creates a [SharedPreferenceIntLiveData] using the given SharedPreferences
 */
fun SharedPreferences.liveData(key: String, default: Int) = SharedPreferenceIntLiveData(this, key, default)

/**
 * Creates a [SharedPreferenceStringLiveData] using the given SharedPreferences
 */
fun SharedPreferences.liveData(key: String, default: String) = SharedPreferenceStringLiveData(this, key, default)

/**
 * Creates a [SharedPreferenceStringNullableLiveData] using the given SharedPreferences
 */
fun SharedPreferences.liveData(key: String) = SharedPreferenceStringNullableLiveData(this, key, null)

/**
 * Creates a [SharedPreferenceBooleanLiveData] using the given SharedPreferences
 */
fun SharedPreferences.liveData(key: String, default: Boolean) = SharedPreferenceBooleanLiveData(this, key, default)

/**
 * Creates a [SharedPreferenceFloatLiveData] using the given SharedPreferences
 */
fun SharedPreferences.liveData(key: String, default: Float) = SharedPreferenceFloatLiveData(this, key, default)

/**
 * Creates a [SharedPreferenceLongLiveData] using the given SharedPreferences
 */
fun SharedPreferences.liveData(key: String, default: Long) = SharedPreferenceLongLiveData(this, key, default)

/**
 * Creates a [SharedPreferenceStringSetLiveData] using the given SharedPreferences
 */
fun SharedPreferences.liveData(key: String, default: Set<String>) = SharedPreferenceStringSetLiveData(this, key, default)