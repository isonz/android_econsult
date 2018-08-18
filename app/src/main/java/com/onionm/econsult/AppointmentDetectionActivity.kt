package com.onionm.econsult

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import kotlinx.android.synthetic.main.appointment_detection.*

class AppointmentDetectionActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.appointment_detection)

        detection_id_1.setOnClickListener{
            startActivity(Intent(AppointmentDetectionActivity@this, DetectionActivity::class.java))
        }
        detection_id_2.setOnClickListener{
            startActivity(Intent(AppointmentDetectionActivity@this, DetectionActivity::class.java))
        }
        detection_id_3.setOnClickListener{
            startActivity(Intent(AppointmentDetectionActivity@this, DetectionActivity::class.java))
        }
        detection_id_4.setOnClickListener{
            startActivity(Intent(AppointmentDetectionActivity@this, DetectionActivity::class.java))
        }
        detection_id_5.setOnClickListener{
            startActivity(Intent(AppointmentDetectionActivity@this, DetectionActivity::class.java))
        }
        detection_id_6.setOnClickListener{
            startActivity(Intent(AppointmentDetectionActivity@this, DetectionActivity::class.java))
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
