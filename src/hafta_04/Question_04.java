package hafta_04;

import java.util.Scanner;

public class Question_04 {

	public static void main(String[] args) {
		/*
		 * Get numbers from the user and output that number consecutive fibonacci number
		 * sequence e.g : User enters 10 output : 0 1 1 2 3 5 8 13 21 34
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print(" Fibonacci dizinin kac terimini yazdirmak istiyorsunuz :");
		int n = scan.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < n; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
		scan.close();
	}

}
