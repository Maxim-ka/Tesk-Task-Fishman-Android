package com.reschikov.testtask.fishmanandroid.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reschikov.testtask.fishmanandroid.App
import com.reschikov.testtask.fishmanandroid.R
import com.reschikov.testtask.fishmanandroid.navigation.Screens
import ru.terrakok.cicerone.android.support.SupportAppNavigator

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val navigatorHolder = App.INSTANCE.getNavigatorHolder()
    private val navigator = SupportAppNavigator(this, R.id.frame_master)

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        savedInstanceState ?: App.INSTANCE.getRouter().replaceScreen(Screens.LoadingScreen())
    }

    override fun onResume() {
        super.onResume()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        navigatorHolder.removeNavigator()
    }
}
