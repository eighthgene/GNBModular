package com.home.seleccion.oleg.gnbtradesmodular.di.features

import com.home.seleccion.oleg.core_navigation.navigation.FeatureRouter
import com.home.seleccion.oleg.core_navigation.navigation.Navigator
import com.home.seleccion.oleg.core_navigation.navigation.NavigatorImpl
import com.home.seleccion.oleg.feature_products.di.ProductsComponentHolder
import com.home.seleccion.oleg.feature_products.di.ProductsFeatureDependencies
import com.slashmobility.seleccion.oleg.feature_products_api.ProductsFeatureApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ProductsModule {
    @Singleton
    @Provides
    fun provideProductsDependencies(
        navigator: Navigator,
        featureRouter: FeatureRouter
    ): ProductsFeatureDependencies {
        return object : ProductsFeatureDependencies {
            override fun navigator() = navigator
            override fun featureRouter() = featureRouter
        }
    }

    @Provides
    fun provideFeatureProducts(dependencies: ProductsFeatureDependencies): ProductsFeatureApi {
        ProductsComponentHolder.init(dependencies = dependencies)
        return ProductsComponentHolder.get()
    }

}