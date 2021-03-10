package com.home.seleccion.oleg.feature_products.di

import com.home.seleccion.oleg.feature_products.domain.interactor.ProductsInteractorImpl
import com.home.seleccion.oleg.feature_products.start.ProductsStarterImpl
import com.slashmobility.seleccion.oleg.feature_products_api.domain.ProductsInteractor
import com.slashmobility.seleccion.oleg.feature_products_api.navigation.ProductsStarter
import org.koin.dsl.module

val productsModule = module {

    factory<ProductsInteractor> {
        ProductsInteractorImpl()
    }

    factory<ProductsStarter> {
        ProductsStarterImpl(navigator = get())
    }

}
