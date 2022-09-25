import java.util.Scanner;

public class questao01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int salarioMinimo = 0;
		int salario = 0;
		int numeroDependentes = 0;
		int impostoPago = 0;
		double auxiliarImpostoRenda = 0;
		double imposto = 0;
		double restituicao = 0;
		double impostoBruto = 0;

		System.out.print("Digite o valor do salário mínimo: ");
		salarioMinimo = ler.nextInt();
		System.out.print("Digite o valor do salário: ");
		salario = ler.nextInt();
		System.out.print("Digite o número de dependentes: ");
		numeroDependentes = ler.nextInt();
		System.out.print("Digite o valor de imposto já pago: ");
		impostoPago = ler.nextInt();

		auxiliarImpostoRenda = salario / salarioMinimo;
		if (auxiliarImpostoRenda <= 5) {
			imposto = 0;
		} else if ((auxiliarImpostoRenda > 5) && (auxiliarImpostoRenda <= 12)) {
			imposto = (salario / 100) * 8;
		} else if (auxiliarImpostoRenda > 12) {
			imposto = (salario / 100) * 20;
		}

		if (imposto == 0) {
			System.out.println("Sem taxa de imposto!");
		} else if (imposto > 0) {
			restituicao = (imposto / 100) * (numeroDependentes * 2);
			imposto = imposto - restituicao;
			impostoBruto = (imposto / 100) * 4;
			imposto = imposto + impostoBruto;
			imposto = imposto - impostoPago;
			System.out.println("O imposto a ser pago é: " + imposto);
		}

	}
}
