package j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("İsim Soyisim Giriniz: ");
		String name=sc.nextLine();
		String nName=name.replaceAll(" ","");
		int ilkK=0;
		while (ilkK<=nName.length()-1){
			System.out.print(" "+nName.substring(ilkK,ilkK+1));
			ilkK++;
		}

		
			

	}

}
