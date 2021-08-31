package backJoon;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];

		// input
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		sc.close();

		// print
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();

		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 40) {
				sum += score[i];
			} else {
				sum += 40;
			}

			sum += score[i];
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + sum / score.length);
	}

}
