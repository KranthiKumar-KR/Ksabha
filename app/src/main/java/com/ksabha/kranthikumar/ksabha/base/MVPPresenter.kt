package com.ksabha.kranthikumar.ksabha.base

/**
 * Created by Kranthi Kumar on 1/7/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
interface MVPPresenter< in V : MVPView> {
    fun onAttach(mvpView: V)
}