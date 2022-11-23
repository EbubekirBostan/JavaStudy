package j15_Arrays.odev;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */
        String dolars="$12 $23 $10 $2 $5 $2";
        dolars=dolars.replace("$","");
        String dolArrs[]=dolars.split(" ");
        int sum=0;
        for (int i = 0; i <dolArrs.length ; i++) {
            sum+=Integer.parseInt(dolArrs[i]);
        }
        System.out.println("sum = " + sum);


    }
}