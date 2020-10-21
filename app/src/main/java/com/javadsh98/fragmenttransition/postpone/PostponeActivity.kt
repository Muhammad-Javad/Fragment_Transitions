package com.javadsh98.fragmenttransition.postpone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.javadsh98.fragmenttransition.R

class PostponeActivity : AppCompatActivity(), PostponeNavigation {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_postpne)

        supportFragmentManager.beginTransaction()
            .replace(R.id.constraintlayout_postpone, EFragment())
            .commit()

    }

    override fun moveF(imageView: ImageView) {

        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .addSharedElement(imageView, "item_2")
            .replace(R.id.constraintlayout_postpone, FFragment())
            .addToBackStack(null)
            .commit()

    }

}