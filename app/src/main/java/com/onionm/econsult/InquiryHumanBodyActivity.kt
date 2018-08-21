package com.onionm.econsult

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import kotlinx.android.synthetic.main.inquiry_human_body.*

class InquiryHumanBodyActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inquiry_human_body)


        no_found_jump.setOnClickListener {
            startActivity(Intent(InquiryHumanBodyActivity@this, InquiryNowActivity::class.java))
        }

        body_head.setOnClickListener{
            intent = Intent(InquiryHumanBodyActivity@this, InquiryHumanBodyInfoActivity::class.java)
            intent.putExtra("body", "head")
            startActivity(intent)
        }

        body_1.setOnClickListener{
            intent = Intent(InquiryHumanBodyActivity@this, InquiryHumanBodyInfoActivity::class.java)
            intent.putExtra("body", "body_1")
            startActivity(intent)
        }

        body_2.setOnClickListener{
            intent = Intent(InquiryHumanBodyActivity@this, InquiryHumanBodyInfoActivity::class.java)
            intent.putExtra("body", "body_2")
            startActivity(intent)
        }

        body_leg.setOnClickListener{
            intent = Intent(InquiryHumanBodyActivity@this, InquiryHumanBodyInfoActivity::class.java)
            intent.putExtra("body", "body_leg")
            startActivity(intent)
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
