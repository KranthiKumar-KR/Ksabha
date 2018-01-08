package com.ksabha.kranthikumar.ksabha.login

import com.ksabha.kranthikumar.ksabha.base.BaseActivity
import com.ksabha.kranthikumar.ksabha.base.MVPView

/**
 * Created by Kranthi Kumar on 1/3/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
interface LoginMVPView : MVPView {
    fun loadUserFeedActivity() : Unit {}
    fun onLoginBtnClicked() : Unit {}
    fun onSignBtnClicked() : Unit {}
}