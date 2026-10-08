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

        




        sc.close();
    }
}
