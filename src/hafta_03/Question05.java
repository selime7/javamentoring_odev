package hafta_03;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/*
		Kullanıcıdan bir kelime girmesini isteyin.
		 Sözcükte tek sayıda karakter ve 3 veya daha fazla karakter içeriyorsa,
		  kelimenin ortasındaki karakteri yazdırın.
		*/
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz: ");
		String str=scan.next();

		if (str.length()%2==1) {
			int orta=str.length()/2;
			System.out.println(str+ " kelimesinin ortasindaki karakter: "+str.substring(orta,orta+1));
			
		} else {
			System.out.println("kelime tek sayida karaktere sahip degil");

		}
		scan.close();

	}

}
