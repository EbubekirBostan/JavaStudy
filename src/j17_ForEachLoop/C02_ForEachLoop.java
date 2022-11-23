package j17_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // task array elemanlarının çarpımını print eden code create ediniz
        int arr[][]={{2,3},{4},{5,6,7}};
        int carp=1;
        for (int a[]: arr){
            for (int b: a){
                carp*=b;
            }
        }
        System.out.println("carp = " + carp);





    }
}
