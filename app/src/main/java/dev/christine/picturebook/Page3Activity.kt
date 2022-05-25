package dev.christine.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class Page3Activity : AppCompatActivity() {
    lateinit var btnprv:Button
    lateinit var btnnext:Button
    lateinit var imgGirl:ImageButton
    lateinit var etfashion1:EditText
    lateinit var etfashion2:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        btnprv= findViewById(R.id.btnprv)
        btnnext = findViewById(R.id.btnnext)
        btnprv.setOnClickListener {
            val intent = Intent(this,Page2Activity::class.java)
            startActivity(intent)
        }
        btnnext.setOnClickListener {
            val intent = Intent(this,Page4Activity::class.java)
            startActivity(intent)
        }

    }
}