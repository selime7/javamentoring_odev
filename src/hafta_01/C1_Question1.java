package hafta_01;

public class C1_Question1 {

	public static void main(String[] args) {
					
		/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz. 
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		*/              
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(pickName.substring(0, 1)+" "+pickName.substring(11,12)+" "+pickName.toLowerCase().substring(8,9));


	}

}
