package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Merve";
		String ogrenci2="İsmail";
		String ogrenci3="Ömer";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("--------------------------------------------");
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Caner";
		ogrenciler[1] = "Yağız";
		ogrenciler[2] = "Zeynep";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);		
		}
		System.out.println("--------------------------------------------");
        for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
