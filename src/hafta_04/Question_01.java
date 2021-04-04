package hafta_04;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
		/*
		Kullanıcıdan bir isim ve karakter girmesini isteyin, sonra karakterin kaç kez tekrarlandığını kontrol edin.
		e.g:
		char ch1= 'a' ;
		String name =“John came late" 
=> Tekrar Sayisi = 2
		*/


		Scanner scan = new Scanner(System.in);
		System.out.println(" lutfen bir cumle giriniz: ");
		String name = scan.nextLine();
		System.out.println(" lutfen saymak istediginiz harfi giriniz: ");
        char ch1=scan.next().charAt(0);
		int tekrarSayisi = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i)==ch1) {
				tekrarSayisi++;

			}
		}

		System.out.println(" name de " +ch1 + " harfi " + tekrarSayisi + " defa kullanilmistir.");
		scan.close();

	}
}
