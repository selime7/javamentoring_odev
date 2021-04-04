package hafta_05;

import java.util.Scanner;

public class Question03m {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir 100 den kucuk bir sayi giriniz : ");
		int sayi = scan.nextInt();

		iceriyorMu(sayi);
		scan.close();
	}

	public static void iceriyorMu(int sayi) {
		int arr[] = { 3, 5, 21, 32, 34, 45, 56, 57, 76, 87, 95 };
		if (sayi < 100) {
			boolean var = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == sayi) {
					var = true;
				}
			}
			if (var) {
				System.out.println("array " + sayi + " iceriyor.");
			} else {
				System.out.println("array " + sayi + " icermiyor.");
			}
		} else {
			System.out.println("lutfen 100 den kucuk bir sayi giriniz");
		}

	}
}
