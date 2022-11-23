package j03_ScannerClass_TypeCasting.scanner;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		Scanner input=new Scanner(System.in);
		System.out.println("bir tamsayı giriniz");
		double sayi1=input.nextDouble();
		System.out.println("ikinci tam sayıyı giriniz");
		double sayi2=input.nextDouble();
		System.out.println("Toplam = " +(int)(sayi1+sayi2));
		System.out.println("Çıkarma = " +(int)(sayi1-sayi2));
		System.out.println("Çıkarma2 = " +(int)(sayi2-sayi1));
		System.out.println("Çarpma = " +(int)(sayi1*sayi2));
		System.out.println("Bölme = " +(sayi1/sayi2));
		System.out.println("Bölme2 = " +(sayi2/sayi1));




	}

}
