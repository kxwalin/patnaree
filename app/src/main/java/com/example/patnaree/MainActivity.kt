package com.example.patnaree

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()


        btn_amnatcharoen.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.amnatcharoen_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_amnatcharoen),getString(R.string.history_amnatcharoen)) }

        })

        btn_nongbualamphu.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.nongbualamphu_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_nongbualamphu),getString(R.string.history_nongbualamphu)) }

        })

        btn_pathumthani.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.pathumthani_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_pathumthani),getString(R.string.history_pathumthani)) }

        })
        btn_suphanburi.setOnClickListener(View.OnClickListener {

            getDrawable(R.drawable.suphanburi_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_suphanburi),getString(R.string.history_suphanburi)) }

        })


    }

    fun setProvice (drawable : Drawable, header:String, content:String ){


        img_province.setImageDrawable(drawable)

        tv_header.setText("ข้อมูลจังหวัด "+header)

        tv_history.setText(content)


        Toast.makeText(this,

            "นี่คือ ข้อมูลจังหวัด "+header, Toast.LENGTH_LONG).show()

    }

}
