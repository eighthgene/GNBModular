package com.home.seleccion.oleg.gnbtradesmodular

import android.app.Application
import com.home.seleccion.oleg.feature_products.di.productsModule
import com.home.seleccion.oleg.feature_transactions.di.transactionsModule
import com.home.seleccion.oleg.gnbtradesmodular.di.api.productsApi
import com.home.seleccion.oleg.gnbtradesmodular.di.api.transactionsApi
import com.home.seleccion.oleg.gnbtradesmodular.di.routerModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        //appContext = applicationContext

        Timber.plant(Timber.DebugTree())


        startKoin {
            androidContext(this@App)
            if (BuildConfig.DEBUG) androidLogger(Level.DEBUG)
            modules(appModules + featureModules + apiModules)
        }
    }

}


val appModules = listOf(routerModule)
val featureModules = listOf(transactionsModule, productsModule)
val apiModules = listOf(productsApi, transactionsApi)