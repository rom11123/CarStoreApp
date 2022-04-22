package com.example.carstoreapp

import android.os.Bundle
import com.example.carstoreapp.base.BaseActivity
import com.example.carstoreapp.fragments.CarInformationFragment

class MainActivity : BaseActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, CarInformationFragment())
            .commit()


    }
}
