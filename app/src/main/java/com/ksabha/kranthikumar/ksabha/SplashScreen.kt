package com.ksabha.kranthikumar.ksabha

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ksabha.kranthikumar.ksabha.login.LoginActivity
import com.ksabha.kranthikumar.ksabha.parsesetup.ParseInit
import com.parse.ParseAnalytics

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        launchLoginActivity()
        val parseInit = ParseInit(applicationContext)
        parseInit.initParse()
        ParseAnalytics.trackAppOpenedInBackground(intent)
    }

    private fun launchLoginActivity() {
        val loginActivityIntent = Intent(applicationContext, LoginActivity::class.java)
        Thread(Runnable {
            Thread.sleep(3000)
            startActivity(loginActivityIntent)
        }).start()
    }
}
