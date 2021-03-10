package com.home.seleccion.oleg.gnbtradesmodular.router

import com.home.seleccion.oleg.core_navigation.navigation.FeatureRouter
import com.home.seleccion.oleg.core_navigation.navigation.NavigationFlow
import com.slashmobility.seleccion.oleg.feature_products_api.ProductsFeatureApi
import com.slashmobility.seleccion.oleg.feature_transactions_api.TransactionsFeatureApi


class FeatureRouterImpl constructor(
    private val productsFeatureApi: ProductsFeatureApi,
    private val transactionsFeatureApi: TransactionsFeatureApi
) : FeatureRouter {

    override fun navigate(navigationFlow: NavigationFlow) {
        when (navigationFlow) {
            NavigationFlow.ProductsFlow -> productsFeatureApi.productsStarter().start()
            is NavigationFlow.TransactionsFlow -> transactionsFeatureApi.transactionsStarter().start()
        }
    }
}