package j16_ArrayList.Task;

import java.util.ArrayList;
import java.util.Collections;

public class Task05 {
    public static void main(String[] args) {
        /*TASK :
2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
 */
        String isimArr[][]={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
        ArrayList<String> listIsim=new ArrayList<>();
        arraydenListte(isimArr,listIsim);


    }

    private static ArrayList<String> arraydenListte(String[][] isimArr, ArrayList<String> listIsim) {
        for (int i = 0; i < isimArr.length ; i++) {
            for (int j = 0; j <isimArr[i].length ; j++) {
                listIsim.add(isimArr[i][j]);
            }
        }
        System.out.println("listIsim = " + listIsim);
        Collections.sort(listIsim);
        System.out.println("listIsim = " + listIsim);

        return listIsim;
    }
}
