package com.ksabha.kranthikumar.ksabha.utils

import android.app.DatePickerDialog
import android.app.Dialog
import android.app.DialogFragment
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TextView
import java.util.*


/**
 * Created by Kranthi Kumar on 1/7/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
class DatePickerFragment() : DialogFragment(), DatePickerDialog.OnDateSetListener {
    private lateinit var  mTextView: TextView
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // To set current data as default date in the calender
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        // Create a new instance of DatePickerDialog and return it
        return DatePickerDialog(activity, this, year, month, day)
    }

    override fun onDateSet(p0: DatePicker?, year: Int, month: Int, day: Int) {
        mTextView.text = StringBuilder().append(day).append("/")
                .append(month).append("/").append(year)
    }

    fun setTextView(textView: TextView) {
        mTextView = textView
    }
}