public class questao07 {

	public static void main(String[] args) {

		String palavra = "Luis Felipe";
		String aux = "";

		System.out.println(palavra);
		for (int x = palavra.length() - 1; x >= 0; x--) {
			aux = aux + palavra.charAt(x);
		}
		palavra = aux;
		System.out.println(palavra);
	}
}