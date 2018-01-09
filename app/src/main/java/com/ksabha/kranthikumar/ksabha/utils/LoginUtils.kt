package com.ksabha.kranthikumar.ksabha.utils

import android.text.TextUtils
import android.util.Patterns

/**
 * Created by Kranthi Kumar on 1/8/18.
 * Copyright 2018 KRMind Projects. All rights reserved.
 */
class LoginUtils {

    companion object {

        /**
         * Validates the length of an email field
         * @param input email
         * @return True if email is valid
         */
        fun isValidEmail(input: String): Boolean = Patterns.EMAIL_ADDRESS.matcher(input).matches()

        /**
         * Validates the format of the password. It currently must be 8 characters, and have 1
         * upper case, at least 1 lower case, and 1 digit.
         * @param input password
         * @return True if valid password. False otherwise.
         */
        fun isValidPassword(input: String): Boolean {
            if (TextUtils.isEmpty(input) || input.length < 8) {
                return false
            }
            //--------------------------------------------------
            // Now we need to actually parse the string
            //--------------------------------------------------
            var hasUpperCase = false
            var hasLowerCase = false
            var hasDigit = false
            for (ii in 0 until input.length) {
                // Check for at least 1 upper case
                if (!hasUpperCase) {
                    hasUpperCase = Character.isUpperCase(input[ii])
                }
                // Check for at least 1 lower case
                if (!hasLowerCase) {
                    hasLowerCase = Character.isLowerCase(input[ii])
                }
                // Check for at least 1 digit
                if (!hasDigit) {
                    hasDigit = Character.isDigit(input[ii])
                }
            }
            return hasUpperCase && hasLowerCase && hasDigit
        }
    }

}