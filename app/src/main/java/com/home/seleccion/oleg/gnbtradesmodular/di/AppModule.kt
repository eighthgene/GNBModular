package com.home.seleccion.oleg.gnbtradesmodular.di

import android.content.Context
import com.home.seleccion.oleg.gnbtradesmodular.App.Companion.appContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideContext(): Context {
        return appContext
    }


}