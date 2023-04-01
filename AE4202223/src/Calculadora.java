//Clase Calculadora
//Fecha: 28/03/2023
//Autor: David Gonz�lez Maur�n
//Comentario. Clase para realizar operaciones matem�ticas de suma, resta, multiplicaci�n y divisi�n
//----------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Calculadora {
    //M�todo para sumar los n�meros
    public static int sumar(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }
    
    //M�todo para restar los n�meros
    public static int restar(int numero1, int numero2) {
        int resta = numero1 - numero2;
    	return resta;
    }
    
    //M�todo para multiplicar los n�meros
    public static int multiplicar(int numero1, int numero2) {
        int multiplicacion = numero1 *  numero2;
    	return multiplicacion;
    }
    
    //M�todo para dividir los n�meros
    public static int dividir(int numero1, int numero2) {
        int division = numero1 /  numero2;
    	return division;
    }
    
    //M�todo para restar los n�meros
    public static void resultados(int suma, int resta, int multiplicacion, int division) {
        System.out.println("La suma de los n�meros es: " + suma);
        System.out.println("La resta de los n�meros es: " + resta);
        System.out.println("La multiplicaci�n de los n�meros es: " + multiplicacion);
        System.out.println("La divisi�n de los n�meros es: " + division);
    }
    
    public static void main(String[] args) {
        
        // Se crea un objeto de la clase Scanner para guardar los n�meros
        Scanner sc = new Scanner(System.in);
        
        // Se guarda el primer n�mero
        System.out.println("Introduzca el primer n�mero:");
        int numero1 = sc.nextInt();
        
        // Se guarda el segundo n�mero
        System.out.println("Introduce el segundo n�mero:");
        int numero2 = sc.nextInt();
        
        // Se realizan las operaciones matem�ticas
        int suma = sumar(numero1, numero2);
        int resta = restar(numero1, numero2);
        int multiplicacion = multiplicar(numero1, numero2);
        int division = dividir(numero1, numero2);
        
        // Se muestra por pantalla los resultados de cada operaci�n matem�tica
        resultados(suma, resta, multiplicacion, division);
    }
}

