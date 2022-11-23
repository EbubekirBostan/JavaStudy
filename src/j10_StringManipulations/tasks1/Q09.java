package j10_StringManipulations.tasks1;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime Yaziniz");
        String kelime=scan.nextLine();
        if (!(kelime.contains(" "))){
            String yarim=kelime.substring(0,kelime.length()/2);
            System.out.println("yarim = " + yarim);
        }else System.out.println("Boşluksuz bir kelime girin");



    }
}
