package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main2_activity)
        val name:TextView =findViewById(R.id.nameDisplay)
        val date:TextView=findViewById(R.id.dobDisplay)
        val address:TextView =findViewById(R.id.addressDisplay)
        val x: String? = intent.getStringExtra("username")
        val y: String? = intent.getStringExtra("userDob")
        val z: String? = intent.getStringExtra("userAddress")
        name.text = x.orEmpty()
        date.text = y.orEmpty()
        address.text = z.orEmpty()
    }
}