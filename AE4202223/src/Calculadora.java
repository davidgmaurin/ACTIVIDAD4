
// Clase Calculadora
// Fecha: 28/03/2023
// Autor: David Gonz�lez Maur�n
// Comentario. Clase para realizar operaciones matem�ticas de suma, resta, multiplicaci�n y divisi�n.
// ---------------------------------------------------------------------------------------------------
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		
		//Se crea un objeto de la clase Scanner para guardar los n�meros
		Scanner sc = new Scanner(System.in);
			
			//Se guarda el primer n�mero
			System.out.println("Introduzca el primer n�mero:");
			int numero1 = sc.nextInt();
		    
			//Se guarda el segundo n�mero
			System.out.println("Introduce el segundo n�mero:");
		    int numero2 = sc.nextInt();
		    
		    //Se suman ambos n�meros
		    int suma = numero1 + numero2;
		    
		    //Se restan ambos n�meros
		    int resta = numero1 - numero2;
		    
		    //Se multiplican ambos n�meros
		    int multiplicacion = numero1 * numero2;
		    
		    //Se dividen ambos n�meros
		    int division = numero1 / numero2;
		    
		    //Se muestra por pantalla los resultados de cada operaci�n matem�tica
		    System.out.println("La suma de los n�meros es: " + suma);
		    System.out.println("La resta de los n�meros es: " + resta);
		    System.out.println("La multiplicaci�n de los n�meros es: " + multiplicacion);
		    System.out.println("La divisi�n de los n�meros es: " + division);
		  }
		}

