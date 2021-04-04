package hafta_03;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise “name1 cift sayili olmadigi icin ortasina yerlestiremedik” yazdirin.
		          e.g:
		          name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
	Scanner scan =new Scanner(System.in);
	System.out.println("Lutfen birinci ismi giriniz: ");
	String name1=scan.next();
	System.out.println("Lutfen ikinci ismi giriniz: ");
	String name2=scan.next();
	if (name1.length()%2==0) {
		int orta= name1.length()/2;
		System.out.println(name1.substring(0, orta)+name2+name1.substring(orta,name1.length()));
		
	} else {
		System.out.println(name1+" cift sayili olmadigi icin ortasina yerlestiremedik");

	}

	scan.close();

	}

}
