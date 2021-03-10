package com.home.seleccion.oleg.feature_transactions.presentation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.home.seleccion.oleg.feature_transactions.R
import com.home.seleccion.oleg.feature_transactions.di.TransactionsComponentHolder
import com.slashmobility.seleccion.oleg.feature_products_api.domain.ProductsInteractor
import kotlinx.android.synthetic.main.fragment_first_flow.*
import timber.log.Timber
import javax.inject.Inject


class FirstFlowFragment : Fragment(R.layout.fragment_first_flow) {

    @Inject
    lateinit var productsInteractor: ProductsInteractor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TransactionsComponentHolder.getComponent().inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonText = "State: ${productsInteractor.isProductActive()}"
        setButtonText(buttonText)

        transactions_toggle.setOnClickListener {
            productsInteractor.toggleState()
            val updatedButtonText = "State: ${productsInteractor.isProductActive()}"
            setButtonText(updatedButtonText)
        }

        next_first_btn.setOnClickListener {
            findNavController().navigate(FirstFlowFragmentDirections.actionFirstFlowFragmentToSecondFlowFragment())
        }
    }

    private fun setButtonText(buttonText: String) {
        transactions_toggle.text = buttonText
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("FirstFlowFragment onDestroy()")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("FirstFlowFragment onPause()")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("FirstFlowFragment onResume()")
    }
}