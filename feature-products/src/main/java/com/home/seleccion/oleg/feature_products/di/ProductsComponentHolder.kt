package com.home.seleccion.oleg.feature_products.di

import com.home.seleccion.oleg.module_injector.ComponentHolder
import com.slashmobility.seleccion.oleg.feature_products_api.ProductsFeatureApi
import timber.log.Timber


object ProductsComponentHolder : ComponentHolder<ProductsFeatureApi, ProductsFeatureDependencies> {
    private var productsFeatureComponent: ProductsComponent? = null

    override fun init(dependencies: ProductsFeatureDependencies) {
        Timber.d("ProductsComponentHolder Init()")
        if (productsFeatureComponent == null) {
            synchronized(ProductsComponentHolder::class.java) {
                if (productsFeatureComponent == null) {
                    Timber.d("ProductsComponentHolder Init() create new instance")
                    productsFeatureComponent = ProductsComponent.initAndGet(dependencies)
                }
            }
        }
    }

    override fun get(): ProductsFeatureApi {
        checkNotNull(productsFeatureComponent) { "ProductsComponent was not initialized!" }
        return productsFeatureComponent!!
    }

    internal fun getComponent(): ProductsComponent {
        checkNotNull(productsFeatureComponent) { "ProductsFeatureComponent was not initialized!" }
        return productsFeatureComponent!!
    }

    override fun reset() {
        Timber.d("ProductsComponentHolder reset()")
        productsFeatureComponent = null
    }

}