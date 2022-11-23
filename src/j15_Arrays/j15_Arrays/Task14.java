package j15_Arrays.j15_Arrays;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        System.out.println(toplamKrktr(str));
    }

    private static int toplamKrktr(String str) {
        int tpl=0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))) {
                tpl+=Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return tpl;
    }


}

