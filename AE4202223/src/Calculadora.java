import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduzca el primer n�mero:");
			int numero1 = sc.nextInt();
		    System.out.println("Introduce el segundo n�mero:");
		    int numero2 = sc.nextInt();
		    
		    int suma = numero1 + numero2;
		    int resta = numero1 - numero2;
		    int multiplicacion = numero1 * numero2;
		    int division = numero1 / numero2;
		    
		    System.out.println("La suma de los n�meros es: " + suma);
		    System.out.println("La resta de los n�meros es: " + resta);
		    System.out.println("La multiplicaci�n de los n�meros es: " + multiplicacion);
		    System.out.println("La divisi�n de los n�meros es: " + division);
		  }
		}

