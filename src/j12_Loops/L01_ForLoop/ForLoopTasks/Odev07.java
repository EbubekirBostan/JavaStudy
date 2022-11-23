package j12_Loops.L01_ForLoop.ForLoopTasks;

public class Odev07 {

    public static void main(String[] args) {



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15
        for (int i = 1; i <=5 ; i++) {
            int a=i;
            for (int j = 0; j <5 ; j++) {
                if (j<i){
                    System.out.print(" "+a);
                    a+=4-j;
                }
            }
            System.out.println();

        }






    }
}
