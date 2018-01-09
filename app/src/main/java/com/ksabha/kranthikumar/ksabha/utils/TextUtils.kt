package com.ksabha.kranthikumar.ksabha.utils

import android.content.res.Resources
import android.graphics.Color
import android.support.v4.content.ContextCompat
import android.widget.EditText
import com.ksabha.kranthikumar.ksabha.R

/**
 * Created by Kranthi Kumar on 1/8/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
class TextUtils {
    companion object {
        fun showInputError(msg: String, view: EditText) {
            view.error = msg
//            view.setError(msg, ContextCompat.getDrawable(null, R.drawable.edittext_warning) )
        }
    }
}