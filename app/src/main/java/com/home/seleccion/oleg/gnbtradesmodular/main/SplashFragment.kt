package com.home.seleccion.oleg.gnbtradesmodular.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.home.seleccion.oleg.core_navigation.navigation.FeatureRouter
import com.home.seleccion.oleg.core_navigation.navigation.NavigationFlow
import com.home.seleccion.oleg.gnbtradesmodular.R
import com.home.seleccion.oleg.gnbtradesmodular.di.AppComponent
import javax.inject.Inject

class SplashFragment : Fragment() {

    @Inject
    lateinit var featureRouter: FeatureRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppComponent.get().inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        context?.let { featureRouter.navigate(NavigationFlow.ProductsFlow) }
    }
}