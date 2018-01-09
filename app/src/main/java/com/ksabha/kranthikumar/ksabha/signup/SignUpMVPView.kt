package com.ksabha.kranthikumar.ksabha.signup

import com.ksabha.kranthikumar.ksabha.base.MVPView

/**
 * Created by Kranthi Kumar on 1/8/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
interface SignUpMVPView : MVPView {
    fun showInvalidEmail()
    fun showInvalidPassword()
    fun userNotAvailable()
    fun loadUserFeedActivity()
    fun getPresenter()
}