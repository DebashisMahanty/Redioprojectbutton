package com.example.iteradmin.redioprojectbutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup = findViewById<RadioGroup>(R.id.rediogroup)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.first -> {
                    Toast.makeText(applicationContext, "no", Toast.LENGTH_LONG).show()
                }
                R.id.second -> {
                    Toast.makeText(applicationContext, "no", Toast.LENGTH_LONG).show()
                }
                R.id.third -> {
                    Toast.makeText(applicationContext, "no", Toast.LENGTH_LONG).show()

                }
                R.id.fourth -> {
                    Toast.makeText(applicationContext, "no", Toast.LENGTH_LONG).show()

                }
            }
        }
    }
}
