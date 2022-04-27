import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap nam: ");
		int year = scanner.nextInt();

		System.out.println("Nhap dau trong thang: ");
		int startDayOfMonth = scanner.nextInt();
		int spaces = startDayOfMonth;

		String[] months = {
			"",
			"January", "February", "March",
			"April", "May", "June",
			"July", "August", "September",
			"October", "November", "December"
		};

		int[] days = {
			0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		};

		for (int month = 1; month <= 12; month++) {

			if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) && month == 2) {
				days[month] = 29;
			}

			System.out.println("          " + months[month] + " " + year);

			System.out.println("_____________________________________");
			System.out.println("   Sun  Mon Tue   Wed Thu   Fri  Sat");

			spaces = (days[month - 1] + spaces) % 7;

			for (int i = 0; i < spaces; i++)
				System.out.print("     ");
			for (int i = 1; i <= days[month]; i++) {
				System.out.printf(" %3d ", i);
				if (((i + spaces) % 7 == 0) || (i == days[month])) System.out.println();
			}

			System.out.println();
		}
	}
}
