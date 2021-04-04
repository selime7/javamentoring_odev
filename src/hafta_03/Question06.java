package hafta_03;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		/* 
		Kullanıcıdan firstName ve lastName'i girmesini isteyin, ardından baş harflerini büyük harf yapın ve geri kalanı tamamen kucuk harf olarak konsolda yazdirin.          
		ferhat => Ferhat
		kirac => Kirac
		          */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen isminizi giriniz: ");
		String name = scan.next().toLowerCase();
		System.out.println("lutfen soyisminizi giriniz: ");
		String surName = scan.next().toLowerCase();
		
		String nameIlkHarf=name.substring(0,1).toUpperCase();
		String surNameIlkHarf=surName.substring(0,1).toUpperCase();
		System.out.println(nameIlkHarf+name.substring(1,name.length())+" "+surNameIlkHarf+surName.substring(1,surName.length()));
		scan.close();
	

	}

}
