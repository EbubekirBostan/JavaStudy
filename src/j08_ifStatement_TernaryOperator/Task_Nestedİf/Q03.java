package j08_ifStatement_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
            Scanner sc=new Scanner(System.in);
            System.out.print("Boyunuzu 'cm' Olarak Giriniz : ");
            double m=sc.nextDouble();
            m=(m/100);
            System.out.print("Kilonuzu Giriniz : ");
            double kg=sc.nextDouble();
            double bmi=(kg/(m*m));
            System.out.println("bmi = " + bmi);
            System.out.println(bmi > 30 ? "Obez grubundasiniz." : (bmi <= 30 && bmi>25) ? "Sisman kategorisindesiniz" : (bmi <= 25 && bmi > 20) ? " Normal sinirlardasiniz " : "oldukca zayifsiniz");












      /*  if (bmi<=20){
                System.out.println(" Oldukça Zayıfsınız ");
        } else if (bmi<=25) {
                System.out.println(" Normal Sınırlardasınız ");
        } else if (bmi<=30) {
           System.out.println(" Şişman Kategorisindesiniz ");
       }else System.out.println(" Obez Grubundasınız");

       */


    }

}
