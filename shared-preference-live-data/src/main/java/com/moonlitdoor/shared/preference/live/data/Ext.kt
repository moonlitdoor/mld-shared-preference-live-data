package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences

fun SharedPreferences.liveData(key: String, default: Int) = SharedPreferenceIntLiveData(this, key, default)

fun SharedPreferences.liveData(key: String, default: String) = SharedPreferenceStringLiveData(this, key, default)

fun SharedPreferences.liveData(key: String) = SharedPreferenceStringNullableLiveData(this, key, null)

fun SharedPreferences.liveData(key: String, default: Boolean) = SharedPreferenceBooleanLiveData(this, key, default)

fun SharedPreferences.liveData(key: String, default: Float) = SharedPreferenceFloatLiveData(this, key, default)

fun SharedPreferences.liveData(key: String, default: Long) = SharedPreferenceLongLiveData(this, key, default)

fun SharedPreferences.liveData(key: String, default: Set<String>) = SharedPreferenceStringSetLiveData(this, key, default)