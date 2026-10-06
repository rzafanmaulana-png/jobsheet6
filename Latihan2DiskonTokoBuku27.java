import java.util.Scanner;

public class Latihan2DiskonTokoBuku27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Jenis buku (kamus / novel / lainnya) : ");
        String jenis = input.nextLine().trim();
        System.out.print("Jumlah buku yang dibeli              : ");
        int jumlah = Integer.parseInt(input.nextLine().trim());
        System.out.print("Harga satuan buku (Rp)               : ");
        double harga = Double.parseDouble(input.nextLine().trim());

        double diskon;

       
        if (jenis.equalsIgnoreCase("kamus") && jumlah > 2) {
            diskon = 10 + 2;                                  // 12%
        } else if (jenis.equalsIgnoreCase("kamus") && jumlah <= 2) {
            diskon = 10;                                      // 10%
        } else if (jenis.equalsIgnoreCase("novel") && jumlah > 3) {
            diskon = 7 + 2;                                   // 9%
        } else if (jenis.equalsIgnoreCase("novel") && jumlah <= 3) {
            diskon = 7 + 1;                                   // 8%
        } else {
            // selain kamus & novel
            if (jumlah > 3) {
                diskon = 5;                                   // 5%
            } else {
                diskon = 0;                                   // 0%
            }
        }

        // Proses perhitungan
        double total = harga * jumlah;
        double potongan = total * diskon / 100;
        double bayar = total - potongan;

       
        System.out.println("---------------------------------------");
        System.out.printf("Total sebelum diskon : Rp %.0f%n", total);
        System.out.printf("Persentase diskon    : %.0f%%%n", diskon);
        System.out.printf("Jumlah diskon        : Rp %.0f%n", potongan);
        System.out.printf("Total yang dibayar   : Rp %.0f%n", bayar);
    }
}