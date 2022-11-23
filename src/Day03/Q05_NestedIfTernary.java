package Day03;

public class Q05_NestedIfTernary {
    public static void main(String[] args) {
        /*
   0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
  kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
  cikis "Gecersiz" olmalidir
  NestedIf ve Ternary kullanarak 2 yolla da cozunuz
*/
        //NEsted If ile
        int num=8;
        String result="";
        if (num>=0 && num<=9){
            if (num==9){
                result="Nine";
            } else if (num==8) {
                result="Eight";
            } else if (num==7) {
                result="Seven";
            } else if (num==6) {
                result="Six";
            } else if (num==5) {
                result="Five";
            } else if (num==4) {
                result="Four";
            } else if (num==3) {
                result="Three";
            } else if (num==2) {
                result="Two";
            } else if (num==1) {
                result="One";
            }else result="Zero";
        }else result="Invalid";
        System.out.println("result = " + result);
        // ternary ile
        int n=4;
        String result2= n==9?"nine"
                :n==8?"eight"
                :n==7?"seven"
                :n==6?"six"
                :n==5?"five"
                :n==4?"four"
                :n==3?"three"
                :n==2?"two"
                :n==1?"one"
                :n==0?"zero":"invalid";
        System.out.println("result2 = " + result2);


    }
}
