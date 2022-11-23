package j32_Abstract.Ornek3;

public class Runner {
    public static void main(String[] args) {
        Baklava b=new Baklava();
        b.madeIn();//agam baklava gaziantepte yenir
        b.taste();//good sugar sweet
        System.out.println("b = " + b);
        SezarSalad ss=new SezarSalad();
        ss.taste();//Agam salatan gavurdağı çoban söğüş mü verelim :)
        ss.madeIn();//Agam sezar yemiş biz bakmışız çok da şeyy etme
    }
}
