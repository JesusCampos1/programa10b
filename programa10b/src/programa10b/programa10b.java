package programa10b;

import java.util.Scanner;

public class programa10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		byte numero;
		int suma=0, i=0;
		
		do {
			System.out.print("Ingrese un numero");
			numero = leer.nextByte();
			if (numero>=0 && numero <=76) {
				suma+=numero;
				i++;
			}
		}while(numero<=76);
		System.out.print("Cantidad de numeros: " +i);
		System.out.print("El promedio es: " +(suma/i));

	}

}
