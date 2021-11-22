package com.alisafarzadeh.kotlincode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.JsonReader
import android.util.Log
import android.widget.Toast
import java.io.ByteArrayOutputStream
import java.io.InputStream
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.google.gson.JsonArray
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.create


class MainActivity : AppCompatActivity() {

    lateinit var spinner:Spinner
    lateinit var arraycity:ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(Dispatchers.Main) {

        }

    }

}