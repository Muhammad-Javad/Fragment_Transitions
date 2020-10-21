package com.javadsh98.fragmenttransition.transition

import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.javadsh98.fragmenttransition.R
import kotlinx.android.synthetic.main.fragment_a.*


class AFragment : Fragment(R.layout.fragment_a) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //transition must define in onCreate
        val transition = TransitionInflater.from(requireContext())
            .inflateTransition(R.transition.fade)

        exitTransition = transition

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_a.setOnClickListener {
            (requireActivity() as TransitionActivity).moveB()
        }

    }

}