package com.saif.jetpacknavigationexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()

        btn_view_balance.setOnClickListener {
            val navOption = NavOptions.Builder()
                .setEnterAnim(R.anim.slide_in_right)
                .setExitAnim(R.anim.slide_out_left)
                .setPopEnterAnim(R.anim.slide_in_left)
                .setPopExitAnim(R.anim.slide_out_right)
                .build()

//            id method with animation as options
//            navController.navigate(R.id.viewBalanceFragment,null,navOption)
//            val action = HomeFragmentDirections.actionHomeFragmentToViewBalanceFragment()
//            navController.navigate(action)

            //action id
            //navController.navigate(R.id.action_homeFragment_to_viewBalanceFragment)

            //direction class
            val action = HomeFragmentDirections.actionHomeFragmentToViewBalanceFragment()
            navController.navigate(action)

        }

        btn_send_cash.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToSendcashFragment()
            navController.navigate(action)
        }

        btn_transactions.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToViewTransactionsFragment()
            navController.navigate(action)
        }

        btn_send_money.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToChooseReceiverFragment()
            navController.navigate(action)
        }

    }

}