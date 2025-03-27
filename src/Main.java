import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Faculdade: Alfredo Nasser");
        System.out.println("Aluno: Kayuã Dias Gomes");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Bem-vindo ao quiz sobre Carros! Você responderá 15 perguntas de múltipla escolha.");


        Questao[] questoes = new Questao[15];

        // Definição das perguntas sobre Carros
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
        questoes[8] = new Questao("9- Qual gás é emitido pelos escapamentos dos carros e é prejudicial ao meio ambiente?",
                new String[]{"Hidrogênio", "Dióxido de Carbono (CO2)", "Oxigênio", "Metano", "Argônio"}, "B");
        questoes[9] = new Questao("10- O que é torque em um motor?",
                new String[]{"A potência máxima do motor", "A capacidade de força gerada pelo motor", "A velocidade de rotação do motor", "A eficiência do combustível", "A resistência ao desgaste"}, "B");
        questoes[10] = new Questao("11- Qual é o combustível mais comum usado em carros a combustão?",
                new String[]{"Etanol", "Diesel", "Gasolina", "Gás Natural", "Biodiesel"}, "C");
        questoes[11] = new Questao("12- O que significa injeção eletrônica?",
                new String[]{"Sistema que injeta combustível de forma controlada", "Sistema de refrigeração do motor", "Sistema de segurança das portas", "Sistema de controle do câmbio", "Sistema de navegação"}, "A");
        questoes[12] = new Questao("13- Qual é a principal função do radiador?",
                new String[]{"Aquecer o motor", "Refrigerar o motor", "Gerar eletricidade", "Aumentar a potência", "Diminuir a emissão de gases"}, "B");
        questoes[13] = new Questao("14- Qual peça do carro é responsável por reduzir a emissão de gases poluentes?",
                new String[]{"Catalisador", "Turbina", "Válvula EGR", "Filtro de Ar", "Resonador"}, "A");
        questoes[14] = new Questao("15- O que significa a sigla ECU nos veículos?",
                new String[]{"Electronic Control Unit", "Engine Cooling Utility", "Efficient Car Utility", "Energy Control Unit", "Engine Clean Utility"}, "A");

        int pontuacao = 0;

        // Loop para fazer as perguntas
        for (Questao questoe : questoes) {
            questoe.escrevaQuestao();
            String resposta = questoe.leiaResposta();

            // Verificando se a resposta está correta
            if (questoe.isCorreta(resposta)) {
                pontuacao++;
            }
        }

        // Exibindo a pontuação final
        System.out.println("\nQuiz finalizado!");
        System.out.println("Sua pontuação final é: " + pontuacao + " de " + questoes.length);

        // Calculando a porcentagem de acertos
        double porcentagem = ((double) pontuacao / questoes.length) * 100;
        System.out.printf("Sua porcentagem de acertos é: %.2f%%\n", porcentagem);

        scanner.close();
    }
}