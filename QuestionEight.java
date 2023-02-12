/*
 Crie um algoritmo que leia dois números e imprima-os em ordem decrescente.
 */

package QuestionEight;

import java.util.Locale;
import java.util.Scanner;

public class QuestionEight {

	public static int numero1;
	public static int numero2;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		numero1 = sc.nextInt();
		System.out.print("Digite o 2º número: ");
		numero2 = sc.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("Em ordem decrescente fica: " + numero1 + " | " + numero2);
		}
		else {
			System.out.println("Em ordem decrescente fica: " + numero2 + " | " + numero1);
		}
	}

}