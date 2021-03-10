package com.home.seleccion.oleg.gnbtradesmodular.di.features

import com.home.seleccion.oleg.core_navigation.navigation.FeatureRouter
import com.home.seleccion.oleg.core_navigation.navigation.Navigator
import com.home.seleccion.oleg.core_navigation.navigation.NavigatorImpl
import com.slashmobility.seleccion.oleg.feature_transactions_api.TransactionsFeatureApi
import com.home.seleccion.oleg.feature_transactions.di.TransactionsComponentHolder
import com.home.seleccion.oleg.feature_transactions.di.TransactionsFeatureDependencies
import com.slashmobility.seleccion.oleg.feature_products_api.ProductsFeatureApi
import com.slashmobility.seleccion.oleg.feature_products_api.domain.ProductsInteractor
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class TransactionsModule {

    @Singleton
    @Provides
    fun provideTransactionsDependencies(
        productsFeatureApi: ProductsFeatureApi,
        navigator: Navigator,
        featureRouter: FeatureRouter
    ): TransactionsFeatureDependencies {
        return object : TransactionsFeatureDependencies {
            override fun navigator() = navigator
            override fun productsInteractor(): ProductsInteractor = productsFeatureApi.productsInteractor()
            override fun featureRouter() = featureRouter
        }
        //override fun productsStarter(): ProductsStarter = productsFeatureApi.productsStarter()
    }

    @Provides
    fun provideFeatureTransactions(dependencies: TransactionsFeatureDependencies): TransactionsFeatureApi {
        TransactionsComponentHolder.init(dependencies = dependencies)
        return TransactionsComponentHolder.get()
    }
}

