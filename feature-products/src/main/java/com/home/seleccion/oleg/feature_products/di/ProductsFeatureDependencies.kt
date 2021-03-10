package com.home.seleccion.oleg.feature_products.di

import com.home.seleccion.oleg.core_navigation.navigation.FeatureRouter
import com.home.seleccion.oleg.core_navigation.navigation.Navigator
import com.home.seleccion.oleg.core_navigation.navigation.NavigatorImpl
import com.home.seleccion.oleg.module_injector.BaseDependencies

interface ProductsFeatureDependencies : BaseDependencies {
    fun navigator(): Navigator
    fun featureRouter(): FeatureRouter
}