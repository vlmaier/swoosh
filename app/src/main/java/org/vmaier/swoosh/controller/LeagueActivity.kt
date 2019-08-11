package org.vmaier.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import org.vmaier.swoosh.R
import org.vmaier.swoosh.model.Player
import org.vmaier.swoosh.utilities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMenButtonClicked(view: View) {
        womenButton.isChecked = false
        coEdButton.isChecked = false
        player.league = "men"
    }

    fun onWomenButtonClicked(view: View) {
        menButton.isChecked = false
        coEdButton.isChecked = false
        player.league = "women"
    }

    fun onCoEdButtonClicked(view: View) {
        menButton.isChecked = false
        womenButton.isChecked = false
        player.league = "co-ed"
    }

    fun nextButtonClicked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league first.", Toast.LENGTH_SHORT).show()
        }
    }
}
