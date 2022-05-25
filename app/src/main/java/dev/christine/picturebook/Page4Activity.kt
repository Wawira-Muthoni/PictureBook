package dev.christine.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class Page4Activity : AppCompatActivity() {
    lateinit var btnPrv:Button
    lateinit var btnNext4:Button
    lateinit var etfruit1:EditText
    lateinit var etfruit2:EditText
    lateinit var imgfruit:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        btnPrv= findViewById(R.id.btnPrv)
        btnNext4 = findViewById(R.id.btnNext4)
        btnPrv.setOnClickListener {
            val intent = Intent(this,Page3Activity::class.java)
            startActivity(intent)
        }
        btnNext4.setOnClickListener {
            val intent = Intent(this,PageActivity5::class.java)
            startActivity(intent)
        }

    }
}