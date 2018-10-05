package com.moonlitdoor.shared.preference.live.data

import android.content.SharedPreferences
import android.preference.PreferenceManager
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SharedPreferenceStringLiveDataTest {

  private val preferences: SharedPreferences by lazy { PreferenceManager.getDefaultSharedPreferences(InstrumentationRegistry.getInstrumentation().context) }

  @Test
  fun givenNoExistingValue_whenTheLiveDataIsObserved_thenTheDefaultValueIsReturned() {
    val key = "com.moonlitdoor.shared.preference.live.data.SharedPreferenceStringLiveDataTest.givenNoExistingValue_whenTheLiveDataIsObserved_thenTheDefaultValueIsReturned"
    val target = SharedPreferenceStringLiveData(preferences, key, "one")
    target.observeForever {
      assertEquals("one", it)
    }
  }

  @Test
  fun givenAnExistingValue_whenTheLiveDataIsObserved_thenTheExistingValueIsReturned() {
    val key = "com.moonlitdoor.shared.preference.live.data.SharedPreferenceStringLiveDataTest.givenAnExistingValue_whenTheLiveDataIsObserved_thenTheExistingValueIsReturned"
    preferences.edit().putString(key, "two").commit()
    val target = preferences.liveData(key, "one")
    target.observeForever {
      assertEquals("two", it)
      assertNotEquals("one", it)
    }
  }
}