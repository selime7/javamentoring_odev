package hafta_04;

public class Question_02 {

	public static void main(String[] args) {
		/*
		1-20 arasindaki -20 dahil olmak üzere-  çift sayıları yazdırın. e.g.2 4 6 .. 20


		1-20 arasindaki -20 dahil olmak üzere-  tek sayıları yazdırın. e.g 1,3,5,7,...,19 Virgul dahil!


		20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin. e.g.20,15,10,5
		 
		1 - 20 arasındaki tüm çift sayıların toplamını bulun.

		11 veya 15 hariç 1-20 arasındaki tüm sayıları yazdırın; break or continue kullanin. 
		*/
		int sayi1=1;
		int sayi2=20;

		ciftSayilar(sayi1,sayi2);
		tekSayilar(sayi1,sayi2);
		beseBolunenler(sayi1,sayi2);
		ciftSayilarinTop(sayi1,sayi2);
		onBirveOnBesHaric(sayi1,sayi2);
	
	}

	public static void ciftSayilarinTop(int sayi1, int sayi2) {
		System.out.print("çift sayılar toplami :");
		int toplam=0;
		for (int i = sayi1; i <= sayi2; i++) {
			if (i%2==0) {
				toplam=toplam+i;
			
			}
			
		}
		System.out.println(toplam);
	}

	public static void onBirveOnBesHaric(int sayi1, int sayi2) {
		System.out.print("11 ve 15 hariç 1-20 arasındaki tüm sayılar : ");
		for (int i = sayi1; i <= sayi2; i++) {
			if ((i==11||i==15))   {
				continue;
				
			}
		
			System.out.print(i+" ");
			}
			System.out.println();
		}
	

	public static void beseBolunenler(int sayi1, int sayi2) {
		System.out.print("bese bolunebilen sayillar tersten : ");
		for (int i =sayi2; i >=sayi1; i--) {
			if (i%5==0) {
			
				System.out.print(i+" ");
			}
			}
		System.out.println();
	}
	

	public static void tekSayilar(int sayi1, int sayi2) {
		System.out.print("tek sayılar :");
		for (int j = sayi1; j <= sayi2; j++) {
			if (j%2!=0) {
			
				System.out.print(j+" ");
			}
		}
		System.out.println();
	}

	public static void ciftSayilar(int sayi1, int sayi2) {
		System.out.print("çift sayılar :");
		for (int i = sayi1; i <= sayi2; i++) {
			if (i%2==0) {
		
				System.out.print(i+" ");
				
				
			}
			
		}
		System.out.println();
	}


}
