package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EscolherSerieActivity : AppCompatActivity() {
    lateinit var abrirBotao: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.escolher_serie)

        abrirBotao = findViewById( R.id.segunda_serie)
        abrirBotao.setOnClickListener() {

            val intent = Intent(
                this,
                Questoes2serieActivity::class.java
            )
            startActivity( intent )
        }
    }
}
