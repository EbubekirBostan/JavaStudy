package j15_Arrays;

public class Task15 {
    public static void main(String[] args) {
        // task->arr tüm elemanlarının çarpımını yazınız
        int sayi[][]={{1,2,3},{9,8}};
        int carp=1;
        /*
        for (int i = 0; i < sayi.length ; i++) {
            for (int j = 0; j <sayi[i].length ; j++) {
                carp*=sayi[i][j];
            }
        }
        System.out.println(carp);
         */
        for (int[]kat:sayi){
            for (int daire:kat){
                carp*=daire;
            }
        }
        System.out.println(carp);
    }
}
