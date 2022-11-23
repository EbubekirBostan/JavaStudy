package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("oldugunuz ayı sayı olarak yazınız");
		int key=scan.nextInt();
		switch (key){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Girilen ay 31 gün içerir");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Girilen ay 30 gün içerir");
				break;
			case 2:
				System.out.println("yilinizi giriniz");
				int yil= scan.nextInt();
				System.out.println(yil%100==0 ? (yil%400==0 ? "Girilen ay 29 gün içerir" : "Girilen ay 28 gün içerir") : (yil%4==0 ? "Girilen ay 29 gün içerir" : "Girilen ay 28 gün içerir"));
				break;
			default:
				System.out.println("Hatali Giris Yaptiniz");
		}

	}

}
