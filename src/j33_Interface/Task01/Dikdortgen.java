package j33_Interface.Task01;

public class Dikdortgen implements Sekil{
    @Override
    public int cevresi(int... boyut) {
        if (boyut.length==1){
            return boyut[0]*4;
        }else
            return  (boyut[0]+boyut[1])*2;
    }

    @Override
    public int alani(int... boyut) {
        if (boyut.length==1){
            return boyut[0]*boyut[0];
        }else
            return  (boyut[0]*boyut[1]);
    }
}
