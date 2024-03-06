package com.example.questgaming.personagens;

public class Shiryu extends Personagem {
    // Vetor de perguntas, opções e respostas para armadura de bronze
    private static final String[] PERGUNTAS_BRONZE = {
            "Qual é o elemento da armadura de Shiryu?",
            "Qual é o nome do mestre de Shiryu?",
            "Qual é a técnica exclusiva de Shiryu?"
    };
    private static final String[][] OPCOES_BRONZE = {
            {"Água", "Fogo", "Terra", "Ar"},
            {"Dohko", "Miro", "Shun", "Ikki"},
            {"Rozan Shoryuha", "Dragão Voador", "Dragão Ascendente", "Furacão de Fogo"}
    };
    private static final String[] RESPOSTAS_BRONZE = {
            "Água",
            "Dohko",
            "Dragão Voador"
    };

    // Vetor de perguntas, opções e respostas para armadura de prata
    private static final String[] PERGUNTAS_PRATA = {
            "Quem é o pai de Shiryu de Dragão?",
            "A que Armadura Shiryu está destinado a herdar?",
            "Qual é o nome do dragão de Shiryu?"
    };
    private static final String[][] OPCOES_PRATA = {
            {"Dokko", "Ryuho", "Yamato", "Mitsumada Kido"},
            {"Scorpião", "Libra", "Sargitários", "Touro"},
            {"Ryuu", "Shi", "Hyu", "Dok"}
    };
    private static final String[] RESPOSTAS_PRATA = {
            "Mitsumada Kido",
            "Libra",
            "Ryuu"
    };

    // Vetor de perguntas, opções e respostas para armadura de ouro
    private static final String[] PERGUNTAS_OURO = {
            "Qual é a constelação da armadura de Shiryu?",
            "Com quantos anos Shiryu tornou se cavaleiro?",
            "Qual é a técnica suprema de Shiryu?"
    };
    private static final String[][] OPCOES_OURO = {
            {"Libra", "Áries", "Sagitário", "Aquário"},
            {"11", "12", "13", "14"},
            {"Explosão de Cólera", "Dragão Ascendente", "Cólera do Dragão", "Avalanche de Dragão"}
    };
    private static final String[] RESPOSTAS_OURO = {
            "Libra",
            "14",
            "Cólera do Dragão"
    };
;


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
