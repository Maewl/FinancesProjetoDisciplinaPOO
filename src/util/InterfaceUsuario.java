package util;

import java.util.Scanner;

public class InterfaceUsuario {
    Scanner scanner = new Scanner(System.in);
    public double pedirValorImovel() {
        double valor = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println("Digite o valor do imóvel: ");

            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();

                if (valor > 0) {
                    System.out.printf("Valor do imóvel: R$ %.2f%n", valor);
                    entradaValida = true;
                } else {
                    System.out.println("Valores inválidos! Tente novamente!");
                }
            } else {
                System.out.println("Valores inválidos! Tente novamente!");
                scanner.next();
            }
        }
        return valor;
    }

    public int pedirPrazoFinanciamento() {
        int valor = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println("Digite o prazo do financiamento em anos: ");

            if (scanner.hasNextInt()) {
                valor = scanner.nextInt();

                if (valor > 0) {
                    System.out.printf("Prazo do financiamento em anos:  %d%n", valor);
                    entradaValida = true;
                } else {
                    System.out.println("Valores inválidos! Tente novamente!");
                }
            } else {
                System.out.println("Valores inválidos! Tente novamente!");
                scanner.next();
            }
        }
        return valor;
    }

    public double pedirTaxaJuros() {
        double valor = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            System.out.println("Digite a taxa anual de juros: ");

            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();

                if (valor > 0) {
                    System.out.printf("Taxa anual de juros: %.2f%n", valor);
                    entradaValida = true;
                } else {
                    System.out.println("Valores inválidos! Tente novamente!");
                }
            } else {
                System.out.println("Valores inválidos! Tente novamente!");
                scanner.next();
            }
        }
        return valor;
    }
}
