package es.studium.EjemploScanner;

import java.util.Scanner;

public class EjemploScanner
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int opcion = 0, numero;
		String frase = "";
		do
		{
			System.out.println("\nMenú\n"); 
			System.out.println("(1) -Hacer algo");
			System.out.println("(2) -Salir"); 
			System.out.print("Por favor, elija una opción:");
			opcion = Integer.parseInt(teclado.nextLine()); // Lectura de un entero
			
			if(opcion==1)
			{
				System.out.print("Escribir una frase:"); 
				frase = teclado.nextLine(); // Lectura de una cadena
				System.out.print("Escribir un número:"); 
				numero = Integer.parseInt(teclado.nextLine()); // Lectura de un entero
				System.out.println("\nTu frase es:\t" + frase); 
				System.out.println("Tu número:\t" + numero);
			}
		}while(opcion!=2);
		System.out.println("Saliendo..."); // Cerramos el objeto tecladoteclado.close();
	}

}




