package com.squareup.curtains.sample

import android.app.Activity
import android.os.Bundle
import android.view.View
import curtains.onWindowFocusChangedListeners
import curtains.window

class MainActivity : Activity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.main)
    val view = findViewById<View>(R.id.gone)
    view.window!!.onWindowFocusChangedListeners += { focusState ->
      if (focusState.focused) {
      }
    }
  }
}
