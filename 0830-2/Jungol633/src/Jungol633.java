import java.util.Scanner;

public class Jungol633 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i;
		while(true)
		{
		
		System.out.println("1. Korea");
		System.out.println("2. USA");
		System.out.println("3. Japan");
		System.out.println("4. China");
		System.out.print("number? ");
		i = sc.nextInt();
		
		System.out.println(); //¡ŸπŸ≤ﬁ
		if(i == 1)
		{
			System.out.println("Seoul\n");
		}
		else if(i ==2) {
			System.out.println("Washington\n");
		}
		else if(i == 3) {
			System.out.println("Tokyo\n");
		}
		else if(i == 4) {
			System.out.println("Beijing\n");
		}
		else {
			System.out.println("none");
			break;
			}
		}
	}
}