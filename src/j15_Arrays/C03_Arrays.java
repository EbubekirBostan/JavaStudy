package j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        // String'i array'a çevirme...split()-> girilen parametre değere göre String ifade parçalanır
        String str="javaCAN'lara selam olsun. enkısa zamanda bolcana offer sonrası TUZLABALIK :)";
        str=str.replace("\\W","");
        String strArr[]=str.split(" ");//str her " " karaktere göre parçalanır. her bir parça
                                            // strArr nin bir elemanı olaqrak atanır.
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);
        String harfArr[]=str.split("");
        System.out.println(Arrays.toString(harfArr));
        System.out.println(harfArr.length);//76


    }
}
