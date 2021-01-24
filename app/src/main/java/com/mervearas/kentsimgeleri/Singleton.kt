package com.mervearas.kentsimgeleri

import android.graphics.Bitmap

class Singleton {
    companion object Selected {
        var selectedImage : Bitmap? = null
    }
}