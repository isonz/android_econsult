package com.onionm.econsult

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import kotlinx.android.synthetic.main.inquiry_visit.*

class InquiryVisitTmp1Activity : AppCompatActivity()
{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inquiry_visit)

        inquiry_type_video.setOnClickListener {
            startActivity(Intent(InquiryVisitActivity@this, InquirySelectedOnlineDoctorVideoActivity::class.java))
        }

        inquiry_type_voice.setOnClickListener {
            startActivity(Intent(InquiryVisitActivity@this, InquirySelectedOnlineDoctorVoiceActivity::class.java))
        }

        inquiry_type_word.setOnClickListener {
            startActivity(Intent(InquiryVisitActivity@this, InquirySelectedOnlineDoctorWordActivity::class.java))
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
