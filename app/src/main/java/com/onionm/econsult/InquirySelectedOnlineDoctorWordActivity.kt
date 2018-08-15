package com.onionm.econsult

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import kotlinx.android.synthetic.main.inquiry_selected_online_doctor_word.*

class InquirySelectedOnlineDoctorWordActivity : AppCompatActivity()
{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inquiry_selected_online_doctor_word)

        inquiry_word_end.setOnClickListener {
            startActivity(Intent(InquirySelectedOnlineDoctorWordActivity@this, MedicalRecordsActivity::class.java))
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
