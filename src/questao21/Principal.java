package questao21;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, tempoServico;

        System.out.print("Digite sua idade:");
        idade = entrada.nextInt();

        System.out.print("Digite o tempo de serviço em anos: ");
        tempoServico = entrada.nextInt();

        if (idade >= 65 || tempoServico >= 30 || (idade >= 60 && tempoServico >= 25)) {
            System.out.println("Pode se aposentar");
        } else {
            System.out.println("Ainda não pose se aposentar");
        }

        entrada.close();
    }
}
