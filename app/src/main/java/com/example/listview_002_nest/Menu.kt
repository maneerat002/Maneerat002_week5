package com.example.listview_002_nest

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menu.*

class Menu : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)
        supportActionBar?.hide()
        val title = intent.extras?.getString(MainActivity().KEY_TITLE,"")
        val menu = intent.extras?.getString(MainActivity().KEY_MENU,"")
        val data = intent.extras?.getString(MainActivity().KEY_DATA,"")

        tv_title.setText(title)
        tv_data.setText(data)
        tv_show.setText("ราคา "+menu+" บาท")
        btn_back.setOnClickListener {
            finish()
        }
    }

}