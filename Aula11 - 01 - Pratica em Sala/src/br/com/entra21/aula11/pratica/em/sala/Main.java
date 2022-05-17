package br.com.entra21.aula11.pratica.em.sala;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String option;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println(
					"\nDigite qual programa deseja utilizar: \n 0- Sair \n 1- Calculadora a Soma \n 2- Repetir 20 vezes quebrando linha \n"
							+ " 3- Entre 20 pessoas exibir a soma das idades \n 4- Entre 20 pessoas quantos são maiores de idade \n 5-Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova."
							+ " 6- Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares \n 7-Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100  \n 8-Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. Encerre a execução quando um número negativo for digitado."
							+ "9-Escreva um algoritmo que solicite a quantidade de notas e calcule a média do aluno");
			option = input.nextLine();

			switch (option.toLowerCase()) {
			case "0", "sair":
				break;
			case "1", "calculadora a soma", "calculadora":
				calculator();
				break;
			case "2", "repetir":
				repetidor20();
				break;
			case "3":
				somaidades();

				break;
			case "4":
				maiorDeIdade();
				break;
			case "5":
				exibirmaisnovo();
				break;
			case "6":

				break;
			case "7":

				break;
			case "8":
				exerciseOito();
				break;
			case "9":
				mediaAlunos();
				break;

			default:
				System.out.println("Digite uma opção valida");
				break;
			}

		} while (option.equals("0") == false); // ou colocar ! antes do option = !option....
		System.out.println("Obripado por usar o programa Lista de Exercicios!");
	}

	public static void exerciseOito() {

		// Escreva um algoritmo que leia uma sequência de números do usuário e realize a
		// soma desses números. Encerre a execução quando um número negativo for
		// digitado.

		Scanner inPut = new Scanner(System.in);
		int number, sum = 0; // se não inicializa um valor na váriavel ela fica com lixo da memória.

		do {

			System.out.println("What number do you want?");
			number = inPut.nextInt();
			if (number >= 0) {
				sum = sum + number;
			} // somente números positivos serão somados, ou números naturais.

		} while (number >= 0); // enquanto o número for maior que zero repita

		System.out.println("Your sum is: " + sum);

	}

	private static void mediaAlunos() {
		Scanner input = new Scanner(System.in);
		byte qtd, count = 0;
		float nota, soma = 0f;
		System.out.println("Quantas notas vc quer capturar?");
		qtd = input.nextByte();
		String resposta;

		do {
			count++;
			System.out.println("Informe uma nota");
			nota = input.nextFloat();
			if (count >= qtd) {
				System.out.println("Quer capturar mais alguma nota?");
				resposta = input.next();
				if (resposta.equals("sim")) {
					count--;
				}
			}

			soma = soma + nota;
		} while (count <= qtd);
		System.out.println("Soma =" + soma);
	}

	private static void exibirmaisnovo() {
		Scanner input = new Scanner(System.in);
		String name, youngername;
		byte age, ageminimal = 0;
		for (byte count = 1; count <= 10; count++) {
			System.out.println("Digite seu nome: ");
			name = input.next();
			System.out.println(name + "por favor, digite sua idade: ");
			age = input.nextByte();
			// no primeiro laço sempre a primeira idade vaiser a menor
			if (count == 1) {
				ageminimal = age;
				youngername = name;
				System.out.println("Sou primeiro epor isso sou o mais novo" + name + " " + age);
			} else {// a partir do segundo laço ja tenho como comparar com "ageminimal"
				System.out.println("EStou no laço" + count + "e preciso verificar");
				if (age < ageminimal) {
					System.out.println(
							"Ainda bem que testei porque a pessoa mais nova é " + name + " com " + age + " anos");
					ageminimal = age;
					youngername = name;
				}
			}
		}
		System.out.println("Após isso tudo o mais novo é: " + youngername + "" + ageminimal);
	}

	private static void somaidades() {
		int somaidade = 0;
		byte idade;
		Scanner input = new Scanner(System.in);
		for (byte count = 1; count <= 20; count++) {
			System.out.println("No momento a soma está em" + somaidade);
			System.out.println("Por favor, insira aidade: ");
			idade = input.nextByte();
			somaidade = somaidade + idade;

		}
	}

	private static void calculator() {
		System.out.println("CALCULANDO A SOMA");
		byte soma = 0;
		for (byte count = 1; count <= 15; count++) {
			System.out.println(
					"Soma = soma + counter, " + soma + " = " + soma + " + " + count + " ==> " + (soma + count));
			soma = (byte) (soma + count);
		}

	}

	private static void repetidor20() {

		for (byte count = 1; count < 20; count++) {
			System.out.print("Eu gosto de algoritomos " + (i % 5 == 0 ? "\n" : ""));
			// if (i % 5 == 0) {
			// System.out.println("\n");
			// }
		}

	}

	private static void maiorDeIdade() {

		System.out.println("Exibir apenas os maiors de idade");
		byte maiores = 0;
		byte idade, count;
		for (count = 1; count <= 20; count++) {
			Scanner input = new Scanner(System.in);

			System.out.println("informe a idade da pessoa " + i);
			idade = input.nextByte();
			if (idade >= 18) {
				maiores++;
				System.out.println("A última pessoa informada era de maior");
			}
		}
		System.out.println("Entre " + (count - 1) + " pessoas, apenas " + maiores + " são maiores de idade");
	}

}