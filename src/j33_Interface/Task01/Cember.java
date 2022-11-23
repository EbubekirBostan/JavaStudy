package j33_Interface.Task01;

public class Cember implements Sekil{
    @Override
    public int cevresi(int... boyut) {
        return (int) (2*PI*boyut[0]);
    }

    @Override
    public int alani(int... boyut) {
        return (int) (PI*boyut[0]*boyut[0]);
    }
}
