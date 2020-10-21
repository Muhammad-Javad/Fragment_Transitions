package com.javadsh98.fragmenttransition.transition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.javadsh98.fragmenttransition.R
import kotlinx.android.synthetic.main.activity_transition.*

class TransitionActivity : AppCompatActivity(), NavigationImpl{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition)

        supportFragmentManager.beginTransaction()
            .replace(R.id.constraintlayout_transition, AFragment())
            .commit()

    }

    override fun moveB() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.constraintlayout_transition, BFragment())
            .addToBackStack(null)
            .commit()
    }
}