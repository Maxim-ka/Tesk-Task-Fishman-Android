package com.reschikov.testtask.fishmanandroid.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.reschikov.testtask.fishmanandroid.App
import com.reschikov.testtask.fishmanandroid.R
import com.reschikov.testtask.fishmanandroid.navigation.Screens
import kotlinx.android.synthetic.main.fragment_start.*

private const val PRIVACY_POLICY = "https://galaraku.fun/privacy.html"
private const val CLUB = "https://lemif.club/fishdating/"

class StartFragment : Fragment(R.layout.fragment_start) {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        start.setOnClickListener {
            App.INSTANCE.getRouter().navigateTo(Screens.WebScreen(CLUB))
        }
        rules.setOnClickListener {
            App.INSTANCE.getRouter().navigateTo(Screens.RuleScreen())
        }
        policy.setOnClickListener {
            App.INSTANCE.getRouter().navigateTo(Screens.WebScreen(PRIVACY_POLICY))
        }
    }
}