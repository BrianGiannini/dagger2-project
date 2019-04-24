package io.train.dagger2training

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(engine: Engine, wheels: Wheels) {

    companion object {
        const val tag = "Car"
    }

    fun drive() {
        Log.d(tag, "driving...")
    }
}