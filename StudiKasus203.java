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
        System.out.print("Status pendanaan PKM(1=lolos,0=tidak lolos): ");
        status = sc.nextInt();
        System.out.print("Jumlah dokumen : ");
        dokumen = sc.nextInt();
        System.out.print("Peringkat juara : ");
        juara = sc.nextInt();

        if (kegiatan.equalsIgnoreCase("BELMAWA") || kegiatan.equalsIgnoreCase("BAKORMA") || kegiatan.equalsIgnoreCase("MANDIRI")) {
            if (juara >= 1 && juara <=3) {
                if(dokumen >=4){
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan");
                }
                else if (dokumen >=3){
                    System.out.println("Status : Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan");
                }
                else if (dokumen ==2){
                    System.out.println("Status : Dokumen tidak lengkap (kurang 2 dokumen). Dana penghargaan tidak diberikan");
                }
                else if (dokumen ==1){
                    System.out.println("Status : Dokumen tidak lengkap (kurang 3 dokumen). Dana penghargaan tidak diberikan");
                }
                else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang 4 dokumen). Dana penghargaan tidak diberikan");
                }
            } 
            else {
                System.out.println("Status : Peringkat juara tidak valid. Dana penghargaan tidak diberikan");
            }
        } else if (kegiatan.equalsIgnoreCase("PKM")) {
            if ( status ==1) {
                if(dokumen >=4){
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan");
                }
                else if (dokumen ==3){
                    System.out.println("Status : Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan");
                }
                else if (dokumen ==2){
                    System.out.println("Status : Dokumen tidak lengkap (kurang 2 dokumen). Dana penghargaan tidak diberikan");
                }
                else if (dokumen ==1){
                    System.out.println("Status : Dokumen tidak lengkap (kurang 3 dokumen). Dana penghargaan tidak diberikan");
                }
                else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang 4 dokumen). Dana penghargaan tidak diberikan");
                }
                
            } else {
                System.out.println("Status : Tidak lolos pendanaan. Dana penghargaan tidak diberikan");
            }
        } else {
            System.out.println("Status : Kegiatan lainnya tidak memperoleh dana pendanaan. Dana penghargaan tidak diberikan");
        }

        



        sc.close();
    }
}
