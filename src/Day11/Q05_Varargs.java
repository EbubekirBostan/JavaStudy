package Day11;

public class Q05_Varargs {
    public static void main(String[] args) {
        // istediğimiz kadar sayı girdiğimizde toplamları veren bir method yazalım

        System.out.println("toplam(1,3,5,6) = " + toplam(1, 3, 5, 6));


    }
    public static int toplam(int... a){
        int tpl=0;
        for (int x:a){
            tpl+=x;
        }
        return tpl;
    }
}
