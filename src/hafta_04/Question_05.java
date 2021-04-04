package hafta_04;

public class Question_05 {

	public static void main(String[] args) {
		/* 
		String name = "Emine";
		         charAt yöntemini kullanarak konsolda tüm harfleri yazdırın.
		         */
		String name = "Emine";
		
		for (int i = 0; i <name.length(); i++) {
			char harf=name.charAt(i);
			System.out.print(harf+" ");
			
		}

	}

}
