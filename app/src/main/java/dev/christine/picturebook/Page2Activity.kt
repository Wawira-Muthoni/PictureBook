package dev.christine.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class Page2Activity : AppCompatActivity() {
    lateinit var btnPrevious:Button
    lateinit var btnnxt:Button
    lateinit var imgHouse:ImageButton
    lateinit var ethse1:EditText
    lateinit var ethse2:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        btnPrevious= findViewById(R.id.btnPrevious)
        btnnxt = findViewById(R.id.btnnxt)
        btnPrevious.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnnxt.setOnClickListener {
            val intent = Intent(this,Page3Activity::class.java)
            startActivity(intent)
        }

    }
}