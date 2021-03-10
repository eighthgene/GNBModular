package com.home.seleccion.oleg.gnbtradesmodular.di.api

import com.slashmobility.seleccion.oleg.feature_products_api.ProductsFeatureApi
import com.slashmobility.seleccion.oleg.feature_products_api.domain.ProductsInteractor
import com.slashmobility.seleccion.oleg.feature_products_api.navigation.ProductsStarter
import org.koin.dsl.module

val productsApi = module {

    factory<ProductsFeatureApi> {
        object : ProductsFeatureApi {
            override fun productsInteractor(): ProductsInteractor = get()

            override fun productsStarter(): ProductsStarter = get()
        }
    }
}