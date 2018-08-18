package com.onionm.econsult

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import kotlinx.android.synthetic.main.inquiry_select_doctor.*
import kotlinx.android.synthetic.main.navigation.*

class InquiryMyDoctorActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inquiry_my_doctor)

        inquiry_select_online_doctor_btn_1.setOnClickListener{
            startActivity(Intent(InquirySelectOnlineDoctorActivity@this, InquirySelectedOnlineDoctorActivity::class.java))
        }
        inquiry_select_online_doctor_btn_3.setOnClickListener{
            startActivity(Intent(InquirySelectOnlineDoctorActivity@this, InquirySelectedOnlineDoctorActivity::class.java))
        }
        inquiry_select_online_doctor_btn_4.setOnClickListener{
            startActivity(Intent(InquirySelectOnlineDoctorActivity@this, InquirySelectedOnlineDoctorActivity::class.java))
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
