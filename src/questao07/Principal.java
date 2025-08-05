package questao07;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.println("Identificar qual o tipo de triângulo: ");

        System.out.print("Medida do lado1: ");
        lado1 = entrada.nextDouble();

        System.out.print("Medida do lado2: ");
        lado2 = entrada.nextDouble();

        System.out.print("Medida do lado3: ");
        lado3 = entrada.nextDouble();

        if (lado1 < lado2 + lado3 &&
            lado2 < lado1 + lado3 &&
            lado3 < lado1 + lado2) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É um triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo Isósceles");
            } else {
                System.out.println("É um triângulo Escaleno");
            }
        } else {
            System.out.println("As medidas não formam um triângulo válido");
        }

        entrada.close();
    }
}
