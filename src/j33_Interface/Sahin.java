package j33_Interface;

public class Sahin extends Tofas implements disDonanim,icDonanim,Lastik{//conc child class extends->Tofas,
    // implement interface->icdonanım,dısdonanım,lastik
    @Override
    public void ebat() {
        System.out.println("agam 16 inç lastik ebat :)");
        System.out.println("Dr bu ne insan yiyecek bunu");
    }


    @Override
    public void jant() {
        System.out.println("agam senin gibi 5 kollu");
    }

    @Override
    public void motor() {
        System.out.println("agam 1.6 aile motor");
    }

    @Override
    public void yakit() {
        System.out.println("agam TÜPitak yoksa ocagına incir ağacı");
    }

    @Override
    public void kapi() {
        System.out.println("agam 4 kapı sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("agam akordion kaporta gamzesiz olmaz");
    }

    @Override
    public void koltuk() {
        System.out.println("agam deri koltuk yazın pişk yapar içi saman olmasın kafi");
    }

    @Override
    public void klima() {
        System.out.println("agam aç camı serinle acs klima ");
    }
}
