package com.onionm.econsult

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.inquiry_my_doctor_signing.*

class InquiryMyDoctorSigningActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inquiry_my_doctor_signing)

        inquiry_signing_doctor_btn_1.setOnClickListener {
            Toast.makeText(InquiryMyDoctorSigningActivity@this, "签约成功", Toast.LENGTH_LONG).show()
            inquiry_consult_btn.visibility = View.VISIBLE
            inquiry_signing_doctor_btn_1.visibility = View.GONE
        }
        inquiry_consult_btn.setOnClickListener{
            startActivity(Intent(InquiryMyDoctorSigningActivity@this, InquiryVisitActivity::class.java))
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
