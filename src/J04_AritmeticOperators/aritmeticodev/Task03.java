package J04_AritmeticOperators.aritmeticodev;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("3 basamaklı bir sayı giriniz");
		int sayi1=sc.nextInt();
		System.out.println("İlk ve Son rakamların toplamı = " + ((sayi1/100)+(sayi1%10)));

		
	}

}
