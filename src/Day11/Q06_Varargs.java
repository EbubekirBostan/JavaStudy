package Day11;

public class Q06_Varargs {
    public static void main(String[] args) {
        // Create a multiply method with double varargs (return double)
        System.out.println("carpim(2,3,4,5) = " + carpim(2, 3, 4, 5));
    }

    private static double carpim(double... a) {
        double carp=1;
        for (double x:a){
            carp*=x;
        }
        return carp;
    }

}
