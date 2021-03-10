package com.slashmobility.seleccion.oleg.feature_products_api.domain

interface ProductsInteractor {

    fun isProductActive(): Boolean
    fun toggleState()

}