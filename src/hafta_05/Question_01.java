package hafta_05;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {
		 
		/*
				// Stringi ters çevirmek için bir Java Programı yazın
		//1.Yol: StringBuilder () kullanarak
		
		*/
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz : ");
		StringBuilder str= new StringBuilder(scan.nextLine());
		str.reverse();
		System.out.println("String'in tersi: "+str);

	}

}
