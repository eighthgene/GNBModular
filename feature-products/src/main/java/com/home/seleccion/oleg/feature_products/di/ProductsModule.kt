package com.home.seleccion.oleg.feature_products.di

import com.home.seleccion.oleg.core.di.general.PerFeature
import com.home.seleccion.oleg.feature_products.domain.interactor.ProductsInteractorImpl
import com.home.seleccion.oleg.feature_products.start.ProductsStarterImpl
import com.slashmobility.seleccion.oleg.feature_products_api.domain.ProductsInteractor
import com.slashmobility.seleccion.oleg.feature_products_api.navigation.ProductsStarter
import dagger.Binds
import dagger.Module

@Module
internal abstract class ProductsModule {

    @PerFeature
    @Binds
    abstract fun provideProductsInteractor(productsInteractorImpl: ProductsInteractorImpl): ProductsInteractor

    @PerFeature
    @Binds
    abstract fun provideProductsStarter(productsStarterImpl: ProductsStarterImpl): ProductsStarter

}