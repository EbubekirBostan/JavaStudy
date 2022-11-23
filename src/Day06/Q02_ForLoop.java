package Day06;

public class Q02_ForLoop {
    public static void main(String[] args) {
        //Convert "Java" to "J*a*v*a*"

/* ForLoop
   print even numbers from 100 to 0 but do not use decrement(i--).

        INPUT      :
        OUTPUT  : 100 98 96 94 92 ....2 0
     */
        String str="Java";
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i)+"*");
        }
        System.out.println();
        for (int k = 100; k >=0 ; k-=2) {
            System.out.print(" "+k);
        }







    }
}
