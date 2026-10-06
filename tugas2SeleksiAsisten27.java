import java.util.Scanner;

public class tugas2SeleksiAsisten27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah mahasiswa berstatus aktif? (ya/tidak)        : ");
        boolean aktif = input.nextLine().trim().equalsIgnoreCase("ya");
        System.out.print("Apakah sedang mendapat sanksi akademik? (ya/tidak)  : ");
        boolean sanksi = input.nextLine().trim().equalsIgnoreCase("ya");

        // Tahap 1: status aktif DAN tidak sedang terkena sanksi
        if (aktif && !sanksi) {
            System.out.println("Tahap 1 (administrasi): LOLOS");

            System.out.print("Nilai Dasar Pemrograman                             : ");
            double nilaiDasar = Double.parseDouble(input.nextLine().trim());
            System.out.print("Punya sertifikat kompetensi pemrograman? (ya/tidak) : ");
            boolean sertifikat = input.nextLine().trim().equalsIgnoreCase("ya");

            // Tahap 2: nilai >= 80 ATAU punya sertifikat
            if (nilaiDasar >= 80 || sertifikat) {
                System.out.println("Tahap 2 (kompetensi): LOLOS, dipanggil untuk wawancara.");

                System.out.print("Nilai wawancara                                     : ");
                double nilaiWawancara = Double.parseDouble(input.nextLine().trim());

                // Tahap 3: nilai wawancara minimal 75
                if (nilaiWawancara >= 75) {
                    System.out.println("Tahap 3 (wawancara): LOLOS");
                    System.out.println("HASIL: DITERIMA sebagai asisten praktikum.");
                } else {
                    System.out.println("HASIL: TIDAK DITERIMA.");
                    System.out.println("Alasan: nilai wawancara kurang dari 75.");
                }
            } else {
                System.out.println("HASIL: TIDAK LOLOS seleksi kompetensi.");
                System.out.println("Alasan: nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi pemrograman.");
            }
        } else {
            System.out.println("HASIL: TIDAK LOLOS seleksi administrasi.");
            if (!aktif && sanksi) {
                System.out.println("Alasan: tidak berstatus aktif dan sedang mendapat sanksi akademik.");
            } else if (!aktif) {
                System.out.println("Alasan: tidak berstatus aktif.");
            } else {
                System.out.println("Alasan: sedang mendapat sanksi akademik.");
            }
        }
    }
}
