package com.mervearas.kentsimgeleri

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent = intent
        val simgeName = intent.getStringExtra("name")
        textView.text = simgeName
        val simgeId = intent.getIntExtra("image",0)
        

        /*
        //Image 1.Yolun
        val singleton = Singleton.Selected
        val selectedBitmap = singleton.selectedImage
        imageView.setImageBitmap(selectedBitmap)
         */

        //Image 2.yolun
        val selectedBitmap = BitmapFactory.decodeResource(applicationContext.resources,simgeId)
        imageView.setImageBitmap(selectedBitmap)

    }
}