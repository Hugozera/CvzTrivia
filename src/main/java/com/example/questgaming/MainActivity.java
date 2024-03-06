package com.example.questgaming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa a TextView
        textViewUsuario = findViewById(R.id.textViewUsuario);

        // Recupera os dados enviados
        Intent intent = getIntent();
        if (intent != null) {
            String nomeUsuario = intent.getStringExtra("nome");
            // Verifica se o nome do usuário não é nulo e atualiza a TextView
            if (nomeUsuario != null) {
                textViewUsuario.setText(nomeUsuario);
            }
            // Verifica se há uma pontuação total
            int pontuacaoTotal = intent.getIntExtra("pontuacaoTotal", 0);
            if (pontuacaoTotal > 0) {
                TextView textViewPontuacaoTotal = findViewById(R.id.textViewPontuacao);
                textViewPontuacaoTotal.setText(String.valueOf(pontuacaoTotal));
            }
        }

        // Configura os listeners de clique para os ImageViews programaticamente
        ImageView seya = findViewById(R.id.seya);
        seya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirNivelActivity("Seya");
            }
        });

        ImageView shiryu = findViewById(R.id.shiryu);
        shiryu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirNivelActivity("Shiryu");
            }
        });

        ImageView ikki = findViewById(R.id.ikki);
        ikki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirNivelActivity("Ikki");
            }
        });

        ImageView shun = findViewById(R.id.shun);
        shun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirNivelActivity("Shun");
            }
        });
    }

    // Método para enviar o nome do usuário e o personagem selecionado
    private void abrirNivelActivity(String personagem) {
        Intent intent = new Intent(this, NivelActivity.class);
        intent.putExtra("personagemSelecionado", personagem);
        intent.putExtra("nomeUsuario", textViewUsuario.getText().toString());
        startActivity(intent);
    }
}
