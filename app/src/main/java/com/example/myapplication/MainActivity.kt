package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() ,View.OnClickListener{

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.testview.apply {
            isVisible=false
            text="Aditya Raj Raizada"
        }
        binding.edittext.apply {
            hint="Enter your Name"
            addTextChangedListener {
                Log.i("ViewBinding",it.toString())
                binding.button.isEnabled = it.toString().length>6
            }
        }
        binding.button.setOnClickListener {
            Toast.makeText(it.context,"Hello",Toast.LENGTH_SHORT).show()
        }
        binding.button.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View) {
                Toast.makeText(p0.context,"Hello ano function",Toast.LENGTH_SHORT).show()
            }
        })
        binding.button.setOnClickListener(this)

    }

    fun getToast(view: android.view.View) {
        Toast.makeText(this, "Button is clicked", Toast.LENGTH_SHORT).show()
    }

    override fun onClick(p0: View) {
        Toast.makeText(p0.context,"Hello ano interface function",Toast.LENGTH_SHORT).show()
    }

}
