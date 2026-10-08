import java.util.Scanner;

public class StudiKasus203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        String kegiatan ;
        int dokumen;
        int juara ;
        int status;

        System.out.print("Nama Mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/LAINNYA): ");
        kegiatan = sc.nextLine();
        System.out.print("Jumlah dokumen : ");
        dokumen = sc.nextInt();
        System.out.print("Peringkat juara : ");
        juara = sc.nextInt();

        if (kegiatan.equalsIgnoreCase("BELMAWA") || kegiatan.equalsIgnoreCase("BAKORMA") || kegiatan.equalsIgnoreCase("MANDIRI")) {
            if (juara >= 1 && juara <=3 && dokumen >= 4 && dokumen <=4) {
                status = 1;
            } else {
                status = 0;
            }
        } else if (kegiatan.equalsIgnoreCase("PKM")) {
            if (dokumen >= 4 && dokumen <= 4) {
                status = 1;
            } else {
                status = 0;
            }
        } else {
            status = 0;
        }




        sc.close();
    }
}
