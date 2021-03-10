package com.home.seleccion.oleg.feature_products.start

import com.home.seleccion.oleg.core_navigation.navigation.NavigationFlow
import com.home.seleccion.oleg.core_navigation.navigation.Navigator
import com.home.seleccion.oleg.core_navigation.navigation.NavigatorImpl
import com.slashmobility.seleccion.oleg.feature_products_api.navigation.ProductsStarter
import javax.inject.Inject

class ProductsStarterImpl @Inject constructor(private val navigator: Navigator) : ProductsStarter {

    override fun start() {
        navigator.navigateToFlow(NavigationFlow.ProductsFlow)
    }
}