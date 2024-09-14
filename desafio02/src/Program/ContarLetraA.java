package Program;

import java.util.Scanner;

public class ContarLetraA {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite um Frase: ");
		String frase = sc.nextLine();
		
		
		sc.close();
		
		int contador = contarLetraA(frase);
		
		if (contador > 0){
			System.out.println("A letra 'a' (maiusculas ou minusculas) ocorre: " + contador + " vezes");
		} else {
			System.out.println("A letra 'a' (maiusculas ou minusculas) nao ocorre na frase!");
		}
		
	}
	
	
	public static int contarLetraA(String letra) {
		int contador = 0;
		for (char c : letra.toCharArray()) {
			if (c == 'a' || c == 'A') {
				contador ++;
			}
		}
		
		return contador;
	}
}
	

