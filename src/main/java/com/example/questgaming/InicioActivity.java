package com.example.questgaming;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class InicioActivity extends AppCompatActivity {

    // Declaração das variáveis para os EditTexts
    private EditText editTextNome;
    private EditText editTextIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        // Inicializa os EditTexts
        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);

        Button buttonConfirmar = findViewById(R.id.buttonConfirmar);
        buttonConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Método para enviar os dados para a MainActivity
                enviarDadosParaMainActivity();
            }
        });
    }

    private void enviarDadosParaMainActivity() {
        // Obtém o nome e a idade digitados nos EditTexts
        String nome = editTextNome.getText().toString();
        String idade = editTextIdade.getText().toString();

        // Cria um Intent para iniciar a MainActivity
        Intent intent = new Intent(this, MainActivity.class);

        // Adiciona os dados extras ao Intent
        intent.putExtra("nome", nome);
        intent.putExtra("idade", idade);

        // Inicia a MainActivity
        startActivity(intent);
    }
}
