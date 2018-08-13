package com.onionm.econsult

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.navigation.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_inquiry -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_message -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_discovery -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_my -> {

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        // supportActionBar!!.setDisplayShowTitleEnabled(true)
        // supportActionBar!!.setHomeButtonEnabled(true)

        navigation_bottom.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
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
