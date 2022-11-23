package j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class Task06 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */

		System.out.println("Bir Kenar Uzunluğu Seçiniz");
		int kenarA=scan.nextInt();
		System.out.println("Ikinci Bir Kenar Uzunluğu Seçiniz");
		int kenarB=scan.nextInt();
		System.out.println("ParalelKenar, Dikdörtgen, Ücgen Seçiniz");
		String secim= String.valueOf(scan.next().toUpperCase().charAt(0));

		switch (secim){
			case "P":
				System.out.println("Yüksekliği Giriniz");
				int h=scan.nextInt();
				System.out.println("Paralelkenar Alanı: "+ palan(kenarA,h));
				System.out.println("Paralelkenar Çevresi: "+pcevre(kenarA, kenarB));
				break;
			case "D":
				System.out.println("Dikdörtgen Alanı: "+dikdortgenal(kenarA, kenarB));
				System.out.println("Dikdortcevresi = " + dikdortcevre(kenarA, kenarB));
				break;
			case"Ü":
				System.out.println("Yüksekliği Giriniz");
				int yuk=scan.nextInt();
				System.out.println("Taban uzunluğunu Giriniz");
				int kenarC=scan.nextInt();
				System.out.println("Ücgenin alani = " + ucgalan(kenarC, yuk));
				System.out.println("Ücgenin cevresi = " + ucgcevre(kenarA, kenarB, kenarC));
				break;
			default:
				System.out.println("Yanlış karakter Girdiniz");
				break;
		}
	}

	private static int ucgcevre(int kenarA, int kenarB, int kenarC) {
		return kenarA+kenarB+kenarC;
	}

	private static int ucgalan(int kenarA, int yuk) {
		return (kenarA*yuk)/2;
	}

	private static int dikdortcevre(int kenarA, int kenarB) {
		return (2*kenarA)+(2*kenarB);
	}

	private static int dikdortgenal(int kenarA, int kenarB) {
		return kenarA*kenarB;
	}

	private static int pcevre(int kenarA, int kenarB) {
		return (2*kenarA)+(2*kenarB);
	}

	private static int palan(int kenarA, int h) {
		return (kenarA*h)/2;
	}

}
