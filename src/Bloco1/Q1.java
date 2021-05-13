
package Bloco1;

import java.util.Scanner;

//Problema 1015.
public class Q1 {
	
	public static void main (String args[]) {
		
		Scanner dado;
		dado = new Scanner (System.in);
		
		
		double x1, y1, x2, y2;
		
//		System.out.println("Forneça o valor de x1:");
		x1 = dado.nextDouble();
		
//		System.out.println("Forneça o valor de y1:");
		y1 = dado.nextDouble();
		
//		System.out.println("Forneça o valor de x2:");
		x2 = dado.nextDouble();
		
//		System.out.println("Forneça o valor de y2:");
		y2 = dado.nextDouble();
		

		double conta = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) );
		System.out.printf("%.4f", conta);
		
	}

}
