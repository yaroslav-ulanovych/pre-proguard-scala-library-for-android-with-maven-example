package com.example.preproguard.androidapp

import android.util.Log

trait HasLogger {
  self: {
    val TAG: String
  } =>

  val debug = Log.d(TAG, _: String)
}
