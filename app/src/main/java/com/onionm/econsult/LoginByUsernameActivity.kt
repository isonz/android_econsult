package com.onionm.econsult

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login_username.*

class LoginByUsernameActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_username)

        submit_login.setOnClickListener {
            startActivity(Intent(LoginByUsernameActivity@ this, InquiryActivity::class.java))
        }

    }

    // 包裹范围内 属于静态方法
    companion object {
        //
    }



}
