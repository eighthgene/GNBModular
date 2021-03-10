package com.home.seleccion.oleg.feature_transactions.presentation.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.home.seleccion.oleg.core_navigation.navigation.FeatureRouter
import com.home.seleccion.oleg.core_navigation.navigation.NavigationFlow
import com.home.seleccion.oleg.feature_transactions.R
import com.slashmobility.seleccion.oleg.feature_products_api.domain.ProductsInteractor
import kotlinx.android.synthetic.main.fragment_second_flow.*
import org.koin.android.ext.android.inject
import timber.log.Timber

class SecondFlowFragment : Fragment(R.layout.fragment_second_flow) {

    private val productsInteractor: ProductsInteractor by inject()
    private val featureRouter: FeatureRouter by inject()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        second_fragment_data.text = productsInteractor.isProductActive().toString()

        transactions_to_products.setOnClickListener {
            featureRouter.navigate(NavigationFlow.ProductsFlow)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("SecondFlowFragment onDestroy()")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("SecondFlowFragment onPause()")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("SecondFlowFragment onResume()")
    }
}