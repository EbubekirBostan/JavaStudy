package Day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_ArrayList {
     /*
		A list has elements “H”, “G” and “E”
		Ask user to enter a letter
		If the letter exists in list convert it to "Got it"
		otherwise add it to the list.
		Example : [H, G, E]
                  Enter a letter :  h
                  [Got It, G, E]
                  Enter a letter :  a
                  [H, G, E, A]
        */
     public static void main(String[] args) {
         List<String> letter=new ArrayList<>();
         letter.add("H");
         letter.add("G");
         letter.add("E");
         System.out.println("letter = " + letter);
         Scanner sc=new Scanner(System.in);
         System.out.print("Bir Harf Giriniz = ");
         String harf=sc.next().trim().toUpperCase().substring(0,1);
         if (letter.contains(harf)){
             letter.set(letter.indexOf(harf),"Got it");
         }else letter.add(harf);
         System.out.println("letter = " + letter);


     }






}
