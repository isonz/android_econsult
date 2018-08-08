package com.onionm.econsult

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window

class LoginActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_login)

    }

    // 包裹范围内 属于静态方法
    companion object {
        //
    }



}
