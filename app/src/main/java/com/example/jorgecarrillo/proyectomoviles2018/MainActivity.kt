package com.example.jorgecarrillo.proyectomoviles2018

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonLogin.setOnClickListener { v: View? -> irLogin() }
        buttonUsuario.setOnClickListener{ v: View? -> crearUsuario()  }
    }
    fun irLogin (){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
    fun crearUsuario  (){
        val intent = Intent(this,RegistroActivity::class.java)
        startActivity(intent)
    }


}
