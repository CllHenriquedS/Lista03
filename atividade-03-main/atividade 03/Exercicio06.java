/*
* 6) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus
* Celsius. A fórmula deconversão é C=(F-32)*(5/9), sendo F a temperatura em
* Fahrenheit e C a temperatura em Celsius.
*/ 
package tarefa03deLinguagemdeProgramaçãoJava;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Digite o Graus em Fahrenheit : ");
	   float Fahrenhait = sc.nextFloat();
	   float converFahrenheit = (Fahrenhait - 32) * 5 / 9;
	System.out.println("A converção do Fahrenheit para Celsius é : " + converFahrenheit);
sc.close();
	}
}
