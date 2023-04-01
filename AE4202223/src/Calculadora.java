//Clase Calculadora
//Fecha: 28/03/2023
//Autor: David González Maurín
//Comentario. Clase para realizar operaciones matemáticas de suma, resta, multiplicación y división
//----------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Calculadora {
    //Método para sumar los números
    public static int sumar(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }
    
    //Método para restar los números
    public static int restar(int numero1, int numero2) {
        int resta = numero1 - numero2;
    	return resta;
    }
    
    //Método para multiplicar los números
    public static int multiplicar(int numero1, int numero2) {
        int multiplicacion = numero1 *  numero2;
    	return multiplicacion;
    }
    
    //Método para dividir los números
    public static int dividir(int numero1, int numero2) {
        int division = numero1 /  numero2;
    	return division;
    }
    
    //Método para restar los números
    public static void resultados(int suma, int resta, int multiplicacion, int division) {
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + resta);
        System.out.println("La multiplicación de los números es: " + multiplicacion);
        System.out.println("La división de los números es: " + division);
    }
    
    public static void main(String[] args) {
        
        // Se crea un objeto de la clase Scanner para guardar los números
        Scanner sc = new Scanner(System.in);
        
        // Se guarda el primer número
        System.out.println("Introduzca el primer número:");
        int numero1 = sc.nextInt();
        
        // Se guarda el segundo número
        System.out.println("Introduce el segundo número:");
        int numero2 = sc.nextInt();
        
        // Se realizan las operaciones matemáticas
        int suma = sumar(numero1, numero2);
        int resta = restar(numero1, numero2);
        int multiplicacion = multiplicar(numero1, numero2);
        int division = dividir(numero1, numero2);
        
        // Se muestra por pantalla los resultados de cada operación matemática
        resultados(suma, resta, multiplicacion, division);
    }
}

