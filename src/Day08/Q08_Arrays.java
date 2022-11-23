package Day08;

public class Q08_Arrays {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        String array[][]={{"$12","$22" ,"0$"},{"£9","£40","$1"},{"£12","$2","$0"}};
        double tplDlr=0;
        double tplEur=0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (array[i][j].contains("$")){
                    tplDlr+=(Integer.parseInt(array[i][j].replace("$",""))*3.2);
                }else tplEur+=(Integer.parseInt(array[i][j].replace("£",""))*4.2);
            }
        }
        System.out.println("toplam = " + (tplEur+tplDlr));//toplam = 374.6000000000001

    }
}
