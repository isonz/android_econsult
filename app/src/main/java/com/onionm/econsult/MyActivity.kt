package com.onionm.econsult

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import kotlinx.android.synthetic.main.navigation.*

class MyActivity : AppCompatActivity()
{
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                startActivity(Intent(MyActivity@this, MainActivity::class.java))
            }
            R.id.navigation_inquiry -> {
                startActivity(Intent(MyActivity@this, InquiryActivity::class.java))
            }
            R.id.navigation_message -> {
                startActivity(Intent(MyActivity@this, MessageActivity::class.java))
            }
            R.id.navigation_discovery -> {
                startActivity(Intent(MyActivity@this, DiscoveryActivity::class.java))
            }
            R.id.navigation_my -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_nav)

        navigation_bottom.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        navigation_bottom.menu.getItem(4).isChecked = true

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
