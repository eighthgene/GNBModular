package com.home.seleccion.oleg.feature_transactions.presentation.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.home.seleccion.oleg.feature_transactions.R
import com.slashmobility.seleccion.oleg.feature_products_api.domain.ProductsInteractor
import kotlinx.android.synthetic.main.fragment_first_flow.*
import org.koin.android.ext.android.inject
import timber.log.Timber


class FirstFlowFragment : Fragment(R.layout.fragment_first_flow) {


    private val productsInteractor: ProductsInteractor by inject()

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