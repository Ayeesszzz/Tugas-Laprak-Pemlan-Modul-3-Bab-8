public class Kucing implements MakhlukHidup {
    
    @Override
    public void makan() {
        System.out.println("Kucing makan ikan/whiskas");
    }

    @Override
    public void berjalan() {
        System.out.println("Jalan mengendap-endap pakai 4 kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Meow... Meow...");
    }
}