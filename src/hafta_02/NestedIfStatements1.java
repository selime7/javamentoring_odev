package hafta_02;

import java.util.Scanner;

public class NestedIfStatements1 {

	public static void main(String[] args) {
		/*
		 * “NestedIfStatements�? class olusturun.
		 * 
		 * Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
		 * 
		 * Yılı, ayi ve günü tamsayı olarak alın e NestedIf kullanarak kimin yas olarak
		 * daha buyuk oldugunu ekrana yazdirin. Examples: int birthYearOfYusuf=2000,
		 * birthMonthOfYusuf=12, birthDayOfYusuf=12, int
		 * birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21; Yusuf is
		 * Older
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen once isminizi sonrasinda gun ay yil olacak sekilde dogum tarihinizi giriniz");
		String namePerson1 = scan.nextLine();
		int birthDayOfPerson1 = scan.nextInt();
		int birthMonthOfPerson1 = scan.nextInt();
		int birthYearOfPerson1 = scan.nextInt();
		System.out.print(namePerson1 + " in dogum tarihi: " + birthDayOfPerson1 + "/" + birthMonthOfPerson1 + "/"
				+ birthYearOfPerson1);
		System.out.println();
		System.out.println("lutfen once isminizi sonrasinda gun ay yil olacak sekilde dogum tarihinizi giriniz");
		String namePerson2 = scan.nextLine();
		int birthDayOfPerson2 = scan.nextInt();
		int birthMonthOfPerson2 = scan.nextInt();
		int birthYearOfPerson2 = scan.nextInt();

		System.out.print(namePerson2 + " in dogum tarihi: " + birthDayOfPerson2 + "/" + birthMonthOfPerson2 + "/"
				+ birthYearOfPerson2);

		System.out.println();
		if ((birthDayOfPerson1 >= 1 && birthDayOfPerson1 <= 31)
				&& (birthDayOfPerson2 >= 1 && birthDayOfPerson2 <= 31)
				&& (birthMonthOfPerson1 >= 1 && birthMonthOfPerson1 <= 12)
				&& (birthMonthOfPerson2 >= 1 && birthMonthOfPerson2 <= 12)) {

		
			
		if (birthYearOfPerson1 == birthYearOfPerson2 &&
				birthMonthOfPerson1 == birthMonthOfPerson2
					&& birthDayOfPerson1 == birthDayOfPerson2) {
				System.out.println(namePerson1 + " " + namePerson2 + " ayni yastadir");

			} else if (birthYearOfPerson1 == birthYearOfPerson2 && birthMonthOfPerson1 == birthMonthOfPerson2) {
				if (birthDayOfPerson1 < birthDayOfPerson2) {
					System.out.println(namePerson1 + " buyuktur");
				} else
					System.out.println(namePerson2 + " buyuktur");

			} else if (birthYearOfPerson1 == birthYearOfPerson2) {
				if (birthMonthOfPerson1 < birthMonthOfPerson2) {
					System.out.println(namePerson1 + " buyuktur");
				} else
					System.out.println(namePerson2 + " buyuktur");

			} else if (birthYearOfPerson1 < birthYearOfPerson2) {
				System.out.println(namePerson1 + " buyuktur");

			} else
				System.out.println(namePerson2 + " buyuktur");

		
		
		
		} else {
			System.out.println("lutfen gecerli bir tarih giriniz");
		}
		scan.close();

	}
}
