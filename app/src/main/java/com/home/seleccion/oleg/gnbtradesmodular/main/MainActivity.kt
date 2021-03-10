package com.home.seleccion.oleg.gnbtradesmodular.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.home.seleccion.oleg.core_navigation.navigation.Navigator
import com.home.seleccion.oleg.gnbtradesmodular.R
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val navigator: Navigator by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navController = findNavController(R.id.nav_host_fragment)

        navigator.navController = navController
    }

}