package com.ksabha.kranthikumar.ksabha.signup

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ksabha.kranthikumar.ksabha.R
import com.ksabha.kranthikumar.ksabha.base.BaseActivity
import com.ksabha.kranthikumar.ksabha.utils.TextUtils
import kotlinx.android.synthetic.main.signupactivity.*


class SignUpActivity : BaseActivity(), SignUpMVPView {
    override fun getPresenter() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private val presenter = SignUpActivityPresenter <SignUpActivity>(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signupactivity)
        val incomingIntent = intent
        val incomingBundle = incomingIntent?.extras
        val email = incomingBundle?.getString("email")
        Toast.makeText(this,"email: " +email, Toast.LENGTH_LONG).show()
    }

    override fun showInvalidEmail() {
        TextUtils.showInputError("Invalid user name", signupEmailET)
    }

    override fun showInvalidPassword() {
        TextUtils.showInputError("Invalid Password", signupPasswordET)
    }
    override fun userNotAvailable() {
        TextUtils.showInputError("Username not available", signupUsernameET)
    }

    override fun loadUserFeedActivity() {
        presenter.loadUserFeed()
    }

    fun showDate(view: View) {

    }

    fun onSignUpClicked(view: View) {
        presenter.startSignUp()
    }
}
