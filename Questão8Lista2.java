package Questão8Lista2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questão8Lista2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriz matrizA = null;
        Matriz matrizB = null;

        try {
            while (true) {
                System.out.println("\n==== MENU MATRIZ ====");
                System.out.println("1. Criar Matriz A");
                System.out.println("2. Criar Matriz B");
                System.out.println("3. Somar A + B");
                System.out.println("4. Subtrair A - B");
                System.out.println("5. Multiplicar A * B");
                System.out.println("6. Transposta de A");
                System.out.println("7. Oposta de A");
                System.out.println("8. Matriz Nula (de A)");
                System.out.println("9. A é Identidade?");
                System.out.println("10. A é Diagonal?");
                System.out.println("11. A é Singular?");
                System.out.println("12. A é Simétrica?");
                System.out.println("13. A é Antissimétrica?");
                System.out.println("14. Comparar A com B");
                System.out.println("15. Copiar A");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");

                int opcao = sc.nextInt();

                if (opcao == 0) {
                    System.out.println("Encerrando o programa...");
                    break;
                }

                if (opcao == 1 || opcao == 2) {
                    System.out.print("Informe o número de linhas: ");
                    int linhas = sc.nextInt();
                    System.out.print("Informe o número de colunas: ");
                    int colunas = sc.nextInt();
                    Matriz nova = new Matriz(linhas, colunas);
                    System.out.println("Digite os elementos da matriz:");
                    for (int i = 0; i < linhas; i++) {
                        for (int j = 0; j < colunas; j++) {
                            System.out.printf("Elemento [%d][%d]: ", i, j);
                            nova.setElementos(i, j, sc.nextDouble());
                        }
                    }
                    if (opcao == 1) matrizA = nova;
                    else matrizB = nova;
                } else if (opcao >= 3 && opcao <= 15) {
                    if (matrizA == null) {
                        System.out.println("Matriz A não foi criada.");
                        continue;
                    }
                    if ((opcao == 3 || opcao == 4 || opcao == 5 || opcao == 14) && matrizB == null) {
                        System.out.println("Matriz B não foi criada.");
                        continue;
                    }

                    switch (opcao) {
                        case 3 -> {
                            if (matrizA.getLinhas() == matrizB.getLinhas() && matrizA.getColunas() == matrizB.getColunas()) {
                                Matriz soma = matrizA.adicionarMatriz(matrizB);
                                for (int i = 0; i < soma.getLinhas(); i++) {
                                    for (int j = 0; j < soma.getColunas(); j++) {
                                        System.out.print(soma.getElementos(i, j) + "\t");
                                    }
                                    System.out.println();
                                }
                            } else {
                                System.out.println("Dimensões incompatíveis.");
                            }
                        }
                        case 4 -> {
                            if (matrizA.getLinhas() == matrizB.getLinhas() && matrizA.getColunas() == matrizB.getColunas()) {
                                Matriz sub = matrizA.subtrair(matrizB);
                                for (int i = 0; i < sub.getLinhas(); i++) {
                                    for (int j = 0; j < sub.getColunas(); j++) {
                                        System.out.print(sub.getElementos(i, j) + "\t");
                                    }
                                    System.out.println();
                                }
                            } else {
                                System.out.println("Dimensões incompatíveis.");
                            }
                        }
                        case 5 -> {
                            if (matrizA.getColunas() == matrizB.getLinhas()) {
                                Matriz mult = matrizA.multiplicacao(matrizB);
                                for (int i = 0; i < mult.getLinhas(); i++) {
                                    for (int j = 0; j < mult.getColunas(); j++) {
                                        System.out.print(mult.getElementos(i, j) + "\t");
                                    }
                                    System.out.println();
                                }
                            } else {
                                System.out.println("As colunas de A devem ser iguais às linhas de B.");
                            }
                        }
                        case 6 -> {
                            Matriz trans = matrizA.transposta();
                            for (int i = 0; i < trans.getLinhas(); i++) {
                                for (int j = 0; j < trans.getColunas(); j++) {
                                    System.out.print(trans.getElementos(i, j) + "\t");
                                }
                                System.out.println();
                            }
                        }
                        case 7 -> {
                            Matriz op = matrizA.oposta();
                            for (int i = 0; i < op.getLinhas(); i++) {
                                for (int j = 0; j < op.getColunas(); j++) {
                                    System.out.print(op.getElementos(i, j) + "\t");
                                }
                                System.out.println();
                            }
                        }
                        case 8 -> {
                            Matriz nula = matrizA.nula();
                            for (int i = 0; i < nula.getLinhas(); i++) {
                                for (int j = 0; j < nula.getColunas(); j++) {
                                    System.out.print(nula.getElementos(i, j) + "\t");
                                }
                                System.out.println();
                            }
                        }
                        case 9 -> System.out.println(matrizA.identidade() ? "É identidade." : "Não é identidade.");
                        case 10 -> System.out.println(matrizA.diagonal() ? "É diagonal." : "Não é diagonal.");
                        case 11 -> System.out.println(matrizA.singular() ? "É singular." : "Não é singular.");
                        case 12 -> System.out.println(matrizA.simetrica() ? "É simétrica." : "Não é simétrica.");
                        case 13 -> System.out.println(matrizA.antisimetrica() ? "É antissimétrica." : "Não é antissimétrica.");
                        case 14 -> System.out.println(matrizA.comparar(matrizB) ? "Possui ao menos um elemento igual." : "Nenhum elemento igual.");
                        case 15 -> {
                            Matriz copia = matrizA.copia();
                            for (int i = 0; i < copia.getLinhas(); i++) {
                                for (int j = 0; j < copia.getColunas(); j++) {
                                    System.out.print(copia.getElementos(i, j) + "\t");
                                }
                                System.out.println();
                            }
                        }
                    }
                } else {
                    System.out.println("Opção inválida.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada! Esperado um valor numérico. Encerrando o programa.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
    }

