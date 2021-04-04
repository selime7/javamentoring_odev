package hafta_02;

import java.util.Scanner;

public class C4_Question04 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 3 tane pozitif tam sayi alalim bu uc sayidan ucgen olup olmama
		 * durumunu kontrol edelim eger ucgen olabiliyor ise, es kenar ucgen mi kontrol
		 * edelim.
		 * 
		 * Ucgen olma kosullari. b+c>a>b-c 1 a+c>b>a-c 1 a+b>c>a-b 1
		 * 
		 * Eskenar ucgen olma kosullari. a=b=c
		 * 
		 * Konsolda asagidaki durumlari yazdiralim. Eskenar ucgen Sadece ucgen Ucgen
		 * degildir
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("lutfen birinci kenar uzunlugunu giriniz: ");
		double a = scan.nextDouble();
		System.out.print("lutfen ikinci kenar uzunlugunu giriniz: ");
		double b = scan.nextDouble();
		System.out.print("lutfen ucuncu kenar uzunlugunu giriniz: ");
		double c = scan.nextDouble();

		if(a<=0 || b<=0 || c<=0) {
			System.out.println("lutfen gecerli bir sayi giriniz.");
		}
		
		else if (a == b && b == c) {
			System.out.println("eskenar ucgendir");

		} else {
			if ((b + c > a && a > b - c) && (a + c > b && b > a - c) && (a + b > c && c > a - b)) {
				System.out.println("sadece ucgendir");
			} else {
				System.out.println("ucgen degildir");
			}

		}
		scan.close();

	}

}
