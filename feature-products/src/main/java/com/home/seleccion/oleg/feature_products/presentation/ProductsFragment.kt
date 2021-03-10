package com.home.seleccion.oleg.feature_products.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.home.seleccion.oleg.core_navigation.navigation.FeatureRouter
import com.home.seleccion.oleg.core_navigation.navigation.NavigationFlow
import com.home.seleccion.oleg.feature_products.R
import com.home.seleccion.oleg.feature_products.di.ProductsComponentHolder
import com.slashmobility.seleccion.oleg.feature_products_api.domain.ProductsInteractor
import kotlinx.android.synthetic.main.fragment_products.*
import timber.log.Timber
import javax.inject.Inject

class ProductsFragment : Fragment() {

    @Inject
    lateinit var featureRouter: FeatureRouter

    @Inject
    lateinit var productsInteractor: ProductsInteractor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ProductsComponentHolder.getComponent().inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_products, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Timber.d("Interactor $productsInteractor")

        transactions_btn.setOnClickListener {
            featureRouter.navigate(NavigationFlow.TransactionsFlow(""))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        ProductsComponentHolder.reset()
    }

}