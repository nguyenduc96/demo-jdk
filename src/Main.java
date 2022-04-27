import java.util.Scanner;

public class Main {
	@SuppressWarnings("all")
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		String content = sc.nextLine();

		for (int i = 0; ; i++) {
			System.out.println(i + ": " + content);
			Thread.sleep(20);
		}
	}
}