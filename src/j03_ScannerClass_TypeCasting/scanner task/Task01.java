package j03_ScannerClass_TypeCasting.scanner;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter mid-term grade");
        int midtermgrade=input.nextInt();
        System.out.println("Enter final grade");
        int finalgrade=input.nextInt();
        System.out.println("Enter project grade");
        int projectgrade=input.nextInt();
        System.out.println("Your grade is = " + ((midtermgrade*0.3)+(finalgrade*0.5)+(projectgrade*0.2)));
    }
}
