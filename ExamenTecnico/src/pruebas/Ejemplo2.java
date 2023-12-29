package pruebas;

import java.util.Scanner;
/**Un algoritmo que resuelva el problema asumiendo que los recursos son un bien preciado,
*que el tiempo de ejecución si importa y que el tiempo de desarrollo no es importante.
*/


public class Ejemplo2 {
	
	 /**
     *Se solicita al usuario ingresar no solo el tamaño del array sino tambien la suma esperada.
     * 
     * @autor Torres Brenda.
     */
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		int cantidad;
		
		//se solicita al usuario ingrese la longitud del vector o tabla
		System.out.println("Cuantos números desea ingresar? ");
		cantidad = p.nextInt();
		
		//Se define un array de enteros y se reserva espacio segun la longitud solicitada por el usuario
		int numeros[] = new int [cantidad];
		
		//Se solicita al usuario que número desea como resultado de la suma
		System.out.println("Suma esperada? ");
		int suma = p.nextInt();
		
		//Función encargada de cargar los elementos en la tabla
		cargarTabla(numeros);
		
		//Función encargada de comparar los números ingresados con el valor de la suma
		buscarSuma(numeros,suma);
	}

	
	//función cargar tabla
	static void cargarTabla(int t[]) {
		Scanner p = new Scanner(System.in);
		for (int i = 0; i < t.length; i++) {
            System.out.println("Ingrese los números: ");
            t[i] = p.nextInt();
        }
	}
	
	//Funcion comparar y sumar
	static void buscarSuma(int t[], int suma) {
		boolean requiredSum = false;
		
		for(int i=0;i < t.length;i++) {
			for(int j = i + 1;j < t.length;j++) {
				if(t[j]+t[i]==suma){
					requiredSum = true;
					break; // Termina el bucle si se encuentra una suma
				}
				if (requiredSum) {
	                break; // Termina el bucle exterior si encuentra la suma 
	            }
			}
			
		}if(requiredSum) {
			System.out.println("Output: "+requiredSum);
		}else {
			System.out.println("Output: "+requiredSum);
		}
	}
		
}
