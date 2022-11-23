package j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {
        /*
         * concat() methodu içine (parametre ) aldığı string variable'ı çalıştığı stringin sonuna ekler
         * java'da + işlemi yapılırken eğer en az bir string variable varsa java toplama değil concat yapar.
         */
        String name=" Nur ";
        String meslek=" Qa tester ";
        System.out.println(name.concat(meslek));
        // TRİCK>>> String methodları variable geçici değişiklik yapar.
        // ama değişken atama yapılırsa kalici değişir
        name=meslek.concat(name);
        System.out.println("name = " + name);

        System.out.println(name.concat(true + " :) "));


    }
}
