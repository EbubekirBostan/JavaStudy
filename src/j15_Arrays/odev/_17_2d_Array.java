package j15_Arrays.odev;

import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */
        int sayilArr[][]={{2,3,2},{4,1,5},{7,2,5}};
        for (int i = 0; i < sayilArr.length ; i++) {
            for (int j = 0; j < sayilArr[i].length ; j++) {
                if (sayilArr[i][j]==2){
                    sayilArr[i][j]=6;
                }
            }
        }
        System.out.println(Arrays.deepToString(sayilArr));//[[6, 3, 6], [4, 1, 6], [6, 6, 5]]



    }
}