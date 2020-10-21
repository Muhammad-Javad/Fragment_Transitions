package com.javadsh98.fragmenttransition.sharedelement

import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.View
import androidx.core.view.ViewCompat
import com.javadsh98.fragmenttransition.R
import kotlinx.android.synthetic.main.fragment_c.*

class CFragment : Fragment(R.layout.fragment_c) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedElementReturnTransition = TransitionInflater.from(requireContext()).inflateTransition(R.transition.shared_image)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ViewCompat.setTransitionName(imageView3, "item_single")
        imageView3.setOnClickListener {
            (requireActivity() as SharedElementActivity).moveD(imageView3, textView_c)
        }

    }

}