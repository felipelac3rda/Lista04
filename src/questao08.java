public class questao08 {
	public static void main(String[] args) {
		String vetorNumero[] = new String[14];
		String numeroCodificado = "08899334GX##";

		vetorNumero = split(numeroCodificado);
		imprimirVetorString(vetorNumero);
		vetorNumero = decodificar(vetorNumero);
		imprimirVetorString(vetorNumero);

	}

	public static String[] split(String mensagem) {
		String vetor[] = new String[14];
		vetor = mensagem.split("");
		return vetor;
	}

	public static void imprimirVetorString(String vetor[]) {
		for (String i : vetor) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	public static String[] decodificar(String vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].equals("#")) {
				vetor[i] = "1";
			} else if ((vetor[i].equals("A")) || (vetor[i].equals("B")) || (vetor[i].equals("C"))) {
				vetor[i] = "2";
			} else if ((vetor[i].equals("D")) || (vetor[i].equals("E")) || (vetor[i].equals("F"))) {
				vetor[i] = "3";
			} else if ((vetor[i].equals("G")) || (vetor[i].equals("H")) || (vetor[i].equals("I"))) {
				vetor[i] = "4";
			} else if ((vetor[i].equals("J")) || (vetor[i].equals("K")) || (vetor[i].equals("L"))) {
				vetor[i] = "5";
			} else if ((vetor[i].equals("M")) || (vetor[i].equals("N")) || (vetor[i].equals("O"))) {
				vetor[i] = "6";
			} else if ((vetor[i].equals("P")) || (vetor[i].equals("Q")) || (vetor[i].equals("R"))
					|| (vetor[i].equals("S"))) {
				vetor[i] = "7";
			} else if ((vetor[i].equals("T")) || (vetor[i].equals("U")) || (vetor[i].equals("V"))) {
				vetor[i] = "8";
			} else if ((vetor[i].equals("W")) || (vetor[i].equals("X")) || (vetor[i].equals("Y"))
					|| (vetor[i].equals("Z"))) {
				vetor[i] = "9";
			} else if ((vetor[i].equals("+"))) {
				vetor[i] = "0";
			}

		}
		vetor = adicionarParenteses(vetor);
		return vetor;
	}

	public static String[] adicionarParenteses(String vetor[]) {
		String vetor2[] = new String[14];

		int cont = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (i == 0) {
				vetor2[i] = "(";

			} else if (i == 4) {
				vetor2[i] = ")";

			} else {
				vetor2[i] = vetor[cont];
				cont++;
			}

			vetor2[13] = vetor[11];
			vetor2[12] = vetor[10];

		}

		return vetor2;
	}
}
