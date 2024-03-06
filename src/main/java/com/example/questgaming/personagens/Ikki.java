package com.example.questgaming.personagens;

public class Ikki extends Personagem {
    // Vetor de perguntas, opções e respostas para armadura de bronze
    private static final String[] PERGUNTAS_BRONZE = {
            "Qual é o nome do irmão de Ikki?",
            "Quem é o irmão mais novo de Ikki?",
            "Qual é a técnica especial de Ikki?"
    };
    private static final String[][] OPCOES_BRONZE = {
            {"Seiya", "Shun", "Shiryu", "Hyoga"},
            {"Shun", "Seiya", "Shiryu", "Hyoga"},
            {"Ave Fênix", "Rugido do Dragão", "Ventos Cortantes", "Relâmpago de Plasma"}
    };
    private static final String[] RESPOSTAS_BRONZE = {
            "Shun",
            "Shun",
            "Ave Fênix"
    };

    // Vetor de perguntas, opções e respostas para armadura de prata
    private static final String[] PERGUNTAS_PRATA = {
            "Qual é a cor da armadura de prata de Ikki?",
            "Qual é o apelido de Ikki?",
            "Qual é a técnica secreta de Ikki?"
    };
    private static final String[][] OPCOES_PRATA = {
            {"Prateada", "Dourada", "Verde", "Vermelha"},
            {"Fênix Negra", "Dragão Negro", "Cavaleiro Negro", "Fênix de Fogo"},
            {"Fênix Ilusória", "Fênix Implacável", "Fênix Invicta", "Fênix Incandescente"}
    };
    private static final String[] RESPOSTAS_PRATA = {
            "Vermelha",
            "Fênix Negra",
            "Fênix Ilusória"
    };

    // Vetor de perguntas, opções e respostas para armadura de ouro
    private static final String[] PERGUNTAS_OURO = {
            "Qual é a constelação da armadura de Ikki?",
            "Em qual Arco Ikki morre a primeira vez?",
            "Qual é a técnica final de Ikki?"
    };
    private static final String[][] OPCOES_OURO = {
            {"Fênix", "Áries", "Sagitário", "Aquário"},
            {"Batalha pela Armadura de Ouro", "Na luta contra Shakka de Virgem", "Na luta contra Saga de Gêmeos", "Saga de Hades"},
            {"Fantasma de Fogo", "Golpe Fantasma", "Golpe Fantasma de Fênix", "Golpe Final de Fênix"}
    };
    private static final String[] RESPOSTAS_OURO = {
            "Fênix",
            "Batalha pela Armadura de Ouro",
            "Golpe Fantasma de Fênix"
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
