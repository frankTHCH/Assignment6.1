package com.example.assignment6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val not = Toast.makeText(applicationContext, "กรุณากรอกให้ครบทุกช่อง", Toast.LENGTH_LONG)
        val nonum2 = Toast.makeText(applicationContext, "ห้ามกรอกช่อง Num2 = 0 !!", Toast.LENGTH_LONG)
        val numm2 = Toast.makeText(applicationContext, "กรอกค่า Num2", Toast.LENGTH_LONG)
        var n1 = 0
        var n2 = 0
        plus.setOnClickListener {
            if (num1.text.toString() != "" && num2.text.toString() != "") {
                aaa.setText("+")
                n1 = num1.text.toString().toInt()
                n2 = num2.text.toString().toInt()
                var total = n1 + n2
                ans.setText("$total")
            } else if (num1.text.toString() == "" && num2.text.toString() == "") {
                not.show()
            } else if (num2.text.toString() == "") {
                numm2.show()
            } else {
                not.show()
            }
        }
        val N2 = Toast.makeText(applicationContext, "กรอกค่า Num2", Toast.LENGTH_LONG)
        minus.setOnClickListener {
            if (num1.text.toString() != "" && num2.text.toString() != "") {
                aaa.setText("-")
                n1 = num1.text.toString().toInt()
                n2 = num2.text.toString().toInt()
                var total = n1 - n2
                ans.setText("$total")
            } else if (num1.text.toString() == "" && num2.text.toString() == "") {
                not.show()
            } else if (num2.text.toString() == "") {
                N2.show()
            } else {
                not.show()
            }
        }
        multiply.setOnClickListener {
            if (num1.text.toString() != "" && num2.text.toString() != "") {
                aaa.setText("x")
                n1 = num1.text.toString().toInt()
                n2 = num2.text.toString().toInt()
                var total = n1 * n2
                ans.setText("$total")
            } else if (num1.text.toString() == "" && num2.text.toString() == "") {
                not.show()
            } else if (num2.text.toString() == "") {
                N2.show()
            } else {
                not.show()
            }
        }

        divider.setOnClickListener {
            if (num2.text.toString() == "") {
                numm2.show()
            } else if (num2.text.toString() == "0") {
                nonum2.show()
            } else if (num1.text.toString() != "" && num2.text.toString() != "") {
                aaa.setText("÷")
                var n3:Double = num1.text.toString().toDouble()
                var n4:Double = num2.text.toString().toDouble()
                var total:Double = n3 / n4
                ans.setText("$total")
            } else if (num1.text.toString() == "") {
                not.show()
            } else {
                not.show()
            }
        }
        modulo.setOnClickListener {
            if (num2.text.toString() == "") {
                numm2.show()
            } else if (num2.text.toString() == "0") {
                nonum2.show()
            } else if (num1.text.toString() != "" && num2.text.toString() != "") {
                aaa.setText("%")
                n1 = num1.text.toString().toInt()
                n2 = num2.text.toString().toInt()
                var total = n1 % n2
                ans.setText("$total")
            } else if (num1.text.toString() == "") {
                not.show()
            } else {
                not.show()
            }
        }

       clear.setOnClickListener {
           num1.setText("")
           num2.setText("")
           aaa.setText("")
           ans.setText("")
       }

    }
}
