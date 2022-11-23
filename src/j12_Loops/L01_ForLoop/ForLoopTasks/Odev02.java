package j12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir String Giriniz : ");
		String str=sc.nextLine();
		rakamKrktToplami(str);
		//String str=sc.nextLine().replaceAll("\\D","");
		//System.out.println(str.length());
	}

	private static void rakamKrktToplami(String str) {
		int rakamtop=0;
		for (int i = 0; i <str.length() ; i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				rakamtop++;
			}
		}
		System.out.println(rakamtop+ " Tanecik Rakam Var");
	}
}
