package j23_Varargs_StringBuilder.Varargs;

public class Task01 {
    public static void main(String[] args) {
        /*
        Task ->
        verilen Stringleri birlestiren concat isimli METHOD create ediniz.
        input : "m", "e", "r", "v", "e";
        output : merve
         */
        String [] arr1={"m","e","r","v","e"};
        String [] arr2={"b","e","k","i","r"};
        concat(arr1);
        concat(arr2);

    }

    public static void concat(String... a){
        String bilesik="";
        for (String x:a){
            bilesik+=x;
        }
        System.out.println("bilesik = " + bilesik);
    }
}
