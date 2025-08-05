package questao13;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2;
        int opcao;

        do {
            System.out.println("Mine calculadora");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o num1: ");
                    num1 = entrada.nextInt();
                    System.out.println("Digite o num2: ");
                    num2 = entrada.nextInt();

                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + (num1 + num2) + "\n");
                    break;

                case 2:
                    System.out.println("Digite o num1: ");
                    num1 = entrada.nextInt();
                    System.out.println("Digite o num2: ");
                    num2 = entrada.nextInt();

                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + (num1 - num2) + "\n");
                    break;

                case 3:
                    System.out.println("Digite o num1: ");
                    num1 = entrada.nextInt();
                    System.out.println("Digite o num2: ");
                    num2 = entrada.nextInt();

                    System.out.println("Resultado: " + num1 + " x " + num2 + " = " + (num1 * num2) + "\n");
                    break;

                case 4:
                    System.out.println("Digite o num1: ");
                    num1 = entrada.nextInt();
                    System.out.println("Digite o num2: ");
                    num2 = entrada.nextInt();

                    if (num2 == 0) {
                        System.out.println("Erro ao dividir por 0");
                    } else {
                        double resultado = (double) num1 / num2;
                        System.out.printf("Resultado: %d / %d = %.2f\n\n", num1, num2, resultado);
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        entrada.close();
    }
}