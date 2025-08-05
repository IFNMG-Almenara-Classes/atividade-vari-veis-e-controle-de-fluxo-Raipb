package questao04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int senhaValida = 1234,senha;

        System.out.print("Digite a senha: ");
        senha = entrada.nextInt();

        if (senha == senhaValida) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }

        entrada.close();
    }
}
