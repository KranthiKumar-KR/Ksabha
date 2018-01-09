package com.ksabha.kranthikumar.ksabha.login

import android.os.Bundle
import android.view.View
import com.ksabha.kranthikumar.ksabha.R
import com.ksabha.kranthikumar.ksabha.base.BaseActivity
import com.ksabha.kranthikumar.ksabha.utils.TextUtils
import kotlinx.android.synthetic.main.loginactivity.*

/**
 * Created by Kranthi Kumar on 1/3/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
class LoginActivity : BaseActivity(), LoginMVPView {
private val presenter = LoginActivityPresenter<LoginActivity> (this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginactivity)
    }

    override fun loadUserFeedActivity() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showUserNameError() {
        TextUtils.showInputError("Invalid email", usernameET)
    }

    override fun showPasswordError() {
        TextUtils.showInputError("Invalid Password", passswordET)
    }

    fun onLoginClicked(view: View) {
        presenter.startLogin(usernameET.text.toString(), passswordET.text.toString())
    }

    fun onSignUpTextClicked() {
        presenter.showSignUpPage()
    }
}