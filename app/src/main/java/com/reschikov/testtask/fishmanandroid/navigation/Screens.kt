package com.reschikov.testtask.fishmanandroid.navigation

import com.reschikov.testtask.fishmanandroid.view.fragments.LoadFragment
import com.reschikov.testtask.fishmanandroid.view.fragments.RuleFragment
import com.reschikov.testtask.fishmanandroid.view.fragments.StartFragment
import com.reschikov.testtask.fishmanandroid.view.fragments.WebFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

sealed class Screens : SupportAppScreen(){

    class LoadingScreen : Screens() {
        override fun getFragment() = LoadFragment()
    }

    class StartScreen : Screens() {
        override fun getFragment() = StartFragment()
    }

    class WebScreen(private val url: String) : Screens(){
        override fun getFragment() = WebFragment.newInstance(url)
    }

    class RuleScreen : Screens(){
        override fun getFragment() = RuleFragment()
    }
}