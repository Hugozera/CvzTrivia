package com.example.questgaming;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.questgaming.personagens.Ikki;
import com.example.questgaming.personagens.Personagem;
import com.example.questgaming.personagens.Seiya;
import com.example.questgaming.personagens.Shiryu;

public class PerguntasActivity extends AppCompatActivity {
    private int score = 30;
    String personagemSelecionado, armaduraSelecionada, nomeUsuario;
    TextView textViewPergunta;
    RadioButton radioButtonOpcao1, radioButtonOpcao2, radioButtonOpcao3, radioButtonOpcao4;
    int indicePerguntaAtual = 0;
    Personagem personagem;

    String[] perguntas;
    String[][] opcoes;
    String[] respostas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas);


        textViewPergunta = findViewById(R.id.textViewPergunta);
        radioButtonOpcao1 = findViewById(R.id.radioButtonOpcao1);
        radioButtonOpcao2 = findViewById(R.id.radioButtonOpcao2);
        radioButtonOpcao3 = findViewById(R.id.radioButtonOpcao3);
        radioButtonOpcao4 = findViewById(R.id.radioButtonOpcao4);

        // Recebendo os dados da NivelActivity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            personagemSelecionado = extras.getString("personagemSelecionado");
            armaduraSelecionada = extras.getString("armaduraSelecionada");
            nomeUsuario = extras.getString("nomeUsuario");

            // Inicializa o objeto de personagem com base na seleção
            if ("Seya".equalsIgnoreCase(personagemSelecionado)) {
                personagem = new Seiya();
            } else if ("Ikki".equalsIgnoreCase(personagemSelecionado)) {
                personagem = new Ikki();
            } else if ("Shiryu".equalsIgnoreCase(personagemSelecionado)) {
                personagem = new Shiryu();
            }

            if (personagem != null) {
                // Atualizando o layout com base nos dados recebidos
                atualizarLayout(nomeUsuario);
            } else {
                // Se o objeto de personagem for nulo  dá erro
                Toast.makeText(this, "Personagem ainda não configurado", Toast.LENGTH_SHORT).show();
                finish();
            }
        } else {
           finish();
        }


        Button buttonProximaPergunta = findViewById(R.id.buttonConfirmar);
        buttonProximaPergunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificarResposta();
            }
        });
    }

    private void gameOver() {
        Toast.makeText(this, "Game Over", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    //Seletor de dificuldade
    private void atualizarLayout(String nomeUsuario) {
        int drawableId = getDrawableIdByPersonagem(personagemSelecionado);
        ImageView imageViewIcon = findViewById(R.id.perfil);
        imageViewIcon.setImageResource(drawableId);


        if ("bronze".equalsIgnoreCase(armaduraSelecionada)) {
            perguntas = personagem.getPerguntasBronze();
            opcoes = personagem.getOpcoesBronze();
            respostas = personagem.getRespostasBronze();
        } else if ("prata".equalsIgnoreCase(armaduraSelecionada)) {
            perguntas = personagem.getPerguntasPrata();
            opcoes = personagem.getOpcoesPrata();
            respostas = personagem.getRespostasPrata();
        } else if ("ouro".equalsIgnoreCase(armaduraSelecionada)) {
            perguntas = personagem.getPerguntasOuro();
            opcoes = personagem.getOpcoesOuro();
            respostas = personagem.getRespostasOuro();
        } else {
            // Se nenhum tipo de armadura for selecionado, encerre a atividade
            Toast.makeText(this, "Tipo de armadura não reconhecido", Toast.LENGTH_SHORT).show();
            finish();
            return;
        }

        exibirPergunta(perguntas, opcoes, respostas);
    }

    private void exibirPergunta(String[] perguntas, String[][] opcoes, String[] respostas) {
        if (personagem != null && indicePerguntaAtual < perguntas.length) {
            textViewPergunta.setText(perguntas[indicePerguntaAtual]);
            radioButtonOpcao1.setText(opcoes[indicePerguntaAtual][0]);
            radioButtonOpcao2.setText(opcoes[indicePerguntaAtual][1]);
            radioButtonOpcao3.setText(opcoes[indicePerguntaAtual][2]);
            radioButtonOpcao4.setText(opcoes[indicePerguntaAtual][3]);
        } else {
            int i = score * indicePerguntaAtual;
            // Passa a pontuação total de volta para a MainActivity
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("pontuacaoTotal", i);
            startActivity(intent);
            Toast.makeText(this, "Parabens!!", Toast.LENGTH_SHORT).show();
        }
    }

    // verificador de resposta correta
    private void verificarResposta() {
        if (radioButtonOpcao1.isChecked() || radioButtonOpcao2.isChecked()
                || radioButtonOpcao3.isChecked() || radioButtonOpcao4.isChecked()) {
            String respostaSelecionada = "";

            if (radioButtonOpcao1.isChecked()) {
                respostaSelecionada = radioButtonOpcao1.getText().toString();
            } else if (radioButtonOpcao2.isChecked()) {
                respostaSelecionada = radioButtonOpcao2.getText().toString();
            } else if (radioButtonOpcao3.isChecked()) {
                respostaSelecionada = radioButtonOpcao3.getText().toString();
            } else if (radioButtonOpcao4.isChecked()) {
                respostaSelecionada = radioButtonOpcao4.getText().toString();
            }

            // Verificar se a resposta é a correta
            if (respostaSelecionada.equals(respostas[indicePerguntaAtual])) {
                Toast.makeText(this, "Resposta correta!", Toast.LENGTH_SHORT).show();
                indicePerguntaAtual++;
                exibirPergunta(perguntas, opcoes, respostas); //
            } else {
                int i = score * indicePerguntaAtual;
                // Passa a pontuação total para a MainActivity
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("pontuacaoTotal", i);
                startActivity(intent);
                gameOver();
            }
        } else {
            Toast.makeText(this, "Selecione uma opção!", Toast.LENGTH_SHORT).show();
        }
    }


    // Alterador de icone da imafe view na perguntasactivity.xml
    private int getDrawableIdByPersonagem(String personagem) {
        switch (personagem) {
            case "Seya":
                return R.drawable.seyaicon;
            case "Shiryu":
                return R.drawable.shiryuicon;
            case "Ikki":
                return R.drawable.ikkiicon;
            case "Shun":
                return R.drawable.shunicon;
            default:
                return R.drawable.ikkiicon;
        }
    }
}
