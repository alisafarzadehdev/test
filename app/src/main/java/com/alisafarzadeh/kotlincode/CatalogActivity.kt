package com.alisafarzadeh.kotlincode

import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import android.os.Bundle
import com.google.android.material.bottomappbar.BottomAppBar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ListView
import com.alisafarzadeh.kotlincode.model.service.NewsClient
import com.alisafarzadeh.kotlincode.model.service.ServiceGenerator
import com.alisafarzadeh.kotlincode.model.model.News
import com.alisafarzadeh.kotlincode.NewsAdapter.ClickItem
import android.content.Intent
import android.os.Parcelable
import android.widget.Toast
import android.util.Log
import android.widget.ProgressBar
import com.alisafarzadeh.kotlincode.model.model.Result
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CatalogActivity : AppCompatActivity() {

    private var mDrawerLayout: DrawerLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)

        mDrawerLayout = findViewById(R.id.drawer_layout)

        val bar = findViewById<BottomAppBar>(R.id.bar)
        setSupportActionBar(bar)


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_catalog, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.catalog_menu_search ->

                return true
            R.id.catalog_menu_sort ->
                return true
            R.id.catalog_menu_home ->                 // Do stuff
                return true
        }
        return super.onOptionsItemSelected(item)
    }


    /*
    private fun makeBaseNetworkCall() {
        val listView = findViewById<ListView>(R.id.list)

        val client = ServiceGenerator.getservice().create(NewsClient::class.java)
        val call = client.getBaseJson(API_KEY, API_REQUEST_TYPE, API_BLOCK_TYPE)


        call.enqueue(object : Callback<News> {
            override fun onResponse(call: Call<News>, response: Response<News>) {

                val results = response.body()!!.response.results
                hideSpinnerFromCatalog()


                val adapter = NewsAdapter(this@CatalogActivity, results, object:ClickItem {
                    override fun click(url: String, title: String, timeDate: String) {
                        val i = Intent(this@CatalogActivity, ShowNewsActivity::class.java)
                        i.putExtra("URL", url )
                        i.putExtra("TITLE", title)
                        i.putExtra("TIME", timeDate)
                        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                        startActivity(i)
                    }
                })

                listView.dividerHeight = 0
                listView.adapter = adapter
            }

            override fun onFailure(call: Call<News>, t: Throwable) {
                hideSpinnerFromCatalog()
                Toast.makeText(
                    this@CatalogActivity,
                    "There was a problem with the network call",
                    Toast.LENGTH_SHORT
                ).show()
                Log.e("The throwable is", t.toString())
            }
        })
    }


     */

    private fun hideSpinnerFromCatalog() {
        val spinner = findViewById<ProgressBar>(R.id.loading_spinner)
        spinner.visibility = View.GONE
    }

    companion object {
        const val BODY_SUMMARY_TEXT_LENGTH_SHORT = 150
        const val API_KEY = "2aa82e86-efa0-4396-9db0-0bcbf284b083"
        const val API_REQUEST_TYPE = "article"
        const val API_BLOCK_TYPE = "body"
    }
}