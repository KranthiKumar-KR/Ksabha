package com.ksabha.kranthikumar.ksabha.login

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ksabha.kranthikumar.ksabha.R
import com.ksabha.kranthikumar.ksabha.base.BaseActivity

/**
 * Created by Kranthi Kumar on 1/3/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
open class LoginActivity : BaseActivity(), LoginMVPView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginactivity)
    }
}