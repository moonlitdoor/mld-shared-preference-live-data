package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences
import android.preference.PreferenceManager
import androidx.test.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SharedPreferenceFloatLiveDataAndroidTest {

  private val preferences: SharedPreferences by lazy { PreferenceManager.getDefaultSharedPreferences(InstrumentationRegistry.getInstrumentation().context) }

  @Test
  fun givenNoExistingValue_whenTheLiveDataIsObserved_thenTheDefaultValueIsReturned() {
    val key = "com.moonlitdoor.shared.preference.live.data.SharedPreferenceFloatLiveDataAndroidTest.givenNoExistingValue_whenTheLiveDataIsObserved_thenTheDefaultValueIsReturned"
    val target = SharedPreferenceFloatLiveData(preferences, key, 1.0f)
    target.observeForever {
      assertEquals(1.0f, it)
    }
  }

  @Test
  fun givenAnExistingValue_whenTheLiveDataIsObserved_thenTheExistingValueIsReturned() {
    val key = "com.moonlitdoor.shared.preference.live.data.SharedPreferenceFloatLiveDataAndroidTest.givenAnExistingValue_whenTheLiveDataIsObserved_thenTheExistingValueIsReturned"
    preferences.edit().putFloat(key, 2.0f).commit()
    val target = preferences.liveData(key, 1.0f)
    target.observeForever {
      assertEquals(2.0f, it)
      assertNotEquals(1.0f, it)
    }
  }
}