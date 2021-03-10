package com.home.seleccion.oleg.gnbtradesmodular.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.home.seleccion.oleg.core_navigation.navigation.NavigatorImpl
import com.home.seleccion.oleg.gnbtradesmodular.R
import com.home.seleccion.oleg.gnbtradesmodular.di.AppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var navigatorImpl: NavigatorImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppComponent.get().inject(this)

        val navController = findNavController(R.id.nav_host_fragment)

        navigatorImpl.navController = navController
    }

}