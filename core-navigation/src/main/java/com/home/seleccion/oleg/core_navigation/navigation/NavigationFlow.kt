package com.home.seleccion.oleg.core_navigation.navigation

sealed class NavigationFlow {
  object ProductsFlow : NavigationFlow()
  class TransactionsFlow(val product: String) : NavigationFlow()

}