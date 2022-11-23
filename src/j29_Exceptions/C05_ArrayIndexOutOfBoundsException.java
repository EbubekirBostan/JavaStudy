package j29_Exceptions;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException-> arraylarda olmayan bir index elemanı ile işlem yapıldığında oluşan unchecked
        //Runte exceptiondur
        int arr[]={24,27,38,41,54};
        System.out.println("arr[0] = " + arr[0]);
        // System.out.println("arr[7] = " + arr[7]);
        try {
            System.out.println("arr[7] = " + arr[7]);
            System.out.println("try block çalıştı bizde hata olmaz artist :)");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("agam hata aldın ben yaptım işin iş");
        }
        try {
            System.out.println("arr[3] = " + arr[3]);
            System.out.println("canım canım komut sorunsuz :)");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("agam hata aldın ben yaptım işin iş");
        }
        System.out.println("agam handle ettim her zaman olmaz");
    }
}
