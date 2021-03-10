package com.home.seleccion.oleg.core_navigation.navigation

import androidx.navigation.NavController
import com.home.seleccion.oleg.core_navigation.MainNavGraphDirections


class Navigator {
    lateinit var navController: NavController

    fun navigateToFlow(navigationFlow: NavigationFlow) = when (navigationFlow) {
        NavigationFlow.ProductsFlow -> navController.navigate(MainNavGraphDirections.actionGlobalProductsFlow())
        is NavigationFlow.TransactionsFlow -> navController.navigate(MainNavGraphDirections.actionGlobalTransactionsFlow())
    }

}