package com.home.seleccion.oleg.feature_transactions.di

import com.home.seleccion.oleg.core.di.general.PerFeature
import com.home.seleccion.oleg.feature_transactions.presentation.view.FirstFlowFragment
import com.slashmobility.seleccion.oleg.feature_transactions_api.TransactionsFeatureApi
import com.home.seleccion.oleg.feature_transactions.presentation.view.SecondFlowFragment
import com.home.seleccion.oleg.feature_transactions.presentation.view.TransactionsFragment
import dagger.Component

@Component(
    dependencies = [TransactionsFeatureDependencies::class],
    modules = [TransactionsModule::class]
)
@PerFeature
internal abstract class TransactionsComponent : TransactionsFeatureApi {

    internal abstract fun inject(fragment: TransactionsFragment)
    internal abstract fun inject(fragment: SecondFlowFragment)
    internal abstract fun inject(fragment: FirstFlowFragment)

    companion object {
        fun initAndGet(transactionsFeatureDependencies: TransactionsFeatureDependencies): TransactionsComponent {
            return DaggerTransactionsComponent
                .builder()
                .transactionsFeatureDependencies(transactionsFeatureDependencies)
                .build()
        }
    }
}