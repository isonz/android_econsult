package com.onionm.econsult

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.safframework.log.L
import kotlinx.android.synthetic.main.activity_register3.*

@Suppress("REDUNDANT_LABEL_WARNING")
class Register3Activity : AppCompatActivity()
{

    @SuppressLint("ObsoleteSdkInt")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        L.i("LoginActivity ON CREATE")
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_register3)

        submit_next_step.setOnClickListener{
            startActivity(Intent(Register2Activity@this, LoginByUsernameActivity::class.java))
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
