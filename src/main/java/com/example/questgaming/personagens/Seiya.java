package com.example.questgaming.personagens;

public class Seiya extends Personagem {
    // Vetor de perguntas, opções e respostas para armadura de bronze
    private static final String[] PERGUNTAS_BRONZE = {
            "Qual animal representa a armadura de Seiya?",
            "Em qual País Seiya conseguiu sua armadura?",
            "Onde nasceu o Seiya?"
    };
    private static final String[][] OPCOES_BRONZE = {
            {"Leão", "Dragão", "Fênix", "Cavalo"},
            {"Grécia", "Índia", "Japão", "Croacia"},
            {"Grécia", "Índia", "Japão", "Argentina"},
    };
    private static final String[] RESPOSTAS_BRONZE = {
            "Cavalo",
            "Grécia",
            "Japão"
    };

    // Vetor de perguntas, opções e respostas para armadura de prata
    private static final String[] PERGUNTAS_PRATA = {
            "Qual é a cor da armadura de prata de Seiya?",
            "Qual é o nome do mestre de Seiya?",
            "Quem é o melhor amigo de Seiya?"
    };
    private static final String[][] OPCOES_PRATA = {
            {"Prateada", "Dourada", "Verde", "Azul"},
            {"Aiolia", "Shion", "Kyoko", "Aldebaran"},
            {"Ikki", "Shun", "Hyoga", "Shiryu"}
    };
    private static final String[] RESPOSTAS_PRATA = {
            "Azul",
            "Kyoko",
            "Shiryu"
    };

    // Vetor de perguntas, opções e respostas para armadura de ouro
    private static final String[] PERGUNTAS_OURO = {
            "Qual é o nome da armadura divina de Seiya?",
            "Quantas Pessoas vestem a mesma armadura de Seiya?",
            "Quem é o cavaleiro de ouro de Sagitário?"
    };
    private static final String[][] OPCOES_OURO = {
            {"Áries", "Sagitário", "Leão", "Aquário"},
            {"1", "2", "3", "4"},
            {"Seiya", "Milo", "Aldebaran", "Aiolos"}
    };
    private static final String[] RESPOSTAS_OURO = {
            "Sagitário",
            "2",
            "Aiolos"
    };




    @Override
    public String[] getPerguntasBronze() {
        return PERGUNTAS_BRONZE;
    }

    @Override
    public String[][] getOpcoesBronze() {
        return OPCOES_BRONZE;
    }

    @Override
    public String[] getRespostasBronze() {
        return RESPOSTAS_BRONZE;
    }

    @Override
    public String[] getPerguntasPrata() {
        return PERGUNTAS_PRATA;
    }

    @Override
    public String[][] getOpcoesPrata() {
        return OPCOES_PRATA;
    }

    @Override
    public String[] getRespostasPrata() {
        return RESPOSTAS_PRATA;
    }

    @Override
    public String[] getPerguntasOuro() {
        return PERGUNTAS_OURO;
    }

    @Override
    public String[][] getOpcoesOuro() {
        return OPCOES_OURO;
    }

    @Override
    public String[] getRespostasOuro() {
        return RESPOSTAS_OURO;
    }
}
