package com.reschikov.testtask.fishmanandroid.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.reschikov.testtask.fishmanandroid.navigation.Screens
import com.reschikov.testtask.fishmanandroid.App
import com.reschikov.testtask.fishmanandroid.R
import kotlinx.android.synthetic.main.fragment_load.*

class LoadFragment : Fragment(R.layout.fragment_load) {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        loading.setOnClickListener{
            App.INSTANCE.getRouter().replaceScreen(Screens.StartScreen())
        }
    }
}