package hafta_05;

import java.util.Scanner;

public class Question_01c {

	public static void main(String[] args) {
		/*
		// Stringi ters çevirmek için bir Java Programı yazın
		 * //3.Yol: Bir method oluşturun, ardından methodu main method dan çağırın
		*/
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz : ");
		String str1=scan.next();
		ters(str1);
		
	}

	public static void ters(String str1) {
	String	tersi="";
		for (int i =  str1.length()-1; i >=0; i--) {
			tersi+=str1.charAt(i);
			
		}
		
		System.out.print("Girdiginiz "+str1+" "+"ifadesinin tersi : "+tersi);
		
	}

}
