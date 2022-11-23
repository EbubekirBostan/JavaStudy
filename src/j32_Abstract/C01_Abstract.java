package j32_Abstract;

public class C01_Abstract {
    /*
    1-Bazı durmlarda child class lar parent classda'ki methodların genellikle bodylerini değiştirerek override ederler
    Bu gibi durumlarda parent classda ki method a body tanımlamak ram ve memory açısından gereksizdir.
    Çözüm olarak java parent class a bodysiz -> abstract(soyut) methodalar tanımlamıştır
    2-Parent class da ki abstract methodlar app güvenliği açısından child class'da override edilmek zorundadır.
    eğer parent class'daki child classın mutlaka kullanması gereken method varsa abstract tanımlanmalı
    motor() her araçta olmalı.
    3-Abstract method tanımlamak için
    a){} body olmaz
    b) access modifierden sonrası için abstract keyword kullanılmalı
    c) abs method içinde abstract keyword ve body bir arada kullanılamaz CTE verir
    abstract class tanımlamak için class ifadesinden önce abstract keyword kullanılmalı
    4-Abs methodlar sadece abs Class'ta tanımlanır kesinlikle concrete class da abs method tanımlanamaz.
    ama abs class'da concrete method tanımlanabilir.
    5-  Abs class içinde hem abs method hem de concrete method ve variable tanımlanabilir.
    6- Bir concrete child class parent abs class extend ettiğinde abs methodları implement etmek zorunda ama
    concrete methodlar isteğe göre override edilir.
    7- Parent child ilişkisi olan abs classları abs methodları implement etmek zorunda değil
    8- Parent olan abstract class birden çok concrete veya abs child class extend edebilir.
    ancak child class birden cok abs parent class dan extends e-de-mezz
    9- Abstract class'da final ve abs method tanımlanamaz yoksa Cte verir
    10- Abstract class'da private ve private abs method tanımlanamaz yoksa Cte verir
    11- Abstract class'da static ve static abs method tanımlanamaz yoksa Cte verir
    ** 9,10,11 implement ve override edilmez ondan dolayı abs olamaz

    **** ABSTRACT CLASS ASLA KESİNLİKLE OBJE ÜRETEMEZ!!!!
    TRİCK -> Abstract Class lar referansı child classın objesini tutabilir(Polimorphism)


     */
}
