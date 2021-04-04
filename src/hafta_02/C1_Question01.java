package hafta_02;

import java.util.Scanner;

public class C1_Question01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan email girmesini isteyin
		 * 
		 * @ isareti icermiyorsa �gecerli bir email girin� yazdirin
		 * 
		 * @ isaretinden sonra sadece �gmail.com� yaziyorsa �email onaylandi� yazdirin
		 * 
		 * @ isaretinden sonra �gmail.com� disinda birsey yaziyorsa �Lutfen gmail
		 * hesabinizi girin� yazdirin ORNEK: INPUT : techproed.com OUTPUT : �gecerli bir
		 * email girin� INPUT : techproed@gmail.com OUTPUT : �email onaylandi� INPUT :
		 * techproed@hotmail.com OUTPUT : �Lutfen gmail hesabinizi girin�
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen mail adresinizi giriniz: ");
		String email = scan.next();
		if (!email.contains("@")) { 
			System.out.println("lutfen gecerli bir email girin");

		} else if (email.endsWith("@gmail.com")) {
			System.out.println("Email onaylandi");

		} else {
			System.out.println("Lutfen gmail hesabinizi girin");

		}
		scan.close();
	}

}
