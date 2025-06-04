package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.Questoes2AnoActivitys.SegundaSerieQuestao001Activity

class Questoes2serieActivity : AppCompatActivity() {

    lateinit var botaoFechar: Button
    lateinit var iniciarQuiz2ano: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.questoes2serie)
        iniciarQuiz2ano = findViewById( R.id.iniciarQuizPrimeiroAno)

        iniciarQuiz2ano.setOnClickListener() {
            val intent = Intent(this, SegundaSerieQuestao001Activity::class.java)
            startActivity( intent )


        }

        botaoFechar = findViewById(R.id.retornar)
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