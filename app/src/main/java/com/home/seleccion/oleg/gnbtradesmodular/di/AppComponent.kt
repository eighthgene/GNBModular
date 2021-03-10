package com.home.seleccion.oleg.gnbtradesmodular.di

import com.home.seleccion.oleg.core_navigation.di.NavigatorModule
import com.home.seleccion.oleg.gnbtradesmodular.di.features.ProductsModule
import com.home.seleccion.oleg.gnbtradesmodular.di.features.TransactionsModule
import com.home.seleccion.oleg.gnbtradesmodular.main.MainActivity
import com.home.seleccion.oleg.gnbtradesmodular.main.SplashFragment
import dagger.Component
import dagger.internal.Preconditions
import javax.inject.Singleton


@Component(
    modules = [
        AppModule::class,
        RouterModule::class,
        TransactionsModule::class,
        ProductsModule::class,
        NavigatorModule::class
    ]
)
@Singleton
abstract class AppComponent {
    abstract fun inject(mainActivity: MainActivity)
    abstract fun inject(splashFragment: SplashFragment)

    companion object {
        @Volatile
        private var instance: AppComponent? = null

        fun get(): AppComponent {
            return Preconditions.checkNotNull(
                instance,
                "AppComponent is not initialized yet. Call init first."
            )!!
        }

        fun init(component: AppComponent) {
            require(instance == null) { "AppComponent is already initialized." }
            instance = component
        }
    }
}

