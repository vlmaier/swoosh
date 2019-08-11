package org.vmaier.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import org.vmaier.swoosh.utilities.EXTRA_LEAGUE
import org.vmaier.swoosh.R

class LeagueActivity : BaseActivity() {

    private var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMenButtonClicked(view: View) {
        womenButton.isChecked = false
        coEdButton.isChecked = false
        selectedLeague = "men"
    }

    fun onWomenButtonClicked(view: View) {
        menButton.isChecked = false
        coEdButton.isChecked = false
        selectedLeague = "women"
    }

    fun onCoEdButtonClicked(view: View) {
        menButton.isChecked = false
        womenButton.isChecked = false
        selectedLeague = "co-ed"
    }

    fun nextButtonClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league first.", Toast.LENGTH_SHORT).show()
        }
    }
}
