package backjoon1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			String str = "";
			for (int j = 0; j < n; j++) {
				if (j <= i) {
					str += "*";
				} else {
					str = " " + str;
				}

			}
			System.out.println(str);
		}
	}

}
