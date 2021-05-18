package Bloco1;

//Problema 1759.

import java.util.Scanner;
public class Q3 {
	
	public static void main (String args[]) {
		
		Scanner dado;
		dado = new Scanner (System.in);
		
		
		int numero;
		
		System.out.println("Bem vindo à casa do papai noel, coloque seu número no gorro:");
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
