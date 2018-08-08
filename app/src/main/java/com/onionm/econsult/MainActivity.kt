package com.onionm.econsult

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                message.setText(R.string.title_home)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_inquiry -> {
                message.setText(R.string.title_inquiry)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_message -> {
                message.setText(R.string.title_message)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_discovery -> {
                message.setText(R.string.title_discovery)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_my -> {
                message.setText(R.string.title_my)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
