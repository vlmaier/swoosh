package org.vmaier.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import org.vmaier.swoosh.R
import org.vmaier.swoosh.model.Player
import org.vmaier.swoosh.utilities.EXTRA_PLAYER

class FinishActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        searchLeaguesText.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }
}
