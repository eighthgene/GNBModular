package com.home.seleccion.oleg.feature_transactions.di

import com.home.seleccion.oleg.core_navigation.navigation.FeatureRouter
import com.home.seleccion.oleg.core_navigation.navigation.Navigator
import com.home.seleccion.oleg.core_navigation.navigation.NavigatorImpl
import com.home.seleccion.oleg.module_injector.BaseDependencies
import com.slashmobility.seleccion.oleg.feature_products_api.domain.ProductsInteractor

interface TransactionsFeatureDependencies : BaseDependencies {
    fun featureRouter(): FeatureRouter
    fun navigator(): Navigator
    fun productsInteractor(): ProductsInteractor

}