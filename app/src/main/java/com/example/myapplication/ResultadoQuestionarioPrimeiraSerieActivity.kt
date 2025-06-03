package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.content.Intent

class ResultadoQuestionarioPrimeiraSerieActivity : AppCompatActivity() {

    lateinit var textViewResultado: TextView
    lateinit var botaoRetornar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.resultado_questionario_primeira_serie)

        val botaoRetornar = findViewById<Button>(R.id.retornartelaescolherserie)
        val pontos = Pontuacao.acertos
        textViewResultado = findViewById(R.id.textViewResultado)
        textViewResultado.text = "Você acertou $pontos de 15 perguntas."

        botaoRetornar.setOnClickListener {
            val intent = Intent(this, EscolherSerieActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }
}