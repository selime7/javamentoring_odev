package hafta_04;

import java.util.Arrays;

public class Question_03 {

	public static void main(String[] args) {
		/*
		Verilen String icerisindeki tekrar eden karakterleri yazdiran Java kodunu yaziniz. 
		String str=“ilovejavatoo” 
		Output: o v a
		         */
		String str = "ilovejavato";
		int[] sayi = new int[str.length()];
		
		for (int i = 0; i < str.length(); i++)
			sayi[str.indexOf(str.substring(i, i + 1))]++;
	
		
		
		for (int i = 0; i < str.length(); i++)
			if (sayi[i] >= 2)
				System.out.print(str.charAt(i)+" ");


	}

}
