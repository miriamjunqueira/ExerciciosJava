package Bloco1;

//Problema 1759.

import java.util.Scanner;
public class Q3 {
	
	public static void main (String args[]) {
		
		Scanner dado;
		dado = new Scanner (System.in);
		
		
		int numero;
		
		System.out.println("Bem vindo � casa do papai noel, coloque seu n�mero no gorro:");
		numero  = dado.nextInt();
		
		while(numero > 1)
		{
			System.out.print("Ho ");
			
			numero --;
		}
		
		System.out.print("Ho");
		
		System.out.print("!");
	}

}
