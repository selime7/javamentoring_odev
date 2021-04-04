package hafta_03;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		 
		/*
		Ternary kullanarak:
				int variable : FIYAT
				string variable : Secim (String Secim=.....)
				price = $10 ise Print “UCUZ”
				price 10-$20 arasi ise Print “UYGUN”
				diger durumlar icin “PAHALI” yazdirin.
			*/
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir fiyat giriniz: ");
		int fiyat = scan.nextInt();
		String secim=(fiyat==10) ? "Ucuz" : (fiyat > 10 && fiyat < 20) ? "Uygun" : "Pahali";
		System.out.println(secim);
		scan.close();


	}

}
