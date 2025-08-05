package questao02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Informa o seu peso em kg: ");
        peso = entrada.nextDouble();

        System.out.print("Informa a sua altura: ");
        altura = entrada.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("\nResultado");
        System.out.printf("O seu peso: %.2f kg\n", peso);
        System.out.printf("A sua altura: %.2f m\n", altura);
        System.out.printf("O seu IMC: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Magreza");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Classificação: Saudável");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Classificação: Obesidade Grau II (Severa)");
        } else {
            System.out.println("Classificação: Obesidade Grau III (mórbida)");
        }

        entrada.close();
    }
}
