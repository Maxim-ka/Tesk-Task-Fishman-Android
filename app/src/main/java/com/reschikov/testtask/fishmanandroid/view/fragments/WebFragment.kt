package com.reschikov.testtask.fishmanandroid.view.fragments

import android.os.Bundle
import android.webkit.*
import androidx.fragment.app.Fragment
import com.reschikov.testtask.fishmanandroid.R
import kotlinx.android.synthetic.main.fragment_web.*

private const val KEY_URL = "key url"
private const val MONEY = "https://lemif.club/money.html"
private const val MAIN = "https://lemif.club/main.html"
private const val GOOGLE = "http://google.com"
private const val PLAY = "http://www.zamolski.com/agot/"

class WebFragment : Fragment(R.layout.fragment_web){

    companion object{
        fun newInstance(url: String) = WebFragment()
            .also {
                with(Bundle()){
                    putString(KEY_URL, url)
                    it.arguments = this
                }
            }
    }

    private val webClient: WebViewClient = object : WebViewClient(){
        override fun onPageFinished(view: WebView?, url: String?) {
            if (url.equals(MONEY)) web.loadUrl(PLAY)
            if (url.equals(MAIN)) web.loadUrl(GOOGLE)
        }
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        web.webViewClient = webClient
        arguments?.getString(KEY_URL)?.let {
            web.loadUrl(it)
        }
    }

    override fun onPause() {
        super.onPause()
        web.onPause()
    }

    override fun onResume() {
        super.onResume()
        web.onResume()
    }
}