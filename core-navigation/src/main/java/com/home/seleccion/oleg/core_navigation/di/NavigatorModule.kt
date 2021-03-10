package com.home.seleccion.oleg.core_navigation.di

import com.home.seleccion.oleg.core_navigation.navigation.Navigator
import com.home.seleccion.oleg.core_navigation.navigation.NavigatorImpl
import dagger.Binds
import dagger.Module

@Module
interface NavigatorModule {

    @Binds
    fun provideNavigator(navigatorImpl: NavigatorImpl): Navigator
}