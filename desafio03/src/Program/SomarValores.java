package Program;

public class SomarValores {
	public static void main(String[] args) {
		int indice = 12;
		int soma = 0;
		int k = 1;
		
		
		while(k < indice) {
			k = k + 1;
			soma += k;
			
		}
		System.out.println("A Soma vale: " + soma);
	}

}
