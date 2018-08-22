package com.onionm.econsult

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import com.safframework.log.L
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        L.i("LoginActivity ON CREATE")
        super.onCreate(savedInstanceState)

        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        //透明系统状态栏
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
        }

        setContentView(R.layout.activity_login)

        login_by_username.setOnClickListener{
            startActivity(Intent(LoginActivity@this, LoginByUsernameActivity::class.java))
        }

        weixin_icon.setOnClickListener{
            startActivity(Intent(LoginActivity@this, InquiryActivity::class.java))
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
