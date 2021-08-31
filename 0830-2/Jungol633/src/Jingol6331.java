import java.util.Scanner;

public class Jingol6331 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean b = true;
		do {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.println("number? ");
			int inp = sc.nextInt();

			
			if (inp == 1) {
				System.out.println("Seoul");
			} else if (inp == 2) {
				System.out.println("Washington");
			} else if (inp == 3) {
				System.out.println("Tokyo");
			} else if (inp == 4) {
				System.out.println("Beijing");
			} else {
				System.out.println("none");
				b = false;
			}
			System.out.println();
		} while (b);
		sc.close();
	}
}
