package hafta_05;

import java.util.Scanner;

public class Question_01b {

	public static void main(String[] args) {
		/*
		// Stringi ters çevirmek için bir Java Programı yazın
		 * //2.Yol: String Classini kullanarak
		 */

		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz : ");
		String str1=scan.next();
		String tersi="";
		
		for (int i =  str1.length()-1; i >=0; i--) {
			tersi+=str1.charAt(i);
			
		}
		
		System.out.print("Girdiginiz "+str1+" "+"ifadesinin tersi : "+tersi);
		
		
		
		
	}

}
