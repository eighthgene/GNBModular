package com.home.seleccion.oleg.gnbtradesmodular

import android.app.Application
import android.content.Context
import com.home.seleccion.oleg.gnbtradesmodular.di.AppComponent
import com.home.seleccion.oleg.gnbtradesmodular.di.DaggerAppComponent
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext

        Timber.plant(Timber.DebugTree())

        AppComponent.init(
            DaggerAppComponent
                .builder()
                .build()
        )
    }

    companion object {
        @Volatile
        lateinit var appContext: Context
            private set
    }
}
