import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Main {
    public static void main(String[] args) {
        new Scanner(System.in);

        // Cabeçalho
        System.out.println("Faculdade: Alfredo Nasser");
        System.out.println("Aluno: Kayuã Dias Gomes");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Bem-vindo ao quiz sobre Carros! Você responderá 15 perguntas de múltipla escolha.");

        Questao[] questoes = new Questao[15];
        // Definição das perguntas sobre carros
        questoes[0] = new Questao("1- Qual é a função do motor de um carro?",
                new String[]{"Gerar eletricidade", "Fornecer tração", "Transformar combustível em energia mecânica", "Resfriar o veículo", "Lubrificar as peças"}, "C");
        questoes[1] = new Questao("2- O que significa a sigla ABS nos freios de um carro?",
                new String[]{"Automated Brake System", "Anti-lock Braking System", "Automatic Balance Suspension", "Advanced Braking Security", "Active Brake Support"}, "B");
        questoes[2] = new Questao("3- Qual o nome do componente responsável por transmitir a força do motor para as rodas?",
                new String[]{"Câmbio", "Diferencial", "Transmissão", "Virabrequim", "Alternador"}, "C");
        questoes[3] = new Questao("4- O que é um carro híbrido?",
                new String[]{"Movido a gás natural", "Possui dois motores, um elétrico e um a combustão", "Funciona apenas com eletricidade", "Utiliza apenas etanol", "Movido a hidrogênio"}, "B");
        questoes[4] = new Questao("5- Qual a principal função do óleo do motor?",
                new String[]{"Limpar o motor", "Resfriar o motor", "Lubrificar as peças", "Aumentar a potência", "Diminuir a velocidade"}, "C");
        questoes[5] = new Questao("6- O que significa a sigla RPM no painel do carro?",
                new String[]{"Rotação Por Minuto", "Resistência do Pistão Médio", "Relação de Potência Máxima", "Regime de Pressão de Motor", "Rotação Perfeita do Motor"}, "A");
        questoes[6] = new Questao("7- Qual é a função do alternador em um carro?",
                new String[]{"Gerar energia elétrica", "Aumentar a potência do motor", "Diminuir o consumo de combustível", "Regular a injeção eletrônica", "Controlar o sistema de escape"}, "A");
        questoes[7] = new Questao("8- Qual componente armazena a energia elétrica do carro?",
                new String[]{"Alternador", "Bobina", "Bateria", "Comutador", "Dínamo"}, "C");







    }
}