package com.slashmobility.seleccion.oleg.feature_transactions_api

import com.home.seleccion.oleg.module_injector.BaseAPI
import com.slashmobility.seleccion.oleg.feature_transactions_api.navigation.TransactionStarter

interface TransactionsFeatureApi : BaseAPI {
    fun transactionsStarter() : TransactionStarter
}