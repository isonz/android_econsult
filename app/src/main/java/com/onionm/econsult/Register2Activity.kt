package com.onionm.econsult

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.safframework.log.L
import kotlinx.android.synthetic.main.activity_register2.*

@Suppress("REDUNDANT_LABEL_WARNING")
class Register2Activity : AppCompatActivity()
{

    @SuppressLint("ObsoleteSdkInt")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        L.i("LoginActivity ON CREATE")
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_register2)

        submit_next_step.setOnClickListener{
            startActivity(Intent(Register2Activity@this, Register3Activity::class.java))
        }

    }

    override fun onDestroy() {
        L.i("LoginActivity ON destroy")
        super.onDestroy()
    }

    override fun onStart() {
        L.i("LoginActivity ON start")
        super.onStart()
    }

    // 包裹范围内 属于静态方法
    companion object {
        //
    }



}
