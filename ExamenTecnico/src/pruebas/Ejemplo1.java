package pruebas;
/**
 *Un algoritmo que resuelva el problema asumiendo que la máquina en donde va a correrse el
 *programa tiene recursos infinitos, que el tiempo de ejecución no importa y que lo más
 *importante es realizar el desarrollo en el menor tiempo posible.
 *
 *Este algoritmo solo realiza lo que se pide como ejemplo, no interactua con el usuario,
 *establce una tabla finita de longitud/tamaña 4 y que la suma esperada es 8.
 */

public class Ejemplo1 {

	 /**
     * Muestra por pantalla si la suma de 2 números de un array es verdadero o falso
     * 
     * @autor Torres Brenda.
     */
	public static void main(String[] args) {
		
		//Se define un array de 4 enteros y se reserva espacio para 4 enteros
		int[] numeros = new int [4];
		
		//se asignan los valores
		numeros[0]=1;
		numeros[1]=2;
		numeros[2]=4;
		numeros[3]=4;
		
		//bandera
		boolean requiredSum = false;
		
		//recorremos el vector
		for(int i=0;i < numeros.length;i++) {
			//asignamos los elemntos de i a j, se suma 1 para no repetir pares o verificar un elemento consigo mismo
			for(int j = i + 1;j < numeros.length;j++) {
				
				//condicional, si los números sumados son iguales a 8
				if(numeros[j]+numeros[i]==8){
					requiredSum = true;
				}
			}
		//Salida 
		}if(requiredSum) {
			System.out.println("Output "+requiredSum);
		}else {
			System.out.println("Output "+requiredSum);
		}
	}
}
