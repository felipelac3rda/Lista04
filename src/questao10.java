import java.lang.Math;
import java.util.Scanner;

public class questao10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String numero = "";
		System.out.print("Digite o número: ");
		numero = ler.next();

		int numeroInt = Integer.parseInt(numero);
		String stringNum[] = new String[10];

		stringNum = split(numero);
		int intNum[] = new int[stringNum.length];
		intNum = converterStringInt(stringNum);
		armstrong(numeroInt, intNum);

	}

	public static String[] split(String num) {
		String numero[] = new String[10];
		numero = num.split("");
		return numero;
	}

	public static void imprimirVetorString(String vetor[]) {
		for (String i : vetor) {
			System.out.print(i);
		}
		System.out.println("\n");
	}

	public static void imprimirVetorInt(int vetor[]) {
		for (int i : vetor) {
			System.out.print(i);
		}
		System.out.println("\n");
	}

	public static int[] converterStringInt(String vetorString[]) {
		int vetor[] = new int[vetorString.length];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(vetorString[i]);
		}

		return vetor;
	}

	public static void armstrong(int numero, int vetor[]) {
		int contador = 0;

		for (int i = 0; i < vetor.length; i++) {
			contador += Math.pow(vetor[i], vetor.length);
		}
		if (contador == numero) {
			System.out.print(numero + " - é um número de Armstrong!");
		} else {
			System.out.print(numero + " - não é um número de Armstrong!");
		}
	}

}
