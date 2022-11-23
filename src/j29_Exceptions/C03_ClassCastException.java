package j29_Exceptions;

public class C03_ClassCastException {
    public static void main(String[] args) {
        //ClassCastException ->Birbirine dönüştürülmeyen data type'lar birbirine dönüştürüldüğünde oluşan Tunte Exception dur

        Object obj="javaCanlara selam olsun";
        String str=(String) obj;//objeckt data type String data type casting yapılarak atandı
        System.out.println("str = " + str);//str = javaCanlara selam olsun
        Object sayi1=10;
       // String str2=(String) sayi1;//object data type String data type casting yapılarak atandı
        //System.out.println("str2 = " + str2);//ClassCastException

        try {
            String str2=(String) sayi1;
        }catch (ClassCastException e){
            System.out.println("agam integer object hiç stringe çevrilir mi ");
        }
        try {
            String str3=(String) obj;
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz");
        }catch(ClassCastException e){

        }
        System.out.println("sorun handle edildi");

    }
}
