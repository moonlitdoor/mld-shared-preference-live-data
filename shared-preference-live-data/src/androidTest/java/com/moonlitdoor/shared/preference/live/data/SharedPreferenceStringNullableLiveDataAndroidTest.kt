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
class SharedPreferenceStringNullableLiveDataAndroidTest {

  private val preferences: SharedPreferences by lazy { PreferenceManager.getDefaultSharedPreferences(InstrumentationRegistry.getInstrumentation().context) }

  @Test
  fun givenNoExistingValue_whenTheLiveDataIsObserved_thenTheDefaultValueIsReturned() {
    val key = "com.moonlitdoor.shared.preference.live.data.SharedPreferenceStringNullableLiveDataAndroidTest.givenNoExistingValue_whenTheLiveDataIsObserved_thenTheDefaultValueIsReturned"
    val target = SharedPreferenceStringNullableLiveData(preferences, key, null)
    target.observeForever {
      assertEquals(null, it)
    }
  }

  @Test
  fun givenAnExistingValue_whenTheLiveDataIsObserved_thenTheExistingValueIsReturned() {
    val key = "com.moonlitdoor.shared.preference.live.data.SharedPreferenceStringNullableLiveDataAndroidTest.givenAnExistingValue_whenTheLiveDataIsObserved_thenTheExistingValueIsReturned"
    preferences.edit().putString(key, "one").commit()
    val target = preferences.liveData(key)
    target.observeForever {
      assertEquals("one", it)
      assertNotEquals(null, it)
    }
  }
}