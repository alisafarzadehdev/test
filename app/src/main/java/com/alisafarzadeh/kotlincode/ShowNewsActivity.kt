package com.alisafarzadeh.kotlincode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.alisafarzadeh.kotlincode.model.model.Result
import com.alisafarzadeh.kotlincode.repository.Repo
import com.alisafarzadeh.kotlincode.viewmodel.MyViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import java.net.URL


class ShowNewsActivity : AppCompatActivity() {
    /*
    lateinit var texttile :TextView
    lateinit var texttime: TextView
    lateinit var web: WebView

    */
    lateinit var myviewmodel : MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_news)

        /*
        val url : String? = intent.getStringExtra("URL")
        val title : String? = intent.getStringExtra("TITLE")
        val time : String? = intent.getStringExtra("TIME")

        texttile = findViewById(R.id.titleTextView)
        texttime = findViewById(R.id.timeTextView)
        web = findViewById(R.id.webview)

        texttile.text = title
        texttime.text = time

        */
        val API_KEY = "2aa82e86-efa0-4396-9db0-0bcbf284b083"
        val API_REQUEST_TYPE = "article"
        val API_BLOCK_TYPE = "body"
        myviewmodel = ViewModelProvider(this)[MyViewModel::class.java]
        myviewmodel.getPost(API_KEY,API_REQUEST_TYPE,API_BLOCK_TYPE)
        myviewmodel.postDataLiveData.observe(this, Observer{
            Log.d("ddd", "onCreate: "+it.response.results[0].webTitle)
            Log.d("ddd", "onCreate: "+it.response.results[1].webTitle)
            Log.d("ddd", "onCreate: "+it.response.results[2].webTitle)
        })
        /*


        web.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {

                web?.loadUrl(url+"")
                web.settings.javaScriptEnabled = true
                return true
            }
        }
        web.loadUrl(url+"")



        ViewMode
        GlobalScope


         */




    }
}
