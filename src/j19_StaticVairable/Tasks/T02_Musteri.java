package j19_StaticVairable.Tasks;

public class T02_Musteri {
   /* Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz
    */
    String name;
    T02_ElektrikHesap t02_elektrikHesap;

    public T02_Musteri(String name, T02_ElektrikHesap t02_elektrikHesap) {
        this.name = name;
        this.t02_elektrikHesap = t02_elektrikHesap;
    }

}
