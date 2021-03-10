package com.home.seleccion.oleg.feature_transactions.di

import com.home.seleccion.oleg.module_injector.ComponentHolder
import com.slashmobility.seleccion.oleg.feature_transactions_api.TransactionsFeatureApi
import timber.log.Timber

object TransactionsComponentHolder :
    ComponentHolder<TransactionsFeatureApi, TransactionsFeatureDependencies> {

    private var transactionsComponent: TransactionsComponent? = null

    override fun init(dependencies: TransactionsFeatureDependencies) {
        Timber.d("TransactionsComponentHolder Init()")
        if (transactionsComponent == null) {
            synchronized(TransactionsComponentHolder::class.java) {
                if (transactionsComponent == null) {
                    Timber.d("TransactionsComponentHolder Init() create new instance")
                    transactionsComponent = TransactionsComponent.initAndGet(dependencies)
                }
            }
        }
    }

    override fun get(): TransactionsFeatureApi {
        checkNotNull(transactionsComponent) { "TransactionsComponent was not initialized!" }
        return transactionsComponent!!
    }

    internal fun getComponent(): TransactionsComponent {
        checkNotNull(transactionsComponent) { "TransactionsComponent was not initialized!" }
        return transactionsComponent!!
    }

    override fun reset() {
        Timber.d("TransactionsComponent reset()")
        transactionsComponent = null
    }
}