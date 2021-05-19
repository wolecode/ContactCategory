package com.example.contactapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.contactapp.databinding.ActivityDetailsBinding

class Details : AppCompatActivity() {
    lateinit var bind: ActivityDetailsBinding
    lateinit var toolbar: Toolbar
    @SuppressLint("UseCompatLoadingForDrawables")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityDetailsBinding.inflate(layoutInflater)

        val intent = intent

        setContentView(bind.root)
        toolbar = bind.toolbar
        toolbar.title = intent.getStringExtra("CATEGORY")

        setSupportActionBar(toolbar)
        //supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar.navigationIcon = getDrawable(R.drawable.back_icon)

        toolbar.setNavigationOnClickListener {
            setResult(0, intent)
            finish()
        }
    }
}