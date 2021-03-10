package com.slashmobility.seleccion.oleg.feature_products_api

import com.home.seleccion.oleg.module_injector.BaseAPI
import com.slashmobility.seleccion.oleg.feature_products_api.domain.ProductsInteractor
import com.slashmobility.seleccion.oleg.feature_products_api.navigation.ProductsStarter

interface ProductsFeatureApi : BaseAPI {
    fun productsInteractor(): ProductsInteractor
    fun productsStarter(): ProductsStarter
}