package clarusWay_InterviewQuestionsJava.src.day4;

import java.util.ArrayList;

public class C02 {
    public static void main(String[] args) {
        /*
        Q02_CreateRandomList_SetList
// int array list oluşturun 10 elemandan oluşmalı
// random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemanının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.
         */
        ArrayList<Integer> arrlist=new ArrayList<>();
        randomEkle(arrlist);


    }

    private static void randomEkle(ArrayList<Integer> arrlist) {
        for (int i = 0; i < 10 ; i++) {
            arrlist.add((int) (Math.random()*20));
        }
        System.out.println("arrlist = " + arrlist);
        int count=0;
        for (int i = 0; i <arrlist.size() ; i++) {
            if (arrlist.get(i)%2==0){
                count++;
                arrlist.set(i,111);
            }
        }
        if (count==0){
            System.out.println("Çift sayı yoktur");
        }

        System.out.println("arrlist = " + arrlist);
    }
}
