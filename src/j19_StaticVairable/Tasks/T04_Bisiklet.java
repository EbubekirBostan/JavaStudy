package j19_StaticVairable.Tasks;

public class T04_Bisiklet {
     /*
    Task 04->
     Bisiklet Class :Properties(fields) : hiz, vites
     method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */

    int hiz;
    int vites;

    public T04_Bisiklet(int hiz, int vites) {
        this.hiz = hiz;
        this.vites = vites;
    }
    public int vitesArttir( int vites){
            vites++;
            return vites;
    }
    public int vitesAzalt( int vites){
        vites--;
        return vites;
    }
    public int hizDegistir( int hiz){
      if (vites==1){
          hiz=10;
      } else if (vites==2) {
          hiz=20;
      } else if (vites==3) {
          hiz=30;
      }
        return vites;
    }


}

