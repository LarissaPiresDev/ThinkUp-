package com.example.myapplication

import com.example.myapplication.Pontuacao
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EscolherSerieActivity : AppCompatActivity() {

    lateinit var BotaoSeire1: Button
    lateinit var BotaoSeire2: Button
    lateinit var BotaoSeire3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.escolher_serie)
        Pontuacao.acertos = 0
        BotaoSeire1 = findViewById( R.id.primeira_serie)
        BotaoSeire2 = findViewById( R.id.segunda_serie)
        BotaoSeire3 = findViewById( R.id.terceira_serie)

        BotaoSeire1.setOnClickListener {
            val intent = Intent(this, Questoes1SerieActivity::class.java)
            startActivity( intent )
        }

        BotaoSeire2.setOnClickListener() {
            val intent = Intent(this,  Questoes2serieActivity::class.java)
            startActivity( intent )
        }

        BotaoSeire3.setOnClickListener() {
            val intent = Intent (this, Questoes3serieActivity::class.java)
            startActivity( intent )
        }


    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        recreate()
    }
}
