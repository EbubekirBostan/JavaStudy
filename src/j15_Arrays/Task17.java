package j15_Arrays;

public class Task17 {
    public static void main(String[] args) {
        // task->sayi arrindeki en büyük elemanı print eden code yazınız
        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        int maxEleman=sayi[0][0];
        for (int i = 0; i < sayi.length ; i++) {
            for (int j = 0; j <sayi[i].length ; j++) {
                if (sayi[i][j]>maxEleman){
                    maxEleman=sayi[i][j];
                }
            }
        }
        System.out.println("en büyük sayı "+maxEleman);
        System.out.println("*** İKİNCİ YOL***");
        for (int[] satir:sayi){
            for (int value:satir){
                if (value>maxEleman)maxEleman=value;
            }
        }
        System.out.println(maxEleman);







    }
}
