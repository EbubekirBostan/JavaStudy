package j23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        /*
        arr ve varargs method:
         */
        int arr[]={24,42,33,19,34,45,58,38};
        //task1-> verilen array elemanları toplama print eden method create ediniz..
        System.out.println("arrTopla(arr) = " + arrTopla(arr));
        //task2->task1 varargs ile çalışınız
        System.out.println("varargsTopla(arr) = " + varargsTopla(arr));
        // ahanda TRİCK : varargs method parametreleri array gibi tanımlandığı için methoda direk array verilebilir

    }
    public static int varargsTopla(int... b){
        int topla=0;
        for (int w:b){
            topla+=w;
        }
        return topla;
    }
    public static int arrTopla(int[] a){
        int topla=0;
        for (int w:a){
            topla+=w;
        }
        return topla;
    }
}
