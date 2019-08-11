package org.vmaier.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import org.vmaier.swoosh.utilities.*
import org.vmaier.swoosh.R

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBeginnerButtonClick(view: View) {
        ballerButton.isChecked = false
        skill = "beginner"
    }

    fun onBallerButtonClick(view: View) {
        beginnerButton.isChecked = false
        skill = "baller"
    }

    fun onFinishButtonClick(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level first.", Toast.LENGTH_SHORT).show()
        }
    }
}
