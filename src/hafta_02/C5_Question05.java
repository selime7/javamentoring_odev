package hafta_02;

import java.util.Scanner;

public class C5_Question05 {

	public static void main(String[] args) {
		/*
		 * Kullanıcını 1 ile 7 arasında bir sayı girdiğinde haftanın hangi günü olduğunu
		 * yazdıran switch case java kodunu yazinız.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 1 ile 7 dahil olmak uzere bu aralikta bir sayi giriniz");
		int sayi = scan.nextInt();
		switch (sayi) {
		case 1:
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("sali");
			break;
		case 3:
			System.out.println("carsamba");
			break;
		case 4:
			System.out.println("persembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar");
			break;

		default:
			System.out.println("lutfen gecerli bir sayi giriniz");
		}

		scan.close();
	}

}
