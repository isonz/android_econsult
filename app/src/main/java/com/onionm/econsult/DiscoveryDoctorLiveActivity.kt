package com.onionm.econsult

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import kotlinx.android.synthetic.main.discovery_doctor_live.*


class DiscoveryDoctorLiveActivity : AppCompatActivity()
{



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.discovery_doctor_live)



        //======================== TAB
        tabHost.setup()
        var spec = tabHost.newTabSpec("热门推荐")
        spec.setContent(tab1.id)
        spec.setIndicator("热门推荐")
        tabHost.addTab(spec)

        spec = tabHost.newTabSpec("健康教育")
        spec.setContent(tab2.id)
        spec.setIndicator("健康教育")
        tabHost.addTab(spec)

        spec = tabHost.newTabSpec("医院生活")
        spec.setContent(tab3.id)
        spec.setIndicator("医院生活")
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
