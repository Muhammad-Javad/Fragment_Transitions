package com.javadsh98.fragmenttransition.transition

import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.javadsh98.fragmenttransition.R

class BFragment : Fragment(R.layout.fragment_b) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val trasition = TransitionInflater.from(requireContext())
            .inflateTransition(R.transition.slide_right)

        enterTransition = trasition

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}