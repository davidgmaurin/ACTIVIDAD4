import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduzca el primer número:");
			int numero1 = sc.nextInt();
		    System.out.println("Introduce el segundo número:");
		    int numero2 = sc.nextInt();
		    
		    int suma = numero1 + numero2;
		    int resta = numero1 - numero2;
		    int multiplicacion = numero1 * numero2;
		    int division = numero1 / numero2;
		    
		    System.out.println("La suma de los números es: " + suma);
		    System.out.println("La resta de los números es: " + resta);
		    System.out.println("La multiplicación de los números es: " + multiplicacion);
		    System.out.println("La división de los números es: " + division);
		  }
		}

