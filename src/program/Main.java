package program;

/*
beecrowd | 1175 - Troca em Vetor I

Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último,
o segundo elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.

Entrada
A entrada contém 20 valores inteiros, positivos ou negativos.

Saída
Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor
armazenado naquela posição.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vet = new int[20];
		
		for(int i = 0; i < 20; i++) vet[i] = sc.nextInt();
		
		for(int i = 0, j = 19; i < 10; i++, j--) {
			int aux = vet[i];
			vet[i] = vet[j];
			vet[j] = aux;
		}
		
		for(int i = 0; i < 20; i++) System.out.printf("N[%d] = %d\n", i, vet[i]);
		
		sc.close();
	}
}