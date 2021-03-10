package com.home.seleccion.oleg.feature_transactions.di

import com.home.seleccion.oleg.feature_transactions.start.TransactionsStarterImpl
import com.slashmobility.seleccion.oleg.feature_transactions_api.navigation.TransactionStarter
import org.koin.dsl.module

val transactionsModule = module {

    factory<TransactionStarter> {
        TransactionsStarterImpl(navigator = get())
    }

}

