package hafta_03;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		 
		/*
				StringMethods:
					Çift uzunlukta bir degiskenin ilk yarısını konsolda yazdirmak için bir Java programı yazıniz.
			    	     ORNEK:
				     	INPUT      :  Python
					OUTPUT :   Pyt
			    */
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen cift uzunlukta bir String giriniz: ");
		String str=scan.next();

		if (str.length()%2==0) {
			int orta=str.length()/2;
			System.out.println(str.substring(0,orta));
		}else
			System.out.println("Girmis oldugunuz String tek uzunluktadir.Lutfen cift uzunlukta bir String giriniz");
		scan.close();
			


	}
}




