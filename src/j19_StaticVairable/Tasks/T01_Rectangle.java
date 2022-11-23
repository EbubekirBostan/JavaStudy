package j19_StaticVairable.Tasks;

public class T01_Rectangle {/*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
	double width;
    double length;

    public T01_Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public void cevreHesap(){
        System.out.println("Cevre Uzunlugu = " + ((width+length)*2) + " metredir");
    }
    public void alanHesap(){
        System.out.println("Alan = " + (width*length) + " metrekaredir");
    }
}
