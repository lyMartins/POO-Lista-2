package Questão6Lista2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questão6Lista2 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        try {

            System.out.print("Digite o nome da pessoa: ");
            String nome = Teclado.nextLine();


            System.out.print("Deseja informar os nomes dos pais? (s/n): ");
            String resposta = Teclado.nextLine().toLowerCase();

            Pessoa pai = null, mae = null;

            if (resposta.equals("s")) {
                System.out.print("Digite o nome do pai: ");
                String nomePai = Teclado.nextLine();
                pai = new Pessoa(nomePai);

                System.out.print("Digite o nome da mãe: ");
                String nomeMae = Teclado.nextLine();
                mae = new Pessoa(nomeMae);
            }

            Pessoa pessoa = new Pessoa(pai, mae, nome);
            System.out.println("\nPessoa criada com sucesso!");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Pai: " + pessoa.getPai().getNome());
            System.out.println("Mãe: " + pessoa.getMae().getNome());

            System.out.print("Digite o nome da segunda pessoa : ");

            String nome2 = Teclado.nextLine();

            System.out.print("Digite o nome do pai: ");

            String nomePai = Teclado.nextLine();

            pai = new Pessoa(nomePai);

            System.out.print("Digite o nome da mãe: ");

            String nomeMae = Teclado.nextLine();

            mae = new Pessoa(nomeMae);

            Pessoa outra = new Pessoa(pai, mae, nome2);

            boolean iguais = pessoa.igualdade(outra);
            System.out.println("\nA nova pessoa é considerada igual? " + (iguais ? "Sim" : "Não"));

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite os dados corretamente.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
