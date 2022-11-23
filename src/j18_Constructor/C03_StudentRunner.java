package j18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {
        C03_Student ogrc1=new C03_Student();
        ogrc1.ad="fatih";
        ogrc1.soyAd="ataş";
        ogrc1.sinif=1;
        ogrc1.okulNo=1001;
        ogrc1.ortlama=77;
        ogrc1.takdir=false;
        System.out.println("ogrc1 = " + ogrc1);//ogrc1 = j18_Constructor.C03_Student@5f2050f6
        //ogrc1 = C03_Student{ad='fatih', soyAd='ataş', sinif=1, ortlama=77.0, okulNo=1001, takdir=false}
        //ogrc1 = {ad='fatih', soyAd='ataş', sinif=1, ortlama=77.0, okulNo=1001} takdiri sildik
        ogrc1.mezuniyet();//agam diploman hayırlı olsun
        //task diğer bir öğrenci objesiyle tüm fieldları atayıp print ediniz
        C03_Student ogrc2=new C03_Student();
        ogrc2.ad="ronaldo";
        ogrc2.soyAd="messi";
        ogrc2.sinif=33;
        ogrc2.okulNo=2016;
        ogrc2.ortlama=99;
        ogrc2.takdir=true;
        System.out.println("ogrc2 = " + ogrc2);
        ogrc2.mezuniyet();


    }
}
