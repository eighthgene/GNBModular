package com.home.seleccion.oleg.core_navigation.navigation

import androidx.navigation.NavController
import com.home.seleccion.oleg.core_navigation.MainNavGraphDirections
import com.home.seleccion.oleg.core_navigation.navigation.NavigationFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NavigatorImpl @Inject constructor() : Navigator {
    lateinit var navController: NavController

    override fun navigateToFlow(navigationFlow: NavigationFlow) = when (navigationFlow) {
        NavigationFlow.ProductsFlow -> navController.navigate(MainNavGraphDirections.actionGlobalProductsFlow())
        is NavigationFlow.TransactionsFlow -> navController.navigate(MainNavGraphDirections.actionGlobalTransactionsFlow())
    }

}