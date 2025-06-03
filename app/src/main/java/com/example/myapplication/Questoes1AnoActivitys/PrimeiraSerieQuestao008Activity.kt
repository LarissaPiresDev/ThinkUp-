package com.example.myapplication.Questoes1AnoActivitys

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.content.ContextCompat
import com.example.myapplication.Pontuacao
import com.example.myapplication.R

class PrimeiraSerieQuestao008Activity : AppCompatActivity() {

    lateinit var alternativa1: Button
    lateinit var alternativa2: Button
    lateinit var alternativa3: Button
    lateinit var alternativa4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.primeira_serie_questao008)

        alternativa1 = findViewById(R.id.alt1)
        alternativa2 = findViewById(R.id.alt2)
        alternativa3 = findViewById(R.id.alt3)
        alternativa4 = findViewById(R.id.alt4)

        alternativa1.setOnClickListener {
            alternativa1.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
            alternativa3.setBackgroundColor(ContextCompat.getColor(this, R.color.green))


            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, PrimeiraSerieQuestao009Activity::class.java)
                startActivity(intent)
            }, 500)
        }

        alternativa2.setOnClickListener {
            alternativa2.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
            alternativa3.setBackgroundColor(ContextCompat.getColor(this, R.color.green))

            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, PrimeiraSerieQuestao009Activity::class.java)
                startActivity(intent)

            }, 500)
        }

        alternativa3.setOnClickListener {
            Pontuacao.acertos += 1
            alternativa3.setBackgroundColor(ContextCompat.getColor(this, R.color.green))

            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, PrimeiraSerieQuestao009Activity::class.java)
                startActivity(intent)
            }, 500)
        }

        alternativa4.setOnClickListener {
            alternativa4.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
            alternativa3.setBackgroundColor(ContextCompat.getColor(this, R.color.green))

            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, PrimeiraSerieQuestao009Activity::class.java)
                startActivity(intent)
            }, 500)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}