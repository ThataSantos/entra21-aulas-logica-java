package br.com.entra21.aula15.aulapratica.matrizes;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		byte option;

		do {
			System.out.println(menuOption());
			option = input.nextByte();
			switch (option) {
			case 0:
				System.out.println("You chose Exit.");
				break;
			case 1:
				displayArraySize();
				break;
			case 2:
				displayArraySizeInitialized();
				break;
			case 3:
				arraysize5Whith3items();
				break;
			case 4:
				requestArraySizeToFill();
				break;
			case 5:
				initializedIntegerArray();
				break;
			case 6:
				randomlyAssignValuesDetailsVectors();
				break;

			default:
				System.out.println("invalid option!");
				break;

			}
		} while (option != 0);
		System.out.println("Thanks for using the program!");

	}

	private static String menuOption() {
		String contentMenu = "";
		contentMenu += "Choose Exercise:\n";
		contentMenu += "\t0 - Exit.\n";
		contentMenu += "\t1 - Create 2-level arrays for each primitive type and display their size in console.\n";
		contentMenu += "\t2 - Create initialized 2-level arrays for each primitive type and display their size in console.\n";
		contentMenu += "\t3 - Create 1 array of 5 positions with 3 capacity items, for the user to feed these values.\n";
		contentMenu += "\t4 - Create an array with the size and capacity entered by the user and then ask the user to enter the respective values.\n";
		contentMenu += "\t5 - Create an initialized integer array, to loop through,From beginning to end, From end to beginning, To display the values.\n";
		contentMenu += "\t6 - Create an uninitialized integer array, Repeat indefinitely until the user answers no to the question: Would you like to initialize the value of one of the positions between 1 and SIZE?\n";

		return contentMenu;
	}

	private static void displayArraySize() {
		byte arrayBytes[][];
		short arrayShorts[][];
		int arrayInts[][];
		long arrayLongs[][];
		float arrrayFloats[][];
		double arrayDoubles[][];
		char arrayChars[][];
		boolean arrayBooleans[][];
		arrayBytes = new byte[2][3];
		arrayShorts = new short[3][4];
		arrayInts = new int[3][5];
		arrayLongs = new long[4][6];
		arrrayFloats = new float[6][8];
		arrayDoubles = new double[7][9];
		arrayChars = new char[5][7];// cinco vetores onde cada um pode armazenar 7 letras
		arrayBooleans = new boolean[8][10];// oito vetores onde cada um pode armazenar 10 valores lógicos

		System.out
				.println("arrayBytes size = " + arrayBytes.length + "and each vector has size " + arrayBytes[0].length);
		System.out.println(
				"arrayShorts size = " + arrayShorts.length + "and each vector has size " + arrayShorts[0].length);
		System.out.println("arrayInts size = " + arrayInts.length + "and each vector has size " + arrayInts[0].length);
		System.out
				.println("arrayLongs size = " + arrayLongs.length + "and each vector has size " + arrayLongs[0].length);
		System.out.println(
				"arrayFloats size = " + arrrayFloats.length + "and each vector has size " + arrrayFloats[0].length);
		System.out.println(
				"arrayDoubles size = " + arrayDoubles.length + "and each vector has size " + arrayDoubles[0].length);
		System.out
				.println("arrayChars size = " + arrayChars.length + "and each vector has size " + arrayChars[0].length);
		System.out.println(
				"arrayBooleans size = " + arrayBooleans.length + "and each vector has size " + arrayBooleans[0].length);

	}

	private static void displayArraySizeInitialized() {
		byte arrayBytes[][] = { { 5, 7, 9, 10 }, { 127, 30, 13 }, { 4, 8, 99 } };
		// quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
		// regular porque todos a mesma capacidade de itens por vetores
		short arrayShorts[][] = { { 135, 140, 125 }, { 128, 130, 140 }, { 150, 160, 190 } };
		// quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
		// regular porque todos a mesma capacidade de itens por vetores
		int arrayInts[][] = { { 1666, 2000, 1999 }, { 1500, 1900, 1200 }, { 1350, 1450, 1550 } };
		// quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
		// regular porque todos a mesma capacidade de itens por vetores
		long arrayLongs[][] = { { 111000, 220000, 199000 }, { 150000, 120000, 130000 }, { 200000, 300000, 400000 } };
		// quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
		// regular porque todos a mesma capacidade de itens por vetores
		float arrrayFloats[][] = { { 10000.66f, 250156.50f, 1500000 }, { 150.65f, 10.15f, 3.14f },
				{ 48548.36f, 52698.63f, 25015.05f } };
		// quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
		// regular porque todos a mesma capacidade de itens por vetores
		double arrayDoubles[][] = { { 150000.354d, 400000.12345d, 58968.66d },
				{ 158485.354d, 1599600000.12345d, 58987521.63d }, { 45896936589.63d, 784545485.69d } };
		// quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
		// irregular porque tem tamanhos diferente de index
		char arrayChars[][] = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' } };
		// quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
		// regular porque todos a mesma capacidade de itens por vetores
		boolean arrayBooleans[][] = { { true, false, true }, { false, true, true }, { false, false, false } };
		// quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
		// regular porque todos a mesma capacidade de itens por vetores

		System.out
				.println("arrayBytes size = " + arrayBytes.length + "and each vector has size " + arrayBytes[0].length);
		System.out.println(
				"arrayShorts size = " + arrayShorts.length + "and each vector has size " + arrayShorts[0].length);
		System.out.println("arrayInts size = " + arrayInts.length + "and each vector has size " + arrayInts[0].length);
		System.out
				.println("arrayLongs size = " + arrayLongs.length + "and each vector has size " + arrayLongs[0].length);
		System.out.println(
				"arrayFloats size = " + arrrayFloats.length + "and each vector has size " + arrrayFloats[0].length);
		System.out.println(
				"arrayDoubles size = " + arrayDoubles.length + "and each vector has size " + arrayDoubles[0].length);
		System.out
				.println("arrayChars size = " + arrayChars.length + "and each vector has size " + arrayChars[0].length);
		System.out.println(
				"arrayBooleans size = " + arrayBooleans.length + "and each vector has size " + arrayBooleans[0].length);

	}

	private static void arraysize5Whith3items() {
		byte arrayUser[][] = new byte[5][3];
		System.out.println("Enter the first value to be stored in the first vector , please.");
		arrayUser[0][0] = input.nextByte();
		System.out.println("Enter the second value to be stored in the first vector , please.");
		arrayUser[0][1] = input.nextByte();
		System.out.println("Enter the third value to be stored in the first vector , please.");
		arrayUser[0][2] = input.nextByte();

		for (byte vector = 1; vector < arrayUser.length; vector++) {// [1][2][3][4]// Continuando minha captura com FOR

			for (byte detail = 0; detail < arrayUser[vector].length; detail++) {
				System.out.println("To " + (vector + 1) + "º vector inform the " + (detail + 1) + "º value");
				arrayUser[vector][detail] = input.nextByte();

			}
		}

	}

	public static void requestArraySizeToFill() {

		byte sizeVector, sizeDetail;
		byte arrayByte[][];

		System.out.println("How many vectors do you want in your matrix: ");
		sizeVector = input.nextByte();
		System.out.println("How many items do you want in each vector: ");
		sizeDetail = input.nextByte();

		arrayByte = new byte[sizeVector][sizeDetail];

		for (byte vector = 0; vector < arrayByte.length; vector++) {

			for (byte detail = 0; detail < arrayByte[vector].length; detail++) {

				System.out.println("to the index [" + vector + "] detail [" + detail + "] inform the value ");
				arrayByte[vector][detail] = input.nextByte();
			}
		}

		for (byte vector = 0; vector < arrayByte.length; vector++) {

			for (byte detail = 0; detail < arrayByte[vector].length; detail++) {

				System.out.println(
						"Array bytes [" + vector + "] detail [" + detail + "] ==> " + arrayByte[vector][detail]);

			}
		}

	}

	private static void initializedIntegerArray() {
		int arrayVectorInt[][] = { { 1666, 2000, 1999 }, { 1500, 1900, 1200 }, { 1350, 1550, 1650 } };
		for (int vector = 0; vector < arrayVectorInt.length; vector++) {
			for (int detail = 0; detail < arrayVectorInt.length; detail++) {
				System.out.println(arrayVectorInt[vector][detail]);
			}
		}
		System.out.println("----");
		for (int vector = (int) (arrayVectorInt.length - 1); vector >= 0; vector--) {
			for (int detail = (int) (arrayVectorInt.length - 1); detail >= 0; detail--) {
				System.out.println(arrayVectorInt[vector][detail]);
			}
		}

	}

	public static void randomlyAssignValuesDetailsVectors() {

		byte arrayBytes[][] = new byte[30][10];
		String answers;
		byte vector = 0, detail = 0;

		do {
			System.out.println("to the vector" + vector + "and detail" + detail + "inform the value");
			arrayBytes[vector][detail] = input.nextByte();

			System.out.println(" Do you would like to initialize another value?");
			answers = input.next();
			if (answers.equalsIgnoreCase("yes")) {
				System.out.println("Which vector do you want to access?");
				vector = input.nextByte();
				System.out.println("Which detail of this vector do you want to update the value?");
				detail = input.nextByte();

			}
		} while (answers.equalsIgnoreCase("yes"));

	}

}
