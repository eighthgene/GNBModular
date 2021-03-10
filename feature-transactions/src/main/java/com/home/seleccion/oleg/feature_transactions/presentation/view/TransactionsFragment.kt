package com.home.seleccion.oleg.feature_transactions.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.home.seleccion.oleg.feature_transactions.R
import kotlinx.android.synthetic.main.fragment_transactions.*
import timber.log.Timber


class TransactionsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transactions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        transactions_start_flow.setOnClickListener {
            findNavController().navigate(TransactionsFragmentDirections.actionTransactionsFragmentToFirstFlowFragment())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("TransactionsFragment onDestroy()")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("TransactionsFragment onPause()")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("TransactionsFragment onResume()")
    }

}