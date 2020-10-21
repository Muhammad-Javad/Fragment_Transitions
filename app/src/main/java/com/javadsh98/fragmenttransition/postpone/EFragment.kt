package com.javadsh98.fragmenttransition.postpone

import android.os.Bundle
import android.transition.TransitionInflater
import android.view.View
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import com.javadsh98.fragmenttransition.R
import kotlinx.android.synthetic.main.fragment_a.*

class EFragment : Fragment(R.layout.fragment_a){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val transition = TransitionInflater.from(requireContext()).inflateTransition(R.transition.shared_image)
        sharedElementReturnTransition = transition

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ViewCompat.setTransitionName(imageView, "item_1")

        button_a.setOnClickListener {
            (requireActivity() as PostponeNavigation).moveF(imageView)
        }

    }


}