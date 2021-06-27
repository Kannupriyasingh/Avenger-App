package com.kannupriya.project1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var etMobileNumber: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    lateinit var txtForgotPassword: TextView
    lateinit var txtRegister: TextView
    val validMobileNumber = "0123456789"
    val validPassword = arrayOf("tony", "steve", "bruce", "thanos")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title = " Log In"

        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtRegister = findViewById(R.id.txtRegister)




        //Lamda representation
        btnLogin.setOnClickListener{
            val mobileNumber = etMobileNumber.text.toString()
            val password = etPassword.text.toString()
            var NameOfAvenger = " Avenger"
            val intent = Intent(this@LoginActivity, AvengersActivity::class.java)
            if(mobileNumber == validMobileNumber){

                when(password){
                    validPassword[0] -> {
                        NameOfAvenger = "Iron Man"
                        intent.putExtra("Name", NameOfAvenger)
                        startActivity(intent)
                    }
                    validPassword[1] ->{
                        NameOfAvenger = "Caption America"
                        intent.putExtra("Name", NameOfAvenger)
                        startActivity(intent)
                    }
                    validPassword[2] ->{
                        NameOfAvenger = "The Hulk"
                        intent.putExtra("Name", NameOfAvenger)
                        startActivity(intent)
                    }
                    validPassword[3] ->{
                        NameOfAvenger = "The Avengers"
                        intent.putExtra("Name", NameOfAvenger)
                        startActivity(intent)
                    }
                    else ->
                        Toast.makeText(this@LoginActivity,"incorrect credentials", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this@LoginActivity,"incorrect credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }


}