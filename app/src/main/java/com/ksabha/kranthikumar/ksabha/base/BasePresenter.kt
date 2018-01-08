package com.ksabha.kranthikumar.ksabha.base

import com.ksabha.kranthikumar.ksabha.model.User
import com.ksabha.kranthikumar.ksabha.model.UserModel

/**
 * Created by Kranthi Kumar on 1/7/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
open class BasePresenter<in V : MVPView> : MVPPresenter<V> {
    lateinit var mMVPView: MVPView
    override fun onAttach(mvpView: V) {
        mMVPView = mvpView
    }
    fun getModel() : UserModel = UserModel()
}