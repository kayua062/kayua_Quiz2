import java.util.Scanner;

class Questao {
    String pergunta;
    String[] opcoes;
    String correta;

    public Questao(String pergunta, String[] opcoes, String correta) {
        this.pergunta = pergunta;
        this.opcoes = opcoes;
        this.correta = correta;
    }

    public void escrevaQuestao() {
        System.out.println(pergunta);
        for (int i = 0; i < opcoes.length; i++) {
            System.out.println((char) ('A' + i) + ") " + opcoes[i]);
        }
    }

    public String leiaResposta() {
        Scanner scanner = new Scanner(System.in);
        String resposta;
        do {
            System.out.print("Digite a resposta: ");
            resposta = scanner.next().toUpperCase();
        } while (!resposta.matches("[A-E]"));
        return resposta;
    }

    public boolean isCorreta(String resposta) {
        return resposta.equalsIgnoreCase(correta);
    }
}

