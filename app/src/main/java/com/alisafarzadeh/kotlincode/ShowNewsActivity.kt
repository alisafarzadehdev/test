package com.alisafarzadeh.kotlincode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import com.alisafarzadeh.kotlincode.model.model.Result
import java.net.URL


class ShowNewsActivity : AppCompatActivity() {
    lateinit var texttile :TextView
    lateinit var texttime: TextView
    lateinit var web: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_news)

        val url : String? = intent.getStringExtra("URL")
        val title : String? = intent.getStringExtra("TITLE")
        val time : String? = intent.getStringExtra("TIME")

        texttile = findViewById(R.id.titleTextView)
        texttime = findViewById(R.id.timeTextView)
        web = findViewById(R.id.webview)

        texttile.text = title
        texttime.text = time

        web.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {

                web?.loadUrl(url+"")
                web.settings.javaScriptEnabled = true
                return true
            }
        }
        web.loadUrl(url+"")

    }
}
