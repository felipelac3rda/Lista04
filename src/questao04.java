public class questao04 {
	public static void main(String[] args) {
		String vetor[] = new String[4];
		String vetorSplitado[] = new String[10];
		vetor[0] = "luis";
		vetor[1] = "felipe";
		vetor[2] = "pessoa";
		vetor[3] = "lacerda";
		String mensagem;
		for (int i = 0; i < vetor.length; i++) {
			mensagem = vetor[i];
			vetorSplitado = split(mensagem);
			vogalConsoante(vetorSplitado);

		}

	}

	public static String[] split(String msg) {
		String vetor[] = new String[10];
		vetor = msg.split("");

		return vetor;
	}

	public static void vogalConsoante(String vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			if ((vetor[i].equals("a")) || (vetor[i].equals("e")) || (vetor[i].equals("i")) || (vetor[i].equals("o"))
					|| (vetor[i].equals("u"))) {
				System.out.println(vetor[i] + " - vogal");
			} else {
				System.out.println(vetor[i] + " - consoante");
			}
		}

	}
}
