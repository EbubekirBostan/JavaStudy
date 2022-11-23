package Day08;

public class Q09_Arrays {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */
        int array[][]={{1,3,6},{2,8},{5,7,9,14}};
        System.out.println("ciftTpl(array) = " + ciftTpl(array));
    }

    private static int ciftTpl(int[][] array) {
        int tpl=0;
        for (int a[]:array)
            for (int b:a)
                if (b%2==0)
                    tpl+=b;
        return tpl;
    }
}
