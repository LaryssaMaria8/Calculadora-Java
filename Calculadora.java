package com.mycompany.pipipi;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int escolha;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1- Adição");
            System.out.println("2- Subtração");
            System.out.println("3- Divisão");
            System.out.println("4- Multiplicação");
            System.out.println("5- Sair");
            System.out.print("Digite a opção: ");
            escolha = scanner.nextInt();

            if (escolha == 5) {
                System.out.println("Acabamos por aqui! Até a próxima");
                break; // Sair do loop se a escolha for 5
            } else if (escolha >= 1 && escolha <= 4) {
                System.out.println("Digite um valor ");
                double valor = scanner.nextDouble();
                System.out.println("Digite outro valor ");
                double valor2 = scanner.nextDouble();

                if (escolha == 1) {
                    double resultadoSoma = valor + valor2;
                    System.out.println("O resultado da operação é igual a: " + resultadoSoma);
                } else if (escolha == 2) {
                    double resultadoSubtracao = valor - valor2;
                    System.out.println("O resultado da operação é igual a: " + resultadoSubtracao);
                } else if (escolha == 3) {
                    double resultadoDivisao = valor / valor2;
                    System.out.println("O resultado da operação é igual a: " + resultadoDivisao);
                } else if (escolha == 4) {
                    double resultadoMultiplicacao = valor * valor2;
                    System.out.println("O resultado da operação é igual a: " + resultadoMultiplicacao);
                } else {
                    System.out.println("Opção inválida");
                }
            } else {
                System.out.println("Opção inválida");
            }

            scanner.nextLine(); 
        }

        scanner.close();
    }
}