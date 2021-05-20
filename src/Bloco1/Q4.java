package Bloco1;

//Problema 1018

import java.util.Scanner;

public class Q4 {

	public static void main (String args[]) {
		
		
		Scanner dado;
		dado = new Scanner (System.in);
		
		int pedidoSaque;
		
		int contador;

		
		System.out.println("Informe o valor que você deseja sacar:");
		pedidoSaque = dado.nextInt();
		
		
		System.out.println(pedidoSaque);
		
		
		contador = 0;
		while(pedidoSaque >= 100)
		{
			pedidoSaque = pedidoSaque - 100;
			
			contador++;
		}
		System.out.println(contador + " nota(s) de R$ 100,00");		
		
		contador = 0;
		while(pedidoSaque >= 50)
		{
			pedidoSaque = pedidoSaque - 50;
			
			contador++;
		}
		System.out.println(contador + " nota(s) de R$ 50,00");		
		
		
		contador = 0;
		while(pedidoSaque >= 20)
		{
			pedidoSaque = pedidoSaque - 20;
			
			contador++;
		}
		System.out.println(contador + " nota(s) de R$ 20,00");		
		
		
		contador = 0;
		while(pedidoSaque >= 10)
		{
			pedidoSaque = pedidoSaque - 10;
			
			contador++;
		}
		System.out.println(contador + " nota(s) de R$ 10,00");		
		
		
		contador = 0;
		while(pedidoSaque >= 5)
		{
			pedidoSaque = pedidoSaque -5;
			
			contador++;
		}
		System.out.println(contador + " nota(s) de R$ 5,00");		
		
		
		contador = 0;
		while(pedidoSaque >= 2)
		{
			pedidoSaque = pedidoSaque - 2;
			
			contador++;
		}
		System.out.println(contador + " nota(s) de R$ 2,00");		
		
		
		contador = 0;
		while(pedidoSaque >= 1)
		{
			pedidoSaque = pedidoSaque -1;
			
			contador++;
		}
		System.out.println(contador + " nota(s) de R$ 1,00");		
		
	}
	
}





















