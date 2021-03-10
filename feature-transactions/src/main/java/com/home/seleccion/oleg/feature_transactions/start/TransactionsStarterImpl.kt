package com.home.seleccion.oleg.feature_transactions.start

import com.home.seleccion.oleg.core_navigation.navigation.NavigationFlow
import com.home.seleccion.oleg.core_navigation.navigation.Navigator
import com.slashmobility.seleccion.oleg.feature_transactions_api.navigation.TransactionStarter

class TransactionsStarterImpl constructor(private val navigator: Navigator) : TransactionStarter {
    override fun start() {
        navigator.navigateToFlow(NavigationFlow.TransactionsFlow(""))
    }
}