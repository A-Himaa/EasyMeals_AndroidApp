package com.example.easimeals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home) // Make sure this XML file exists

        // Find all ImageViews
        val imageViewMonday: ImageView = findViewById(R.id.imageView7)
        val imageViewTuesday: ImageView = findViewById(R.id.imageView8)
        val imageViewWednesday: ImageView = findViewById(R.id.imageView9)
        val imageViewThursday: ImageView = findViewById(R.id.imageView10)
        val imageViewFriday: ImageView = findViewById(R.id.imageView11)
        val imageViewSaturday: ImageView = findViewById(R.id.imageView12)
        val imageViewSunday: ImageView = findViewById(R.id.imageView13)

        // Set OnClickListener for each ImageView
        imageViewMonday.setOnClickListener {
            navigateToInputArea()
        }

        imageViewTuesday.setOnClickListener {
            navigateToInputArea()
        }

        imageViewWednesday.setOnClickListener {
            navigateToInputArea()
        }

        imageViewThursday.setOnClickListener {
            navigateToInputArea()
        }

        imageViewFriday.setOnClickListener {
            navigateToInputArea()
        }

        imageViewSaturday.setOnClickListener {
            navigateToInputArea()
        }

        imageViewSunday.setOnClickListener {
            navigateToInputArea()
        }
    }

    private fun navigateToInputArea() {
        // Start "inputarea" activity
        val intent = Intent(this@HomeActivity, Inputarea::class.java)
        startActivity(intent)
    }
}

