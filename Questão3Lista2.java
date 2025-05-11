package Questão3Lista2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    private static Scanner Teclado;

    public static void main(String[] args) {

        Teclado = new Scanner(System.in);

        double a, b;
        double xTeste, yTeste;
        double x2, y2, x3, y3;

        try {

            System.out.println("Insira a equação da reta 1:");
            System.out.print("Coeficiente angular (a): ");
            a = Teclado.nextDouble();
            System.out.print("Coeficiente linear (b): ");
            b = Teclado.nextDouble();


            System.out.println("Insira o ponto a ser testado na reta 1:");
            System.out.print("x: ");
            xTeste = Teclado.nextDouble();
            System.out.print("y: ");
            yTeste = Teclado.nextDouble();


            System.out.println("Insira dois pontos para construir a reta 2:");
            System.out.print("x2: ");
            x2 = Teclado.nextDouble();
            System.out.print("y2: ");
            y2 = Teclado.nextDouble();
            System.out.print("x3: ");
            x3 = Teclado.nextDouble();
            System.out.print("y3: ");
            y3 = Teclado.nextDouble();
            Reta reta1 = new Reta(a, b);
            Reta reta2 = new Reta(x2, y2, x3, y3);


            System.out.println("O coeficiente angular da reta 1 é: " + reta1.getCoeficienteAngular());
            System.out.println("O coeficiente linear da reta 1 é: " + reta1.getCoeficienteLinear());

            System.out.println("O ponto (" + xTeste + ";" + yTeste + ") pertence à reta 1? " + reta1.pertence(xTeste, yTeste));

            double[] intersecao = reta1.intersecao(reta2);
            if (intersecao != null) {
                System.out.println("Interseção entre a Reta 1 e a Reta 2: (" + intersecao[0] + ", " + intersecao[1] + ")");
            } else {
                System.out.println("As retas são paralelas e não se intersectam.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida, tente novamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    }
