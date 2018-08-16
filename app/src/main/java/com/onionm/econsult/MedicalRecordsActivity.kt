package com.onionm.econsult

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.MenuBuilder
import android.view.Menu
import kotlinx.android.synthetic.main.medical_records.*

class MedicalRecordsActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.medical_records)

        deal_with_icon.setOnClickListener {
            startActivity(Intent(MedicalRecordsActivity@this, SolveBySelfActivity::class.java))
        }

        deal_with_word.setOnClickListener {
            startActivity(Intent(MedicalRecordsActivity@this, SolveBySelfActivity::class.java))
        }


        make_an_appointment_detection.setOnClickListener {
            startActivity(Intent(MedicalRecordsActivity@this, AppointmentDetectionActivity::class.java))
        }

        make_an_appointment_detection_word.setOnClickListener {
            startActivity(Intent(MedicalRecordsActivity@this, AppointmentDetectionActivity::class.java))
        }


        quick_buy_medicine.setOnClickListener {
            startActivity(Intent(MedicalRecordsActivity@this, PrescriptionActivity::class.java))
        }

        quick_buy_medicine_word.setOnClickListener {
            startActivity(Intent(MedicalRecordsActivity@this, PrescriptionActivity::class.java))
        }


        consult_a_specialist.setOnClickListener {
            startActivity(Intent(MedicalRecordsActivity@this, InquiryMyDoctorActivity::class.java))
        }

        consult_a_specialist_word.setOnClickListener {
            startActivity(Intent(MedicalRecordsActivity@this, InquiryMyDoctorActivity::class.java))
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
