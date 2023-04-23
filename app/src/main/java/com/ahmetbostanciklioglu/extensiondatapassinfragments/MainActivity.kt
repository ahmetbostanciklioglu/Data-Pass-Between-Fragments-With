package com.ahmetbostanciklioglu.extensiondatapassinfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpFragment()
    }
    private fun   setUpFragment() {
        replaceActivityWithFragment(FragmentOne())
    }

}