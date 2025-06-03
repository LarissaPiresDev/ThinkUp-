package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.Questoes1AnoActivitys.PrimeiraSerieQuestao001Activity

class Questoes1SerieActivity : AppCompatActivity() {

    lateinit var botaoFechar: Button
    lateinit var iniciarQuiz1ano: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.questoes1_serie)

        botaoFechar = findViewById(R.id.retornar)
        iniciarQuiz1ano = findViewById( R.id.iniciarQuizPrimeiroAno)

        iniciarQuiz1ano.setOnClickListener() {
            val intent = Intent(this, PrimeiraSerieQuestao001Activity::class.java)
            startActivity( intent )


        }

        botaoFechar.setOnClickListener {
            finish()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}