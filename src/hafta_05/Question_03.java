package hafta_05;

import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
		/*
		 * SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
		 * onceden tanimlanmis array’de olup olmadigini kullaniciya donen bir method
		 * yaziniz
		 *
		 * Array={3,5,21,32,34,45,56,57,76,87,95}
		 *
		 * Input : 5 Output: Girdiginiz sayi Arrayde var Input : 15 Output: Girdiginiz
		 * sayi Arrayde yok
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir 100 den kucuk bir sayi giriniz : ");
		int sayi = scan.nextInt();
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
		scan.close();
	}
}
