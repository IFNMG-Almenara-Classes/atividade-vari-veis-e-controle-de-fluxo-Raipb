package questao14;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorPizza, valorFinal;
        int tipoCliente;

        System.out.print("Digite o valor da pizza: ");
        valorPizza = entrada.nextDouble();

        System.out.println("\nTipo do cliente: ");
        System.out.println("1 - Comum");
        System.out.println("2 - VIP");
        System.out.println("3 - Funcionário");
        System.out.print("Qual o código para o cliente: ");
        tipoCliente = entrada.nextInt();

        switch (tipoCliente) {
            case 1:
                valorFinal = valorPizza;
                System.out.println("Cliente comum, não tem desconto");
                break;

            case 2:
                valorFinal = valorPizza * 0.95;
                System.out.println("Cliente VIP, 5% de desconto");
                break;

            case 3:
                valorFinal = valorPizza * 0.90;
                System.out.println("Funcionário, 10% de desconto");
                break;

            default:
                System.out.println("Código invalido ou cliente comum");
                valorFinal = valorPizza;
        }

        System.out.printf("Valor final: %.2f\n", valorFinal);

        entrada.close();
    }
}
