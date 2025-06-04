package com.example.myapplication.Questoes1AnoActivitys

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.content.Intent
import com.example.myapplication.EscolherSerieActivity
import com.example.myapplication.Pontuacao
import com.example.myapplication.R
import com.example.myapplication.TeladeIntegrantesActivity

class ResultadoQuestionarioPrimeiraSerieActivity : AppCompatActivity() {

    lateinit var textViewResultado: TextView
    lateinit var botaoRetornar: Button
    lateinit var botaoVerIntegrantes: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.resultado_questionario_primeira_serie)

        val botaoRetornar = findViewById<Button>(R.id.retornartelaescolherserie)
        val pontos = Pontuacao.acertos
        textViewResultado = findViewById(R.id.textViewResultado)
        textViewResultado.text = "Você acertou $pontos de 15 perguntas."
        botaoVerIntegrantes = findViewById(R.id.abrirtelaintegrantes)

        botaoVerIntegrantes.setOnClickListener {
            val intent = Intent(this, TeladeIntegrantesActivity::class.java)
            startActivity(intent)
        }

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