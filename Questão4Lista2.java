package Questão4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Questão4Lista2 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        double raio, x, y;

        try {
            System.out.println("=== Criação do Círculo ===");
            System.out.print("Insira o raio inicial do círculo: ");
            raio = Teclado.nextDouble();

            System.out.println("Insira as coordenadas do centro do círculo:");
            System.out.print("x: ");
            x = Teclado.nextDouble();
            System.out.print("y: ");
            y = Teclado.nextDouble();

            circulo Circulo = new circulo(raio, x, y);

            int opcao = -1;
            while (opcao != 0) {
                System.out.println("\n=== MENU ===");
                System.out.println("1 - Inflar o círculo");
                System.out.println("2 - Desinflar o círculo");
                System.out.println("3 - Mostrar área do círculo");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                try {
                    opcao = Teclado.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.print("Valor para inflar: ");
                            double inflar = Teclado.nextDouble();
                            System.out.println("o raio agora é igual a : " + Circulo.inflacao(inflar));
                            break;

                        case 2:
                            System.out.print("Valor para desinflar: ");
                            double desinflar = Teclado.nextDouble();
                            System.out.println("o raio agora é igual a : " + Circulo.desinflar(desinflar) );
                            break;

                        case 3:
                            System.out.printf("a área do círculo é  %.2f",  Circulo.areaCirculo());
                            break;

                        case 0:
                            System.out.println("Encerrando o programa...");
                            break;

                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Use apenas números.");
                    Teclado.nextLine(); // Limpa o buffer
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Use apenas números.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            Teclado.close();
        }
    }
}

