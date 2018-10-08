package com.onionm.econsult

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import com.safframework.log.L
import kotlinx.android.synthetic.main.activity_register.*

@Suppress("REDUNDANT_LABEL_WARNING")
class RegisterActivity : AppCompatActivity()
{

    @SuppressLint("ObsoleteSdkInt")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        L.i("LoginActivity ON CREATE")
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_register)

        submit_next_step.setOnClickListener{
            startActivity(Intent(RegisterActivity@this, Register2Activity::class.java))
        }

        go_to_login.setOnClickListener{
            startActivity(Intent(RegisterActivity@this, LoginByUsernameActivity::class.java))
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
