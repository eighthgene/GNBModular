package com.home.seleccion.oleg.gnbtradesmodular.di.api

import com.slashmobility.seleccion.oleg.feature_transactions_api.TransactionsFeatureApi
import com.slashmobility.seleccion.oleg.feature_transactions_api.navigation.TransactionStarter
import org.koin.dsl.module

val transactionsApi = module {

    factory<TransactionsFeatureApi> {
        object : TransactionsFeatureApi {
            override fun transactionsStarter(): TransactionStarter = get()
        }
    }
}