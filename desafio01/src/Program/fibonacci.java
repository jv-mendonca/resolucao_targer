package Program;

import java.util.Scanner;

import entidades.calculo_fibonacci;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero para verificar se pertence à sequencia de Fibonacci: ");
		int numero = sc.nextInt();
		
		sc.close();
		
		
		if(calculo_fibonacci.FibonacciCalculo(numero)) {
			System.out.println("O numero "  + numero + " pertence à sequencia de Fibonacci");
		} else {
			System.out.println("O numero "  + numero + " nao pertence à sequencia de Fibonacci");
			
		}
	}

}
