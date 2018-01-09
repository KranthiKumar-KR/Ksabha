package com.ksabha.kranthikumar.ksabha.signup

import android.widget.Toast
import com.ksabha.kranthikumar.ksabha.base.BasePresenter
import com.ksabha.kranthikumar.ksabha.utils.LoginUtils
import kotlinx.android.synthetic.main.signupactivity.*

/**
 * Created by Kranthi Kumar on 1/8/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
open class SignUpActivityPresenter<in V : SignUpActivity>(private val view: SignUpActivity) : BasePresenter<V>(), SignUpMVPPresenter<V> {
    override fun validateUserEmail() : Boolean =
            LoginUtils.isValidEmail(view.signupEmailET.text.toString())

    override fun validateUserPassword() : Boolean =
            LoginUtils.isValidPassword(view.signupPasswordET.text.toString())

    override fun checkUserAvailability() : Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun startSignUp() {
        if (validateUserEmail()) {
            if (validateUserPassword()) {
                Toast.makeText(view, "signup successful", Toast.LENGTH_LONG).show()
            } else view.showInvalidPassword()
        } else view.showInvalidEmail()
    }

    fun loadUserFeed() {

    }
}