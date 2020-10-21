package com.javadsh98.fragmenttransition.sharedelement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.javadsh98.fragmenttransition.R
import kotlinx.android.synthetic.main.activity_shared_element.*

class SharedElementActivity : AppCompatActivity(), Navigation {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_element)

        supportFragmentManager.beginTransaction()
            .replace(R.id.constrainlayout_shared_element, CFragment())
            .commit()

    }

    override fun moveD(imageView: ImageView, title: TextView) {

        supportFragmentManager.beginTransaction()
            .addSharedElement(imageView, "item_detail")
            .replace(R.id.constrainlayout_shared_element, DFragment())
            .addToBackStack(null)
            .commit()


    }


}