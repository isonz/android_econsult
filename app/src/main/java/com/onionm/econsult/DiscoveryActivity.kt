package com.onionm.econsult

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import kotlinx.android.synthetic.main.navigation.*

class DiscoveryActivity : AppCompatActivity()
{
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                startActivity(Intent(DiscoveryActivity@this, MainActivity::class.java))
            }
            R.id.navigation_inquiry -> {
                startActivity(Intent(DiscoveryActivity@this, InquiryActivity::class.java))
            }
            R.id.navigation_message -> {
                startActivity(Intent(DiscoveryActivity@this, MessageActivity::class.java))
            }
            R.id.navigation_discovery -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_my -> {
                startActivity(Intent(DiscoveryActivity@this, MyActivity::class.java))
            }
        }
        false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.discovery_nav)

        navigation_bottom.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        navigation_bottom.menu.getItem(3).isChecked = true

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
