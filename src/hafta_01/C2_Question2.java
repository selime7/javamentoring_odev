package hafta_01;

import java.util.Scanner;

public class C2_Question2 {

	public static void main(String[] args) {
		/*
		Kullaniciya gunde kac cay ictigini ve cayi kac sekerli ictigini sorun. Daha sonra kullanicinin yilda kac kg seker kullandigini hesaplayan java kodunu yaziniz.
		1 seker= 1.7 gr
		Ornek: Input ⇒      
		Cay : 10
		Seker :2
		Output : 12.41 kg/yil
		*/  

		Scanner scan =new Scanner  (System.in);
		System.out.println("lutfen bir gunde kac adet cay ictiginizi yaziniz:");
		double caySayisi=scan.nextDouble();
		System.out.println("lutfen bir bardak caya kac adet seker attiginizi yaziniz:");
		double sekerSayisi=scan.nextDouble();
		double toplam= caySayisi*(sekerSayisi*0.0017)*365;
		System.out.println("bir yilda cay icerken tukettiginiz seker miktari "+toplam+" kg dir.");
		scan.close();

	}

}
