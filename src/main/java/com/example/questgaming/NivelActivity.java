package com.example.questgaming;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NivelActivity extends AppCompatActivity {

    private String nomeUsuario;
    private String personagemSelecionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel);

        // Recebe os dados passados pela Intent
        Intent intent = getIntent();
        nomeUsuario = intent.getStringExtra("nomeUsuario");
        personagemSelecionado = intent.getStringExtra("personagemSelecionado");

        // Inicializa os botões de seleção de nível
        Button buttonNivelFacil = findViewById(R.id.buttonNivelFacil);
        Button buttonNivelMedio = findViewById(R.id.buttonNivelMedio);
        Button buttonNivelDificil = findViewById(R.id.buttonNivelDificil);

        // Configura os listeners de clique para os botões de seleção de nível
        buttonNivelFacil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirPerguntasActivity("bronze");
            }
        });

        buttonNivelMedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirPerguntasActivity("prata");
            }
        });

        buttonNivelDificil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirPerguntasActivity("ouro");
            }
        });
    }

    // Método para abrir a activity de perguntas com os parâmetros necessários
    private void abrirPerguntasActivity(String armaduraSelecionada) {
        Intent perguntasIntent = new Intent(this, PerguntasActivity.class);
        perguntasIntent.putExtra("nomeUsuario", nomeUsuario);
        perguntasIntent.putExtra("personagemSelecionado", personagemSelecionado);
        perguntasIntent.putExtra("armaduraSelecionada", armaduraSelecionada);
        startActivity(perguntasIntent);
    }
}
