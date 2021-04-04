package hafta_05;

import java.util.Scanner;

public class Question_02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan sayilar girmesini isteyin ve girdigi sayilari toplayip yazdirin.
		 * yeni sayi isteyin girilen sayilarin toplami 100 'u gecerse
		 * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
		 *
		 */
		Scanner scan = new Scanner(System.in);

		int toplam = 0;
		int count = 0;
		while (toplam <= 100) {
			System.out.println("Lutfen bir sayi giriniz: ");
			int sayi = scan.nextInt();

			toplam += sayi;

			count++;
		}
		System.out.println(count + " tane sayi girdin. bu kadar yeter. toplamin :" + toplam);
		scan.close();
	}

}
