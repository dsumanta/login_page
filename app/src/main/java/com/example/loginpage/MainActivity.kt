package com.example.loginpage

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.DatePicker
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var datePickerDialog: DatePickerDialog
        val nameEditText: EditText = findViewById(R.id.userName)
        val dateEditText: EditText = findViewById(R.id.dob)
        val addressEditText: EditText = findViewById(R.id.address)
        val btn: Button = findViewById(R.id.button)
        dateEditText.keyListener=null
        dateEditText.setOnClickListener {
            val c = Calendar.getInstance()
            val day = c.get(Calendar.DAY_OF_MONTH)
            val month = c.get(Calendar.MONTH)
            val year = c.get(Calendar.YEAR)
            datePickerDialog = DatePickerDialog(
                this@MainActivity,
                DatePickerDialog.OnDateSetListener { view: DatePicker?, year: Int, month: Int, dayOfMonth: Int ->
                    dateEditText.setText("$dayOfMonth/${month + 1}/$year")
                },
                year,
                month,
                day
            )
            datePickerDialog.show()
        }

        btn.setOnClickListener {
            val name = nameEditText.text.toString()
            val dob = dateEditText.text.toString()
            val address = addressEditText.text.toString()
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("username", name)
            intent.putExtra("userDob", dob)
            intent.putExtra("userAddress", address)
            startActivity(intent)
        }
    }
}
