package hafta_03;

import java.util.Scanner;

public class Ouestion01 {

	public static void main(String[] args) {
		/*
		 * Kullanıcının girmiş olduğu A,B,C,D,F notlarının karşılığını yazdıran Switch
		 * Case java kodunu yazınız. A Excellent B Good C Average D Deficient F Failing
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen A,B,C,D,F notlarindan birini giriniz: ");
		String not = scan.next().toUpperCase();
		switch (not) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");

			break;

		case "C":
			System.out.println("Average");

			break;
		case "D":
			System.out.println("Deficient");

			break;
		case "F":
			System.out.println("Failing");
			break;
		default:
			System.out.println("Lutfen gecerli bir not giriniz");
		}
		scan.close();

	}

}
