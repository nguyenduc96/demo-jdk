import java.util.Scanner;

public class Main {
	@SuppressWarnings("all")
	public static void main(String[] args) throws InterruptedException {
		String[] chars1 = new String[]{"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"};
		String[] chars2 = new String[]{"A", "S", "D", "F", "G", "H", "J", "K", "L"};
		String[] strings3 = new String[]{"Z", "C", "V", "B", "N", "M"};

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter char A-> Z: ");
		String input = "";
		String output = "";

		do {
			input = scanner.nextLine();
			input = input.toUpperCase();
			switch (input) {
				case "A":
				case "S":
				case "D":
				case "F":
				case "G":
				case "H":
				case "J":
				case "K":
				case "L": {
					output += "2, ";
					output = extracted(chars2, input, output);
					break;
				}
				case "Q":
				case "W":
				case "E":
				case "R":
				case "T":
				case "Y":
				case "U":
				case "I":
				case "O":
				case "P": {
					output += "1, ";
					output = extracted(chars1, input, output);
					break;
				}
				case "Z":
				case "C":
				case "V":
				case "B":
				case "N":
				case "M": {
					output += "3, ";
					output = extracted(strings3, input, output);
					break;
				}
				default:
					System.out.println("Invalid input");
					break;
			}
			System.out.println(output);
			output = "";
		} while (input != "0");

	}

	private static String extracted(String[] strings, String input, String output) {
		StringBuilder outputBuilder = new StringBuilder(output);
		for (int i = 0; i < strings.length; i++) {
			if (input.equals(strings[i])) {
				outputBuilder.append(i + 1);
			}
		}
		output = outputBuilder.toString();
		return output;
	}
}