package hafta_03;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		  
		/*  
		* Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java kodunu yaziniz.
			*/
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir ay ismi giriniz: ");
		String ay= scan.next().toLowerCase();
		switch (ay) {
		case "ocak":
		case "mart":
		case "mayis":
		case "temmuz":
		case "agustos":
		case "ekim":
		case "aralik":
			System.out.println(ay+" 31 gundur");
			break;
		case "nisan":
		case "haziran":
		case "eylul":
		case "kasim":
			System.out.println(ay+" 30 gundur");
			break;
		case "subat":
			System.out.println(ay+" 28 gundur");
			break;
			default:
				System.out.println("lutfen gecerli bir ay ismi giriniz ");
		}
		scan.close();
		
	}

}
