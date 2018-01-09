package com.ksabha.kranthikumar.ksabha.signup

import com.ksabha.kranthikumar.ksabha.base.BasePresenter
import com.ksabha.kranthikumar.ksabha.utils.LoginUtils
import kotlinx.android.synthetic.main.signupactivity.*

/**
 * Created by Kranthi Kumar on 1/8/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
open class SignUpActivityPresenter<in V : SignUpActivity>(private val view: SignUpActivity) : BasePresenter<V>(), SignUpMVPPresenter<V> {
    override fun validateUserEmail() {
        if (!LoginUtils.isValidEmail(view.signupEmailET.text.toString())) view.showInvalidEmail()
    }

    override fun validateUserPassword() {
        if (!LoginUtils.isValidPassword(view.signupPasswordET.text.toString())) view.showInvalidPassword()
    }

    override fun checkUserAvailability() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun startSignUp() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun loadUserFeed() {

    }
}