import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Umur Anda: ");
        int umur = input.nextInt();
        
        Manusia m = new Manusia(nama, umur);
        
        Kucing k = new Kucing();

        System.out.println("\n--- Perbandingan Perilaku (Polimorfisme) ---");
        
        System.out.println(">> Data Manusia:");
        m.tampilkanNama();
        m.makan();
        m.berjalan();
        m.bersuara();

        System.out.println("\n>> Data Kucing:");
        k.makan();
        k.berjalan();
        k.bersuara();

        input.close();
    }
}