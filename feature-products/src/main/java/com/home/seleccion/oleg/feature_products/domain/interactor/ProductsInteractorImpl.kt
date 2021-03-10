package com.home.seleccion.oleg.feature_products.domain.interactor

import com.slashmobility.seleccion.oleg.feature_products_api.domain.ProductsInteractor

class ProductsInteractorImpl() : ProductsInteractor {

    private var state = true

    override fun isProductActive() = state

    override fun toggleState() {
        state = !state
    }

}