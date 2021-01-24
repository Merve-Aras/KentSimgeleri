package com.mervearas.kentsimgeleri

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var simgeName = ArrayList<String>()
        simgeName.add("Pisa")
        simgeName.add("Colloseum")
        simgeName.add("Eiffel")
        simgeName.add("London Bridge")

        //IMAGE 1.YOL
        /*
        val pisa = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.pisa)
        val colleseum = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.collesium)
        val eiffel = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.eiffel)
        val londonBridge = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.londonbridge)

        var simgelerImages = ArrayList<Bitmap>()
        simgelerImages.add(pisa)
        simgelerImages.add(colleseum)
        simgelerImages.add(eiffel)
        simgelerImages.add(londonBridge)
         */

        //IMAGE 2.YOL (DAHA VERİMLİ) id tanımlaması ile yapıldı.

        val pisaId = R.drawable.pisa
        val colleseumId = R.drawable.collesium
        val eiffelId = R.drawable.eiffel
        val londonBridgeId = R.drawable.londonbridge

        var simgeId = ArrayList<Int>()
        simgeId.add(pisaId)
        simgeId.add(colleseumId)
        simgeId.add(eiffelId)
        simgeId.add(londonBridgeId)

        //Liste oluşturmak için adapter'e ihtiyacımız var bu adaptör bize layout ve data soruyor. Adapter bize hangi veriyi hangi tasarımda göstereceğini sorar
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, simgeName)  //sırasıyla contex, datanın gösterileceği layout çeşidi, gösterilecek data.
        listView.adapter = adapter //listview adapter'ı ile yukarıda bizim tanımladığımız adapter biribirine bağlanmış oldu.
        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->  //listview'a tıklanınca ne olacağını bu kod ile yazabiliriz. Position değeri liste indexleriyle aynıdır. Yani listede neye tıklarsak o index numarası position'a aktarılır.

            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("name",simgeName[position])
            intent.putExtra("image",simgeId[position])
            /*
            val singleton = Singleton.Selected
            singleton.selectedImage = simgelerImages[position]
             */
            startActivity(intent)
        }
    }
}