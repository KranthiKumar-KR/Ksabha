package com.ksabha.kranthikumar.ksabha.login

import com.ksabha.kranthikumar.ksabha.base.MVPPresenter

/**
 * Created by Kranthi Kumar on 1/3/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
interface LoginMVPPresenter<in V : LoginMVPView> : MVPPresenter<V> {
    fun startLogin(email: String, password: String)
}