package j23_Varargs_StringBuilder.StringBuilder;

public class Task01 {
    public static void main(String[] args) {
        /*
Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
       olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
    (without case sensitivity)
    Eg : input : I love Java
    Output: "Reversed sentence : avaJ evol I
       It is not a palindrome"
 */
        StringBuilder cumle=new StringBuilder(" Bir Cümle");
        polindrome1(cumle);
        polindrome2(new StringBuilder("ebubekir"));
        System.out.println("ispPo(\"ey edip adanada pide ye\") = " + ispPo("ey edip adanada pide ye"));
    }

    private static void polindrome2(StringBuilder cumle) {
        System.out.println("cumle.reverse() = " + cumle.reverse());
    }
    public static boolean ispPo(String a){
        boolean flag=true;
        if (a==null){
            return false;
        }
        return new StringBuilder(a).reverse().toString().equals(a);
    }

    public static void polindrome1(StringBuilder cumle) {
        StringBuilder ters=new StringBuilder();
        for (int i = cumle.length()-1; i <=0 ; i--) {
           ters.append(cumle.charAt(i));
        }
        if (ters==cumle){
            System.out.println("polindromdur");
        }else System.out.println("polindrom değildir");

    }


}
