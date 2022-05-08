package br.com.entra21.prova.quetao02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PROGRAMA 02
		// Crie um programa que fa�a v�rios c�lculos
		// Informe qual opera��o matem�tica deseja realizar
		// caso informe 0 deve encerrar o programa
		// 1 = somar
		// 2 = subtrair
		// 3 = multiplicar
		// 4 = dividir
		// Capturar os 2 valores e informar o resultado e esperar o pr�ximo calculo

		calculadora();
	}

	public static void calculadora() {
		String calculo;
		float num1, num2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem vindo Calculadora!");
		System.out.println("Digite o primeiro numero.");
		System.out.println();
		num1 = entrada.nextFloat();
		System.out.println("Digite o segundo numero.");
		System.out.println();
		num2 = entrada.nextFloat();
		System.out.println("Escolha qual o calculo.");
		System.out.println("Digite 1 para Soma");
		System.out.println("Digite 2 para Subtra��o");
		System.out.println("Digite 3 para Mutiplica��o");
		System.out.println("Digite 4 para Divis�o");
		System.out.println("Digite 0 para Encerrar");
		System.out.println();
		calculo = entrada.next();
		switch (calculo) {
		case "1":
			System.out.println("O resultado da soma  entre " + num1 + " e " + num2 + " � " + soma(num1, num2));
			novocalculo();
			break;
		case "2":
			System.out
					.println("O resultado da subtra��o  entre " + num1 + " e " + num2 + " � " + subtracao(num1, num2));
			novocalculo();
			break;
		case "3":
			System.out.println(
					"O resultado da multiplica��o  entre " + num1 + " e " + num2 + " � " + multiplicacao(num1, num2));
			novocalculo();
			break;
		case "4":
			System.out.println("O resultado da divis�o entre " + num1 + " e " + num2 + " � " + divisao(num1, num2));
			novocalculo();
			break;
		case "0":
			System.out.println("Programa Finalizado!");
			break;
		default:
			System.out.println("Digite uma op��o v�lida.");
			calculadora();
		}

	}

	public static float soma(float num1, float num2) {
		return num1 + num2;
	}

	public static float subtracao(float num1, float num2) {
		return num1 - num2;
	}

	public static float divisao(float num1, float num2) {
		return num1 / num2;
	}

	public static float multiplicacao(float num1, float num2) {
		return num2 * num1;

	}

	public static void novocalculo() {
		Scanner entrada = new Scanner(System.in);
		String novocalculo;

		System.out.println("Deseja fazer um novo caculo?");
		System.out.println("Digite 1 para sim");
		System.out.println("Digite 2 para n�o");
		novocalculo = entrada.nextLine();

		switch (novocalculo) {
		case "1":
			calculadora();
			break;
		case "2":
			System.out.println("Programa Finalizado!");
			break;
		default:
			System.out.println("Resposta Invalida!");
			System.out.println("Programa Finalizado!");
			break;
		}
	}
}
