package com.ksabha.kranthikumar.ksabha.signup

import com.ksabha.kranthikumar.ksabha.base.MVPPresenter
import com.ksabha.kranthikumar.ksabha.base.MVPView

/**
 * Created by Kranthi Kumar on 1/8/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
interface SignUpMVPPresenter<in V : MVPView> : MVPPresenter<V> {
    fun validateUserEmail()
    fun validateUserPassword()
    fun checkUserAvailability()
    fun startSignUp()
}