package j15_Arrays.odev;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */
        int number[]={25,30,30,35,100};
        int tpl=0;
        for (int i = 0; i < number.length ; i++) {
            tpl+=number[i];
        }
        System.out.println("tpl = " + tpl);//220




    }
}