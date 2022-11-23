package j12_Loops.L01_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //Task 41 kere maşallah prin ediniz
        for (int x=1; x<=41; x++){
            System.out.println(x+". Maşallah");
        }
        //Task>>>> iki basamaklı tek sayıları print eden code create ediniz
        for (int x=11; x<100; x+=2) {
            System.out.print(x+ " ");
        }
        System.out.println("******");
        for (int i=10; i<100 ; i++){
            if (i%2==1){
                System.out.print(i+" ");
            }
        }
            for (int i=0; i>10 ; i++){// ilk degeri sağlamayan ->false olan body run olmaz
                                        // kod kırılarak sıradaki satırdan devam eder
                System.out.println("selam");//çalışmaz
            }
            for (int i =0; i>=0 ; i++){// bu for durmaz sonsuz loop olur
                System.out.println(i);
            }







    }
}
