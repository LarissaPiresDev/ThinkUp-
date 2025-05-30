package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContentView(R.layout.tela_inicial)

        // Referenciar o botão pelo ID
        val button = findViewById<Button>(R.id.button)

        // Criar a ação de clique
        button.setOnClickListener {
            val intent = Intent(this, EscolherSerieActivity::class.java)
            startActivity(intent)
        }
    }
}
