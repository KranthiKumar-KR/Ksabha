package com.ksabha.kranthikumar.ksabha.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.ksabha.kranthikumar.ksabha.base.BasePresenter
import com.ksabha.kranthikumar.ksabha.model.UserModel
import com.ksabha.kranthikumar.ksabha.signup.SignUpActivity
import com.ksabha.kranthikumar.ksabha.utils.LoginUtils
import kotlinx.android.synthetic.main.loginactivity.*

/**
 * Created by Kranthi Kumar on 1/7/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
class LoginActivityPresenter<in V : LoginActivity>(private val view: LoginActivity) : BasePresenter<V>(), LoginMVPPresenter<V> {
    private val loginModel: UserModel = BasePresenter<V>().getModel()
    override fun startLogin(email: String, password: String) {
        if (loginModel.getUser().email.equals(email)) {
            if (loginModel.getUser().password.equals(password)) {
                TODO("not implemented parse set up") // Should load user feed activity on success
                //onSuccess()
            } else view.showPasswordError()
        } else view.showUserNameError()
    }

    override fun validateEmail() : Boolean =
        LoginUtils.isValidEmail(view.usernameET.text.toString())


    override fun validatePassword() : Boolean =
        LoginUtils.isValidPassword(view.passswordET.text.toString())

    override fun onSuccess() {
        Toast.makeText(view,"login successful", Toast.LENGTH_SHORT).show()
    }

    fun showSignUpPage() {
        val userData = Bundle()
        val email = view.usernameET.text.toString()
        if (email != "") userData.putString("email", email)
        val signUpIntent = Intent(view, SignUpActivity::class.java)
        signUpIntent.putExtras(userData)
        view.startActivity(signUpIntent)
    }
}