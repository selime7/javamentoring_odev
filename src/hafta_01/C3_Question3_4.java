package hafta_01;

import java.util.Scanner;

public class C3_Question3_4 {

	public static void main(String[] args) {
		/*
		 * soru3 Konsolda Integer degiskeninin maximum ve minimum degerlerini yazdiran
		 * kodu yaziniz.
		 */

		/*
		 * soru4 Kullanicidan 3 basamakli bir sayi isteyin ve bu sayinin basamaklari
		 * toplamini konsolda yazdiran programi yaziniz.
		 */

		// soru3 un cevabi
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		// soru4 un cevabi

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen uc basamakli bir sayi giriniz :");
		int sayi = scan.nextInt();
		int birlerBas = sayi % 10;
		int onlarBas = (sayi / 10) % 10;
		int yuzlerBas = sayi / 100;
		if (sayi > 99 && sayi < 1000) {
			System.out.println("girdiginiz sayinin basamak degerleri toplami :" + (yuzlerBas + onlarBas + birlerBas));
		} else if (sayi >= -999 && sayi <= -100) {
			System.out.println("girdiginiz sayinin basamak degerleri toplami :" + (-1 * (yuzlerBas + onlarBas + birlerBas)));

		} else {
			System.out.println("lutfen uc basamakli bir sayi giriniz");
		}
		scan.close();

	}

}
