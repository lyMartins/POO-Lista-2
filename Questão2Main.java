package q2Lista2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Questão2Main {
	
	private static Scanner Teclado;

	public static void main(String[] args) {
		
		Teclado = new Scanner(System.in);

		double x1,y1,x2,y2;
		
		System.out.println("insira as coordenadas do Ponto2D : ");
		try {
		
			x1 = Teclado.nextDouble();
					
			y1 = Teclado.nextDouble();
			
			Ponto2D ponto1 = new Ponto2D(x1,y1);
			
			System.out.println("\nponto criado ----> [" + ponto1.getCoordenadasX() + " ; " + ponto1.getCoordenadasY() + "]");
			
			System.out.println("adicione o próximo ponto : ");
			
			x2 = Teclado.nextDouble();
			
			y2 = Teclado.nextDouble();
			
			
			Ponto2D ponto2 = new Ponto2D(x2,y2);
			
			System.out.println("\nponto criado ----> [" + ponto2.getCoordenadasX() + " ; " + ponto2.getCoordenadasY() + "]");
			
			System.out.println("a distancia entre os pontos é :" + ponto1.distancia(ponto2));
			
			System.out.println("o ponto 1 é igual ao ponto 2?  " + ponto1.equals(ponto2));
			
			}
			
			catch(InputMismatchException e) {
				System.out.println("entrada inválida");
			}
			

        
		
		
		
			
		
			
			
		
	}

}
