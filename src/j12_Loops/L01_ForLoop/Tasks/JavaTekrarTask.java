package j12_Loops.L01_ForLoop.Tasks;

import java.util.Arrays;

public class JavaTekrarTask {
    public static void main(String[] args) {
        //Girilen bir string ifadeni tersini yazdırınız.
        String ifade="Team04";
        StringBuilder obj=new StringBuilder(ifade);
        System.out.println(obj.reverse());
        byte [] bytearr=ifade.getBytes();
        System.out.println(Arrays.toString(bytearr));
        for (int i = 0,j= bytearr.length-1; i <j ; i++,j--) {
            byte arr=bytearr[i];
            bytearr[i]=bytearr[j];
            bytearr[j]=arr;
        }
        System.out.println(new String(bytearr));


    }
}
