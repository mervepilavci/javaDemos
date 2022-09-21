package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel.";
		
		System.out.println(message);
		System.out.println("Eleman sayısı : "+message.length());
		System.out.println("5.eleman : "+message.charAt(4));		
		System.out.println(message.concat(" Yaşasın!"));		
		System.out.println(message.startsWith("B"));		
		System.out.println(message.endsWith("."));
		
		char[] karakterler = new char[5];
        message.getChars(0, 5, karakterler, 0);//5'e kadar olanı alır, 5.karakteri almaz.
	    System.out.println(karakterler);	    
	    System.out.println(message.indexOf('a'));	    
	    System.out.println(message.lastIndexOf('ç'));	     
		System.out.println(message.replace(' ','-'));		
		System.out.println(message.substring(2));		
		System.out.println(message.substring(2,4));
		//burada da 2ve4 arasını al dedik.		
	    for (String kelime : message.split(" ")) {
			System.out.println(kelime);
			}
	    System.out.println(message.toLowerCase());	    
	    System.out.println(message.toUpperCase());	    
	    System.out.println(message.trim());
	    	    
	  //0'dan başladığı için 5.elemanı bulurken 4 yazdık.Boşluk da bir karakterdir o da sayılır.
	  //.charAt metodu dizinin parantez içinde istenen karakterini bulur.
	  //.concat metodu ile iki metin birleştirilir.
	  //.starsWith metodu ile String ifadelerin belirli bir ifade ile başlayıp başlamadığını öğreniriz. başlamıyor ise false verir.
	  //.endsWith metodu ile String ifadelerin belirli bir ifade ile bitip bitmediğini öğrenebiliriz. 
	  //.getChars metodu ile String ifadelerin belirli bir aralığını başka bir karakter dizisine kopyalayabiliriz.
	  //.indexOf() metodu ile String ifadelerin belirli bir ifadenin ilk indeksini öğrenebiliriz.
	  //.lastIndexOf() metodu ile String ifadelerin belirli bir ifadenin son indeksini öğrenebiliriz.
	  //.replace() metodu ile String ifadelerdeki belirli bir ifadeyi başka bir ifade ile değiştirebiliriz.Örnekte boşluk ifadesini - ile değiştirdik.
	  //.substring() metodu ile String ifadelerin belirlenen indeksinden sonrasını alır. Örnekte 2 yazarak 2.ifadeden sonrasının yazılmasını sağladık
	  //.split metodu ile belirli bir ifadeye parçalarız.Biz burada boşluğa göre ayırdık.
	  //.toLowerCase metodu tüm karakterleri küçük harfe çevirir.
	  //.toUpperCase metodu tüm karakterleri büyük harfe çevirir.  
      //.trim metodu baş ve sondaki boşlukları götürür.

	}

}
