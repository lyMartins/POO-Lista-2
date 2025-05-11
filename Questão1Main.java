package q1Lista2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questão1Main {

	private static Scanner Teclado;
	
	public static void main(String[] args) {
		
		System.out.println("Insira um número ao contador : ");
		
		Teclado = new Scanner(System.in);
		
		int opcao= 0;
		
		Contador X = new Contador();
		Contador Y = new Contador();
		
		X.setValor(Teclado.nextInt());
		
		System.out.println(X.getValor());
		
       do {  
    	   
    	   System.out.println("\nEscolha uma opção:");
    	   System.out.println("1. Incrementar o contador");
    	   System.out.println("2. Zerar o contador");
    	   System.out.println("3. Mostrar o valor do contador");
    	   System.out.println("4. Sair");
    	   
         try {
        	
        	 opcao = Teclado.nextInt();
        	 
        	 if (opcao == 1) {
        		 X.incrementar();
        		 System.out.println("O valor foi incrementado : " + X.getValor());
        		 
        		 }
        	 else if (opcao == 2) {
        		 X.Zerar();
        		 System.out.println("O valor foi zerado : " + X.getValor());
        		 
        		 }
        	 else if (opcao == 3) {
        		 System.out.println("O valor : " + X.getValor());
        		 
        		 }
        	 else if (opcao == 4) {
        		 System.out.println("Saindo . . . ");
        		 }
        	 else {
        		 System.out.println("número inválido, digite novamente : ");	
        	 }
        	 
        	 }
         	catch(InputMismatchException e) {
         		System.out.println("entrada inválida, por favor, digite um número : ");
         		Teclado.nextLine();
         	}
       
   		}
       while(opcao != 4);
       Teclado.close();
       }
       
		
	}


