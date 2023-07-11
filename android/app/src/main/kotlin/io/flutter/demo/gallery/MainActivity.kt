package io.flutter.demo.gallery

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
    super.onCreate(savedInstanceState)
        AppCenter.start(getApplication(), "{aa9dae02-31f7-459c-9082-2842cea9209a}",
                Analytics::class.java, Crashes::class.java)
}
