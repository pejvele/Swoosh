package com.example.paveldispiter.swoosh.Controler

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.paveldispiter.swoosh.Model.Player
import com.example.paveldispiter.swoosh.R
import com.example.paveldispiter.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {


    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun onMensClicked(view: View) {
        womensLeagueBtn.isChecked = false
        coedLeaugeBtn.isChecked = false

        player.league = "mens"
    }

    fun onWomensClicked(view: View) {
        mensLeagueBtn.isChecked = false
        coedLeaugeBtn.isChecked = false

        player.league = "womens"
    }

    fun onCoedClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        player.league = "coed"
    }


    fun leagueNextClicked(view: View) {

        if (player.league != "") {
            val SkillActivity = Intent(this, SkillActivity::class.java)
            SkillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(SkillActivity)

        } else {
            Toast.makeText(this, "select a league", Toast.LENGTH_SHORT).show()
        }
    }
}

