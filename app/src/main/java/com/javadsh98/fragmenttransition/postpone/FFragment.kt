package com.javadsh98.fragmenttransition.postpone

import android.os.Bundle
import android.transition.TransitionInflater
import android.view.View
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import com.javadsh98.fragmenttransition.R
import kotlinx.android.synthetic.main.fragment_b.*
import java.util.concurrent.TimeUnit

class FFragment : Fragment(R.layout.fragment_b){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        postponeEnterTransition(5000, TimeUnit.MILLISECONDS)
        val transition = TransitionInflater.from(requireContext()).inflateTransition(R.transition.shared_image)
        sharedElementEnterTransition = transition

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ViewCompat.setTransitionName(imageView2, "item_2")

    }

}