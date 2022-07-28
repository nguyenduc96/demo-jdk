package test_3cay;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] names = new String[]{"Mot", "Hai", "Ba", "Bon"};
		Scanner scanner = new Scanner(System.in);
		String[] bais = new String[names.length];
		String regex = "[1-9][RCTB]+ +[1-9][RCTB]+ +[1-9][RCTB]";

		for (int i = 0; i < names.length; i++) {
			String input = "";
			do {
				System.out.println("Nhap bai cua " + names[i] + ":");
				input = scanner.nextLine().toUpperCase();
				if (input.matches(regex)) {
					bais[i] = input;
				} else {
					System.out.println("Gia tri k hop le");
				}
			} while (!input.matches(regex));
		}
		for (int i = 0; i < bais.length; i++) {
			System.out.println(bais[i].replace(" ",""));
		}
	}
}
