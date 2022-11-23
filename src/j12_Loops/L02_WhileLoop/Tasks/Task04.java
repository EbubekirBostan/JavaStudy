package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("3 basamaklı bir sayı giriniz: ");
		int sayi=sc.nextInt();
		int sayiadet=0;
		while (sayi>99&&sayi<1000){
			if (sayi%4==0 && sayi%6==0){
				System.out.print(" "+sayi);
				sayiadet++;
			}
			sayi++;
		}
		System.out.println();
		System.out.println("Sayi adeti = " + sayiadet);

		
		

		
		
			
	}

}
