package hafta_02;

import java.util.Scanner;

public class NestedIfStatements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen ismilerizi giriniz");
		String namePerson1 = scan.nextLine();
		System.out.println("1.name: " + namePerson1);

		String namePerson2 = scan.nextLine();
		System.out.println("2.name: " + namePerson2);

		System.out.println("lutfen gun ay yil olacak sekilde dogum tarihinizi giriniz");
		int birthDayOfPerson1 = scan.nextInt();
		int birthMonthOfPerson1 = scan.nextInt();
		int birthYearOfPerson1 = scan.nextInt();
		System.out.print(namePerson1 + " in dogum tarihi: " + birthDayOfPerson1 + "/" + birthMonthOfPerson1 + "/"
				+ birthYearOfPerson1);
		System.out.println();

		int birthDayOfPerson2 = scan.nextInt();
		int birthMonthOfPerson2 = scan.nextInt();
		int birthYearOfPerson2 = scan.nextInt();

		System.out.print(namePerson2 + " in dogum tarihi: " + birthDayOfPerson2 + "/" + birthMonthOfPerson2 + "/"
				+ birthYearOfPerson2);

		System.out.println();
		if ((birthDayOfPerson1 >= 1 && birthDayOfPerson1 <= 31) && (birthDayOfPerson2 >= 1 && birthDayOfPerson2 <= 31)
				&& (birthMonthOfPerson1 >= 1 && birthMonthOfPerson1 <= 12)
				&& (birthMonthOfPerson2 >= 1 && birthMonthOfPerson2 <= 12)) {
			if (birthYearOfPerson1 == birthYearOfPerson2) {
				if (birthMonthOfPerson1 == birthMonthOfPerson2) {
					if (birthDayOfPerson1 == birthDayOfPerson2) {
						System.out.println(namePerson1 + " ve " + namePerson2 + " ayni yastadir");

					} else if (birthDayOfPerson1 < birthDayOfPerson2) {
						System.out.println(namePerson1 + " buyuktur");

					} else
						System.out.println(namePerson2 + " buyuktur");

				} else if (birthMonthOfPerson1 < birthMonthOfPerson2) {
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
