package com.onionm.econsult

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import kotlinx.android.synthetic.main.inquiry_my_doctor.*

class InquiryMyDoctorActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inquiry_my_doctor)

        inquiry_select_online_doctor_btn_1.setOnClickListener{
            startActivity(Intent(InquiryMyDoctorActivity@this, InquiryVisitActivity::class.java))
        }
        inquiry_select_online_doctor_btn_3.setOnClickListener{
            startActivity(Intent(InquiryMyDoctorActivity@this, InquiryVisit2Activity::class.java))
        }
        inquiry_select_online_doctor_btn_4.setOnClickListener{
            startActivity(Intent(InquiryMyDoctorActivity@this, InquiryVisitActivity::class.java))
        }


        inquiry_recommended_doctor_btn_1.setOnClickListener{
            startActivity(Intent(InquiryMyDoctorActivity@this, InquiryVisitActivity::class.java))
        }
        inquiry_recommended_doctor_btn_3.setOnClickListener{
            startActivity(Intent(InquiryMyDoctorActivity@this, InquiryVisit2Activity::class.java))
        }


        inquiry_signing_doctor_btn_1.setOnClickListener{
            startActivity(Intent(InquiryMyDoctorActivity@this, InquiryMyDoctorSigningActivity::class.java))
        }
        inquiry_signing_doctor_btn_3.setOnClickListener{
            startActivity(Intent(InquiryMyDoctorActivity@this, InquiryMyDoctorSigningActivity::class.java))
        }


        //======================== TAB
        tabHost.setup()
        var spec = tabHost.newTabSpec("推荐医生")
        spec.setContent(tab1.id)
        spec.setIndicator("推荐医生")
        tabHost.addTab(spec)

        spec = tabHost.newTabSpec("已签约医生")
        spec.setContent(tab2.id)
        spec.setIndicator("已签约医生")
        tabHost.addTab(spec)
        //======================== TAB
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
