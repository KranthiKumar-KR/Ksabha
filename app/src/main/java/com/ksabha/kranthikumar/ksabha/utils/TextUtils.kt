package com.ksabha.kranthikumar.ksabha.utils

import android.graphics.Color
import android.widget.EditText

/**
 * Created by Kranthi Kumar on 1/8/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
class TextUtils {
    companion object {
        fun showInputError(msg: String, view: EditText) {
            view.hint = msg
            view.setHintTextColor(Color.RED)
        }
    }
}