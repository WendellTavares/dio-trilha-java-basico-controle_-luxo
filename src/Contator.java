import java.util.Scanner;

public class Contator {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("### CONTADOR de OCORRENCIAS ###");
        System.out.println("Este programa conta e imprimi a quantidade de ocorrencias entre dois parametros.");
       
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Alerta! Para realizar a contagem, o segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        System.out.println("Iniciando impressão da contagem...");
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo número: " + (i + 1));
        }

    }
}
