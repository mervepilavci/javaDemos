package loopDemo;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("-------------");

        for (int i = 0; i < 10; i += 2) {
            System.out.println("i = " + i);

        }
        System.out.println("-------------");
        // While Döngüsü
        int i = 1;
        while (i < 10){
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("-------------");

        // Do While Döngüsü
        int j = 1;
        do {
            System.out.println("j = " + j);
            j+=2;
        }while (j < 10);
	}

}
