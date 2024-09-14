package entidades;

public class calculo_fibonacci {
    
    public static boolean FibonacciCalculo(int numero) {
        if (numero < 0) {
            return false;
        }
        
        int a = 0, b = 1;
        
        if (numero == a || numero == b) {
            return true;
        }
        
        while (b < numero) {
            int proximo = a + b;
            a = b;
            b = proximo;
            
            if (b == numero) {
                return true;
            }
        }
        
        return false;
    }
}
