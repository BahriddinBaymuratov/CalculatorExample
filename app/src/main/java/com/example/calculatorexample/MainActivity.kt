package com.example.calculatorexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.example.calculatorexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.btnAdd.setOnClickListener {
            val num1 = binding.editOne.text.toString().trim()
            val num2 = binding.editTwo.text.toString().trim()
            if (isNotEmpty(num1, num2)) {
                val sum = add(num1.toInt(), num2.toInt())
                binding.textResult.text = sum
            } else {
                toast("Enter data !!")
            }
        }
        binding.btnMul.setOnClickListener {
            val num1 = binding.editOne.text.toString().trim()
            val num2 = binding.editTwo.text.toString().trim()
            if (isNotEmpty(num1, num2)) {
                val sum = mul(num1.toInt(), num2.toInt())
                binding.textResult.text = sum
            } else {
                toast("Enter data!!")
            }
        }
        binding.btnDiv.setOnClickListener {
            val num1 = binding.editOne.text.toString().trim()
            val num2 = binding.editTwo.text.toString().trim()
            if (isNotEmpty(num1, num2)) {
                val sum = div(num1.toInt(), num2.toInt())
                binding.textResult.text = sum
            }
        }
        binding.btnSub.setOnClickListener {
            val num1 = binding.editOne.text.toString().trim()
            val num2 = binding.editTwo.text.toString().trim()
            if (isNotEmpty(num1, num2)) {
                val sum = sub(num1.toInt(), num2.toInt())
                binding.textResult.text = sum
            }
        }
    }

    private fun add(a: Int, b: Int): String {
        return (a + b).toString()
    }

    private fun mul(a: Int, b: Int): String {
        return (a * b).toString()
    }

    private fun sub(a: Int, b: Int): String {
        return (a - b).toString()
    }

    private fun div(a: Int, b: Int): String {
        return (a / b).toString()
    }

    private fun isNotEmpty(s1: String, s2: String): Boolean {
        return !(TextUtils.isEmpty(s1) && TextUtils.isEmpty(s2))
    }

    private fun toast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}