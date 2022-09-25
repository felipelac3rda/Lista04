import java.util.Random;

public class questao05 {
	public static void main(String[] args) {

		int vetor1[] = preencherVetor(10);
		System.out.print("Vetor1: ");
		imprimirVetor(vetor1);
		int vetor2[] = preencherVetor(10);
		System.out.print("Vetor2: ");
		imprimirVetor(vetor2);
		int vetor3[] = preencherVetor(10);
		System.out.print("Vetor3: ");
		imprimirVetor(vetor3);

		int vetorSoma[] = new int[3];
		int vetorProduto[] = new int[3];
		int vetorMedia[] = new int[3];

		System.out.println("Vetor1: \n Soma - " + somaVetor(vetor1) + "\n Produto - " + produtoVetor(vetor1)
				+ "\n Média  - " + mediaVetor(vetor1) + "\n");
		System.out.println("Vetor2: \n Soma - " + somaVetor(vetor2) + "\n Produto - " + produtoVetor(vetor2)
				+ "\n Média  - " + mediaVetor(vetor2) + "\n");
		System.out.println("Vetor3: \n Soma - " + somaVetor(vetor3) + "\n Produto - " + produtoVetor(vetor3)
				+ "\n Média  - " + mediaVetor(vetor3) + "\n");

		vetorSoma[0] = somaVetor(vetor1);
		vetorSoma[1] = somaVetor(vetor2);
		vetorSoma[2] = somaVetor(vetor3);
		vetorProduto[0] = produtoVetor(vetor1);
		vetorProduto[1] = produtoVetor(vetor2);
		vetorProduto[2] = produtoVetor(vetor3);
		vetorMedia[0] = mediaVetor(vetor1);
		vetorMedia[1] = mediaVetor(vetor2);
		vetorMedia[2] = mediaVetor(vetor3);

		System.out.print("VetorSoma: ");
		imprimirVetor(vetorSoma);
		System.out.print("VetorProduto: ");
		imprimirVetor(vetorProduto);
		System.out.print("VetorMedia: ");
		imprimirVetor(vetorMedia);

		System.out.println("VetorSoma: " + somaVetor(vetorSoma));
		System.out.println("VetorProduto: " + produtoVetor(vetorProduto));
		System.out.println("VetorMedia: " + mediaVetor(vetorMedia));

	}

	public static int[] preencherVetor(int tam) {
		int vetor[] = new int[tam];
		Random random = new Random();

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(10) + 1;
		}
		return vetor;

	}

	public static int mediaVetor(int vet[]) {
		int media = 0;
		for (int i = 0; i < vet.length; i++) {
			media += vet[i];
		}

		return media / vet.length;
	}

	public static int somaVetor(int vet[]) {
		int soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}

		return soma;
	}

	public static int produtoVetor(int vet[]) {
		int produto = 1;
		for (int i = 0; i < vet.length; i++) {
			produto *= vet[i];
		}

		return produto;
	}

	public static void imprimirVetor(int vet[]) {
		for (int i : vet) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

}
