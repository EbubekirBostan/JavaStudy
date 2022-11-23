package Day09;

public class Q04_Arrays {
    public static void main(String[] args) {
        /*
Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
String s= Apex,nesne yonelimli bir programlama dilidir"       */
        String s= "Apex,nesne yonelimli bir programlama dilidir";
        String sArr[]=s.split("");
        String sesliHarfler[]={"a","e","i","o","u"};
        int count=0;
        for (int i = 0; i <sArr.length ; i++) {
            for (int j = 0; j <sesliHarfler.length ; j++) {
                if (sArr[i].equalsIgnoreCase(sesliHarfler[j])){
                    count++;
                }
            }
        }
        System.out.println("tpl = " + count);
    }
}
