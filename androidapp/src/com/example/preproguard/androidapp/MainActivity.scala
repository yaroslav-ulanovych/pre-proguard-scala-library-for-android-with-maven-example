package com.example.preproguard.androidapp

import android.app.{AlertDialog, Activity}
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity extends Activity with HasLogger with ActivityLifecycleLogging {
  val TAG = "MainActivity"

  debug("<init>()")

  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main_activity)
    val button = findViewById(R.id.button).asInstanceOf[Button]
    button.setOnClickListener(new OnClickListener {
      def onClick(v: View) {
        val builder = new AlertDialog.Builder(MainActivity.this)
        builder.setMessage("Oh, no! Why did you do that?")
        val dialog = builder.create()
        dialog.show()
      }
    })
  }
}