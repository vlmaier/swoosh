package org.vmaier.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import org.vmaier.swoosh.R

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    fun onGetStartedButtonClick(view: View) {
        val leagueActivity = Intent(this, LeagueActivity::class.java)
        startActivity(leagueActivity)
    }
}
