package com.example.jorgecarrillo.proyectomoviles2018

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        buttonInicio.setOnClickListener{v: View? ->  irTraductor()}
        buttonResetoContraseña.setOnClickListener{v: View? -> irReseteoContraseña()  }
    }
    fun irTraductor(){
        val intent = Intent(this, TraductorActivity::class.java)
        startActivity(intent)
    }
    fun irReseteoContraseña(){
        val intent = Intent(this, OlvidoContrasenaActivity::class.java)
        startActivity(intent)
    }
}
