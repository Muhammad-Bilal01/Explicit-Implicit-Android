package com.practice.explicitimplicitintents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Explicit Card
        val explicitCard = findViewById<CardView>(R.id.card_explicit)
        explicitCard.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        val webCard = findViewById<CardView>(R.id.card_web)
        webCard.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/Muhammad-Bilal01")
            startActivity(intent)
        }

        val cameraCard = findViewById<CardView>(R.id.card_camera)
        cameraCard.setOnClickListener{
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

    }
}