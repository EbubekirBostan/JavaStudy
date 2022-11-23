package j15_Arrays;

public class Task16 {
    public static void main(String[] args) {
        // task-> sayi arr'deki son elemanların çarpımını print eden code create ediniz
        int sayi[][]={{1,2,3},{9,8},{24,0,4}};
        int carp=1;
        /*
        for (int i = 0; i < sayi.length ; i++) {
            for (int j = sayi[i].length-1; j <=sayi[i].length-1 ; j++) {
                carp*=sayi[i][j];
            }
        }
        System.out.println(carp);*/
        for (int kat = 0; kat <sayi.length ; kat++) {
            carp*=sayi[kat][sayi[kat].length-1];
        }
        System.out.println("carp = " + carp);



    }
}
