package com.home.seleccion.oleg.feature_products.domain.interactor

import com.slashmobility.seleccion.oleg.feature_products_api.domain.ProductsInteractor
import javax.inject.Inject

class ProductsInteractorImpl @Inject constructor() : ProductsInteractor {

    private var state = true

    override fun isProductActive() = state

    override fun toggleState() {
        state = !state
    }

}