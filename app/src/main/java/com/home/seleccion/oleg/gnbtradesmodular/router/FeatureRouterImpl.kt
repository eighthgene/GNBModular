package com.home.seleccion.oleg.gnbtradesmodular.router

import com.home.seleccion.oleg.core_navigation.navigation.FeatureRouter
import com.home.seleccion.oleg.core_navigation.navigation.NavigationFlow
import com.slashmobility.seleccion.oleg.feature_transactions_api.TransactionsFeatureApi
import com.slashmobility.seleccion.oleg.feature_products_api.ProductsFeatureApi
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class FeatureRouterImpl @Inject constructor(
    private val productsFeatureApi: Provider<ProductsFeatureApi>,
    private val transactionsFeatureApi: Provider<TransactionsFeatureApi>
) : FeatureRouter {

    override fun navigate(navigationFlow: NavigationFlow) {
        when (navigationFlow) {
            NavigationFlow.ProductsFlow -> productsFeatureApi.get().productsStarter().start()
            is NavigationFlow.TransactionsFlow -> transactionsFeatureApi.get().transactionsStarter().start()
        }
    }
}