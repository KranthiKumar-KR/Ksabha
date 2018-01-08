package com.ksabha.kranthikumar.ksabha.login

import com.ksabha.kranthikumar.ksabha.base.BasePresenter
import com.ksabha.kranthikumar.ksabha.model.UserModel

/**
 * Created by Kranthi Kumar on 1/7/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
class LoginActivityPresenter<in V : LoginActivity> : BasePresenter<V>(), LoginMVPPresenter<V> {
    val loginModel : UserModel = BasePresenter<V>().getModel()
    override fun startLogin(email: String, password: String) {
    }
}