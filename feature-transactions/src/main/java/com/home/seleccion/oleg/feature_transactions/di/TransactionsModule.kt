package com.home.seleccion.oleg.feature_transactions.di

import com.home.seleccion.oleg.core.di.general.PerFeature
import com.home.seleccion.oleg.feature_transactions.start.TransactionsStarterImpl
import com.slashmobility.seleccion.oleg.feature_transactions_api.navigation.TransactionStarter
import dagger.Binds
import dagger.Module

@Module
internal abstract class TransactionsModule {

    @PerFeature
    @Binds
    abstract fun provideProductsStarter(transactionsStarterImpl: TransactionsStarterImpl): TransactionStarter

}