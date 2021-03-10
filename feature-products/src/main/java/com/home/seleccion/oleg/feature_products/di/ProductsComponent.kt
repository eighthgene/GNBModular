package com.home.seleccion.oleg.feature_products.di

import com.home.seleccion.oleg.core.di.general.PerFeature
import com.home.seleccion.oleg.feature_products.presentation.ProductsFragment
import com.slashmobility.seleccion.oleg.feature_products_api.ProductsFeatureApi
import dagger.Component

@Component(
    dependencies = [ProductsFeatureDependencies::class],
    modules = [ProductsModule::class]
)
@PerFeature
internal abstract class ProductsComponent : ProductsFeatureApi {

    internal abstract fun inject(productsFragment: ProductsFragment)

    companion object {
        fun initAndGet(productsFeatureDependencies: ProductsFeatureDependencies): ProductsComponent {
            return DaggerProductsComponent.builder()
                .productsFeatureDependencies(productsFeatureDependencies)
                .build()
        }
    }
}

