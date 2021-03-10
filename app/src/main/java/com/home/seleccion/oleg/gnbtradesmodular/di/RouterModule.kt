package com.home.seleccion.oleg.gnbtradesmodular.di

import com.home.seleccion.oleg.core_navigation.navigation.FeatureRouter
import com.home.seleccion.oleg.gnbtradesmodular.router.FeatureRouterImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class RouterModule {

    @Singleton
    @Binds
    abstract fun provideRouter(routerImpl: FeatureRouterImpl): FeatureRouter
}