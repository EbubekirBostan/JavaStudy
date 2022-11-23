package j12_Loops.L01_ForLoop.Tasks;

public class Task13 {
    public static void main(String[] args) {
        /*
A
B B
C C C
D D D D
E E E E E
F F F F F F
şekli yazdırınız
*/
        int harf=65;
        for (int i = 0; i <10 ; i+=2) {//apt döngü
            for (int j = 0; j <=i ; j++) {//daire döngü
                System.out.print((char)(harf+j)+" ");
            }
            System.out.println();
        }



    }
}
