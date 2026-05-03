package Laprak_Modul8_Bab3;

public class MainKoperasi {
    public static void main(String[] args) {
        // Membuat data invoice
        Invoice inv1 = new Invoice("Beras", 2, 75000);
        Invoice inv2 = new Invoice("Minyak", 3, 30000);
        Invoice inv3 = new Invoice("Gula", 10, 18000);
        
        Invoice[] daftarBelanja = {inv1, inv2, inv3};

        // Membuat objek Employee
        Employee emp = new Employee(1212, "AYES", 2000000, daftarBelanja);

        // Menampilkan output
        emp.displayInfo();
    }
}