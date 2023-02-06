/**
 * @author N'ZO LAGOU
 * 
 * Créer un programme qui invite l'utilisateur à entrer un nombre

Utilise ensuite une boucle for imbriquée pour imprimer une table de multiplication pour le nombre saisi

Boucle While pour trouver le factoriel du nombre saisi

Et une boucle do-while pour imprimer la séquence de Fibonacci jusqu'au nombre saisi.

Remarque > Cet exercice utilise certains concepts avancés tels que les boucles imbriquées, 
la récursivité et les calculs mathématiques.
 */

package daily_challenge;

import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class Mutiblication {
	
	// mettre dans une methode
	
	public static	void execution() {
		
		
		//invite l'utilisateur à entrer un nombre
		System.out.println("Saisissez un numobre");
		Scanner sc = new Scanner(System.in);
		int number	= sc.nextInt();
		
	}
	
	//boucle for imbriquée pour imprimer une table de multiplication 
	private static void Mutiblication(int number) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(number + "* " + i +  " = " + (number*i));
		}
	}
	
	//Boucle While pour trouver le factoriel du nombre saisi
	private static int factoriel(int number) {
		
		int factoriel = 1;
		int counter = 1;
		while (counter <= number) {
			factoriel += factoriel*counter;
			counter++;
			//System.out.println("Mutiblication.factoriel()");
			System.out.println(" the number is " + number + " et " + factoriel);
		}
		return factoriel;
	}
	
	//boucle do-while pour imprimer la séquence de Fibonacci jusqu'au nombre saisi.

	private static String fibiomacci(int number) {
		
		int fib_pass = 0;
		int fib_current = 1;
		counter = 2;
		System.out.println(fib_pass + ", " + fib_current + ", ");
		
		do {
			int fib_suivant = fib_pass + fib_current;
			fib_pass = fib_current;
			fib_current = fib_suivant;
			
			if (fib_suivant > number ) {
				break;
			}
			counter++;
			System.out.println(fib_suivant+ ", ");
		} while (counter < number);
	}
	

}
