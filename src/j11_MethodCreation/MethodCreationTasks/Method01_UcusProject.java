package j11_MethodCreation.MethodCreationTasks;

public class Method01_UcusProject {
    // İNDİRİMLER
    public static double indirimYas(int x){
        double indirim=1;
        if (x>65){
            indirim=0.7;
        } else if (x<24 && x>=12) {
            indirim=0.9;
        } else if (x<12) {
            indirim=0.5;
        }else indirim=1;
        return indirim;
    }
    public static double indirimGD(double x) {
        double indirGD=1;
        if(x==2){
            indirGD=0.8;
        } else  {
            indirGD=1;
        }

        return indirGD;
    }
    // Rotalar
    public static double ucusBFiyat(double a, double b) {
        if (b==1){
            return a*b*500*0.10;
        }else {
            return a*b*2*500*0.10 ;
        }


    }
    public static double ucusCFiyat(double a, double b) {
        if (b==1){
            return a*b*700*0.10;
        }else
            return a*b*2*700*0.10 ;
    }
    public static double ucusDFiyat(double a, double b) {
        if (b==1){
            return a*b*900*0.10;
        }else
            return a*b*2*900*0.10 ;
    }
    //Bilet Fiyatı








}
