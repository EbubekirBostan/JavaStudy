package j15_Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {
        // task arr elemanlarını toplayan code create ediniz
        int apt[][] = {
                {1, 2, 3}, //0. kat
                {10, 20}, //1. kat
                {101}//2. kat
        };//3 katlı apt
        int tpl=0;
        for (int kat = 0; kat < apt.length ; kat++) {
            for (int daire = 0; daire < apt[kat].length ; daire++) {
                tpl+=apt[kat][daire];
            }
        }
        System.out.println(tpl);
        System.out.println("*** Diğer yol***");
        for (int [] kat:apt) {
            for (int daire:kat){
                tpl+=daire;
            }
        }
        System.out.println(tpl);

    }
}
