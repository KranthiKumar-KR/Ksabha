/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.ksabha.kranthikumar.ksabha.parsesetup

import android.content.Context
import android.util.Log
import com.parse.Parse
import com.parse.ParseACL
import com.parse.ParseObject
import com.parse.ParseUser

/**
 * Created by Kranthi Kumar on 1/3/18.
 * Copyright 2018 Savant Systems LLC. All rights reserved.
 */
class ParseInit(context: Context) {
    private val mContext = context
    fun initParse() {
       Parse.enableLocalDatastore(mContext)
       Parse.initialize(Parse.Configuration.Builder(mContext)
               .applicationId("349c5d4012184942d2aa0486f572ce8a19515350")
               .clientKey("33b23734f7380974f12af59a0487d46f4cb8470c")
               .server("http://52.15.210.157:80/parse/")
               .build()
       )

        ParseUser.enableAutomaticUser()

        val defaultACL = ParseACL()
       defaultACL.publicReadAccess = true
       defaultACL.publicWriteAccess = true
        ParseACL.setDefaultACL(defaultACL, true)
   }
}