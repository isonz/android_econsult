package com.onionm.econsult

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.inquiry_selected_online_doctor_video.*

class InquirySelectedOnlineDoctorVideoActivity : AppCompatActivity()
{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        //Í¸Ã÷ÏµÍ³×´Ì¬À¸
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
        }

        setContentView(R.layout.inquiry_selected_online_doctor_video)

        voice_icon.setOnClickListener {
            startActivity(Intent(InquirySelectedOnlineDoctorVideoActivity@this, InquirySelectedOnlineDoctorVoiceActivity::class.java))
        }
        video_hold_on.setOnClickListener {
            startActivity(Intent(InquirySelectedOnlineDoctorVideoActivity@this, InquiryEndActivity::class.java))
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu?.let {
            if (menu is MenuBuilder) {
                try {
                    val field = menu.javaClass.getDeclaredField("mOptionalIconsVisible")
                    field.isAccessible = true
                    field.setBoolean(menu, true)
                } catch (ignored: Exception) {
                    // ignored exception
                }
            }
        }
        val inflater = menuInflater
        inflater.inflate(R.menu.actionbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


}
