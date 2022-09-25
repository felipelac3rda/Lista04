import java.util.Random;

public class questao03 {

	public static void main(String[] args) {

		int vetor[] = preencherVetor(100);
		imprimirVetor(vetor);

		int contvetorPositivosMultiplos = 0;
		int contvetorPositivosNaoMultiplos = 0;
		int contvetorNegativosMultiplos = 0;
		int contvetorNegativosNaoMultiplos = 0;

		System.out.println("\n\n");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == 0) {
				System.out.println(vetor[i] + " - Valor nulo");
			} else if (vetor[i] < 0) {
				if ((vetor[i] % 3) == 0) {
					System.out.println(vetor[i] + " - Valor negativo e multiplo de 3.");
					contvetorNegativosMultiplos++;

				} else {
					System.out.println(vetor[i] + " - Valor negativo e não multiplo de 3.");
					contvetorNegativosNaoMultiplos++;
				}
			} else if (vetor[i] > 0) {
				if ((vetor[i] % 3) == 0) {
					System.out.println(vetor[i] + " - Valor positvo e multiplo de 3.");
					contvetorPositivosMultiplos++;
				} else {
					System.out.println(vetor[i] + " - Valor positivo e não multiplo de 3.");
					contvetorPositivosNaoMultiplos++;
				}
			}
		}

		int vetorPositivosMultiplos[] = new int[contvetorPositivosMultiplos];
		int vetorPositivosNaoMultiplos[] = new int[contvetorPositivosNaoMultiplos];
		int vetorNegativosMultiplos[] = new int[contvetorNegativosMultiplos];
		int vetorNegativosNaoMultiplos[] = new int[contvetorNegativosNaoMultiplos];
		contvetorPositivosMultiplos = 0;
		contvetorPositivosNaoMultiplos = 0;
		contvetorNegativosMultiplos = 0;
		contvetorNegativosNaoMultiplos = 0;

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] < 0) {
				if ((vetor[i] % 3) == 0) {

					vetorNegativosMultiplos[contvetorNegativosMultiplos] = vetor[i];
					contvetorNegativosMultiplos++;

				} else {

					vetorNegativosNaoMultiplos[contvetorNegativosNaoMultiplos] = vetor[i];
					contvetorNegativosNaoMultiplos++;
				}
			} else if (vetor[i] > 0) {
				if ((vetor[i] % 3) == 0) {

					vetorPositivosMultiplos[contvetorPositivosMultiplos] = vetor[i];
					contvetorPositivosMultiplos++;
				} else {

					vetorPositivosNaoMultiplos[contvetorPositivosNaoMultiplos] = vetor[i];
					contvetorPositivosNaoMultiplos++;
				}
			}
		}

		System.out.println("\n\n");

		System.out.println("Vetor Positivos Multiplos de 3: ");
		imprimirVetor(vetorPositivosMultiplos);
		System.out.println("\n\n");

		System.out.println("Vetor Positivos Não Multiplos de 3: ");
		imprimirVetor(vetorPositivosNaoMultiplos);
		System.out.println("\n\n");

		System.out.println("Vetor Negativos Multiplos de 3: ");
		imprimirVetor(vetorNegativosMultiplos);
		System.out.println("\n\n");

		System.out.println("Vetor Negativos Não Multiplos de 3: ");
		imprimirVetor(vetorNegativosNaoMultiplos);
		System.out.println("\n\n");

	}

	public static int[] preencherVetor(int tam) {

		int vetor[] = new int[tam];
		Random random = new Random();

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(100) - 50;
		}
		return vetor;

	}

	public static void imprimirVetor(int vetor[]) {
		for (int i : vetor) {
			System.out.print(i + " ");
		}
	}
}
