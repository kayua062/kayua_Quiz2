import java.util.Scanner;

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





    }
}