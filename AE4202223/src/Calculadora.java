
// Clase Calculadora
// Fecha: 28/03/2023
// Autor: David González Maurín
// Comentario. Clase para realizar operaciones matemáticas de suma, resta, multiplicación y división.
// ---------------------------------------------------------------------------------------------------
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		
		//Se crea un objeto de la clase Scanner para guardar los números
		Scanner sc = new Scanner(System.in);
			
			//Se guarda el primer número
			System.out.println("Introduzca el primer número:");
			int numero1 = sc.nextInt();
		    
			//Se guarda el segundo número
			System.out.println("Introduce el segundo número:");
		    int numero2 = sc.nextInt();
		    
		    //Se suman ambos números
		    int suma = numero1 + numero2;
		    
		    //Se restan ambos números
		    int resta = numero1 - numero2;
		    
		    //Se multiplican ambos números
		    int multiplicacion = numero1 * numero2;
		    
		    //Se dividen ambos números
		    int division = numero1 / numero2;
		    
		    //Se muestra por pantalla los resultados de cada operación matemática
		    System.out.println("La suma de los números es: " + suma);
		    System.out.println("La resta de los números es: " + resta);
		    System.out.println("La multiplicación de los números es: " + multiplicacion);
		    System.out.println("La división de los números es: " + division);
		  }
		}

