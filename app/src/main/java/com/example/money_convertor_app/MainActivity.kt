package com.example.money_convertor_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

// adding the imports for the Button
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // assigning the convert button to a variable
        val button = findViewById<Button>(R.id.convert)


        // updating the Rupee value variable when the Convert button is clicked
        button?.setOnClickListener()
        {
            // getting the current inputted USD value
            val usdInput = findViewById<EditText>(R.id.inputtedUSD)
            val usdValue = usdInput.getText().toString()

            // converting USD to Rupee
            val convertedRupee = (usdValue.toInt())*85.74

            // assigning the rupee output as a variable
            val rupeeOutput = findViewById<TextView>(R.id.outputRupee)
            // updating the rupee output
            rupeeOutput.text = convertedRupee.toString()
    }


}
}