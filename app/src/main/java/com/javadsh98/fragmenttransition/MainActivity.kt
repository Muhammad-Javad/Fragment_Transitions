package com.javadsh98.fragmenttransition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.javadsh98.fragmenttransition.postpone.PostponeActivity
import com.javadsh98.fragmenttransition.sharedelement.SharedElementActivity
import com.javadsh98.fragmenttransition.transition.TransitionActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_main_transition.setOnClickListener {
            startActivity(Intent(this, TransitionActivity::class.java))
        }

        button_main_shared_element.setOnClickListener {
            startActivity(Intent(this, SharedElementActivity::class.java))
        }

        button_postpone.setOnClickListener {
            startActivity(Intent(this, PostponeActivity::class.java))
        }

    }
}