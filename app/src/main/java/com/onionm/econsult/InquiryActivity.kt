package com.onionm.econsult

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import android.view.View
import com.safframework.log.L
import kotlinx.android.synthetic.main.inquiry_nav.*
import kotlinx.android.synthetic.main.navigation.*

@Suppress("REDUNDANT_LABEL_WARNING")
open class InquiryActivity : AppCompatActivity()
{
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
//            R.id.navigation_home -> {
//                startActivity(Intent(InquiryActivity@this, MainActivity::class.java))
//            }
            R.id.navigation_inquiry -> {
                inquiry_nav.visibility = View.VISIBLE
                message_nav.visibility = View.GONE
                discovery_nav.visibility = View.GONE
                my_nav.visibility = View.GONE

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_message -> {
                inquiry_nav.visibility = View.GONE
                message_nav.visibility = View.VISIBLE
                discovery_nav.visibility = View.GONE
                my_nav.visibility = View.GONE

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_discovery -> {
                inquiry_nav.visibility = View.GONE
                message_nav.visibility = View.GONE
                discovery_nav.visibility = View.VISIBLE
                my_nav.visibility = View.GONE

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_my -> {
                inquiry_nav.visibility = View.GONE
                message_nav.visibility = View.GONE
                discovery_nav.visibility = View.GONE
                my_nav.visibility = View.VISIBLE

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inquiry_nav)

        navigation_bottom.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        // navigation_bottom.menu.getItem(0).isChecked = true

        inquiry_now_row.setOnClickListener{
            startActivity(Intent(InquiryActivity@this, InquiryHumanBodyActivity::class.java))
        }
        inquiry_visit_row.setOnClickListener{
            startActivity(Intent(InquiryActivity@this, MedicalRecordListActivity::class.java))
        }
        inquiry_my_doctor_row.setOnClickListener{
            startActivity(Intent(InquiryActivity@this, InquiryMyDoctorActivity::class.java))
        }


        discovery_doctor_live.setOnClickListener{
            startActivity(Intent(InquiryActivity@this, DiscoveryDoctorLiveActivity::class.java))
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
