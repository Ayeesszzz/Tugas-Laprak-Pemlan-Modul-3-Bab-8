package Laprak_Modul8_Bab3;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public int getPayableAmount() {
        int totalInvoices = 0;
        for (Invoice inv : invoices) {
            totalInvoices += inv.getPayableAmount();
        }
        return salaryPerMonth - totalInvoices;
    }

    public void displayInfo() {
        System.out.println("No. Registrasi : " + registrationNumber);
        System.out.println("Nama Karyawan  : " + name);
        System.out.println("Gaji Pokok     : Rp." + salaryPerMonth + ",00");
        System.out.println("\nDetail Belanja Koperasi (Invoices):");
        
        for (Invoice inv : invoices) {
            System.out.println("Produk: " + inv.getProductName());
            System.out.println("Jumlah: " + inv.getQuantity());
            System.out.println("Harga per item: Rp." + inv.getPricePerItem() + ",00");
            System.out.println("Total: Rp." + inv.getPayableAmount() + ",00");
            System.out.println("-------------------------");
        }
        System.out.println("Gaji Bersih: Rp." + getPayableAmount() + ",00");
    }
}
