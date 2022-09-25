public class questao11 {
	public static void main(String[] args) {
		int matriz[][] = new int[3][2];
		matriz[0][0] = 5;
		matriz[0][1] = 0;
		matriz[1][0] = 8;
		matriz[1][1] = 5;
		matriz[2][0] = 7;
		matriz[2][1] = 6;

		System.out.println("Número de matrícula 508676: \n");
		imprimirMatrixIntHorario(matriz);
		System.out.println("\n");
		imprimirMatrixIntDeitada(matriz);
	}

	public static void imprimirMatrixIntHorario(int matriz[][]) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("\n");

		}
	}

	public static void imprimirMatrixIntDeitada(int matriz[][]) {
		for (int i = 2; i >= 0; i--) {
			for (int j = 1; j >= 0; j--) {
				if (j == 0) {
					System.out.print(matriz[i][j] + " ");
				}
			}
		}
		System.out.println("\n");
		for (int i = 2; i >= 0; i--) {
			for (int j = 1; j >= 0; j--) {
				if (j == 1) {
					System.out.print(matriz[i][j] + " ");
				}
			}
		}
	}
}
