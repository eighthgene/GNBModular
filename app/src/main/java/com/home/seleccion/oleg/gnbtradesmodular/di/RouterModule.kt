package com.home.seleccion.oleg.gnbtradesmodular.di

import com.home.seleccion.oleg.core_navigation.navigation.FeatureRouter
import com.home.seleccion.oleg.core_navigation.navigation.Navigator
import com.home.seleccion.oleg.gnbtradesmodular.router.FeatureRouterImpl
import org.koin.dsl.module

val routerModule = module {

    single<FeatureRouter> {
        FeatureRouterImpl(get(), get())
    }

    single {
        Navigator()
    }

}