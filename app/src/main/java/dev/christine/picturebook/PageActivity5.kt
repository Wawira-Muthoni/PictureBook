package dev.christine.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class PageActivity5 : AppCompatActivity() {
    lateinit var btnpreviouss:Button
    lateinit var imgbible:ImageButton
    lateinit var etbible1:EditText
    lateinit var etbible2:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)
        btnpreviouss = findViewById(R.id.btnpreviouss)
        btnpreviouss.setOnClickListener {
            val intent = Intent(this,Page4Activity::class.java)
            startActivity(intent)
        }

    }
}