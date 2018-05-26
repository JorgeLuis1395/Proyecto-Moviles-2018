package com.example.jorgecarrillo.proyectomoviles2018

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registro.*

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        buttonCrearUsuario.setOnClickListener{v: View? -> irLogin() }
    }
    fun irLogin (){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}
