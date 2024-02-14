import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void displayAnggotaDPR(ArrayList<AnggotaDPR> daftarAnggota) {
        int maxIdLength = "ID".length();
        int maxNamaLength = "Nama".length();
        int maxUmurLength = "Umur".length();
        int maxJabatanLength = "Jabatan".length();
        int maxBidangLength = "Bidang".length();
        int maxPartaiLength = "Partai".length();

        for (AnggotaDPR anggota : daftarAnggota) {
            maxIdLength = Math.max(maxIdLength, Integer.toString(anggota.getId()).length());
            maxNamaLength = Math.max(maxNamaLength, anggota.getNama().length());
            maxUmurLength = Math.max(maxUmurLength, Integer.toString(anggota.getUmur()).length());
            maxJabatanLength = Math.max(maxJabatanLength, anggota.getJabatan().length());
            maxBidangLength = Math.max(maxBidangLength, anggota.getNamaBidang().length());
            maxPartaiLength = Math.max(maxPartaiLength, anggota.getNamaPartai().length());
        }

        System.out.printf("%-" + maxIdLength + "s %-"
                + maxNamaLength + "s %-"
                + maxUmurLength + "s %-"
                + maxJabatanLength + "s %-"
                + maxBidangLength + "s %-"
                + maxPartaiLength + "s %n",
                "ID", "Nama", "Umur", "Jabatan", "Bidang", "Partai");

        for (AnggotaDPR anggota : daftarAnggota) {
            anggota.showIdentitas(maxIdLength, maxNamaLength, maxUmurLength, maxJabatanLength, maxBidangLength, maxPartaiLength);
        }
    }

    public static void tambah(ArrayList<AnggotaDPR> daftarAnggota, Scanner sc) {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Umur: ");
        int umur = sc.nextInt();
        sc.nextLine();
        System.out.print("Jabatan: ");
        String jabatan = sc.nextLine();
        System.out.print("Nama Bidang: ");
        String namaBidang = sc.nextLine();
        System.out.print("Nama Partai: ");
        String namaPartai = sc.nextLine();

        AnggotaDPR anggotaBaru = new AnggotaDPR(id, nama, umur, jabatan, namaBidang, namaPartai);
        daftarAnggota.add(anggotaBaru);
        System.out.println("Alert :: Anggota DPR berhasil ditambahkan.\n");
    }

    public static void update(ArrayList<AnggotaDPR> daftarAnggota, Scanner sc) {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (AnggotaDPR anggota : daftarAnggota) {
            if (anggota.getId() == id) {
                System.out.print("Nama: ");
                anggota.setNama(sc.nextLine());
                System.out.print("Umur: ");
                anggota.setUmur(sc.nextInt());
                sc.nextLine();
                System.out.print("Jabatan: ");
                anggota.setJabatan(sc.nextLine());
                System.out.print("Nama Bidang: ");
                anggota.setNamaBidang(sc.nextLine());
                System.out.print("Nama Partai: ");
                anggota.setNamaPartai(sc.nextLine());
                System.out.println("Alert :: Data Anggota DPR berhasil diupdate.\n");
                return;
            }
        }
        System.out.println("Alert :: Anggota DPR dengan ID " + id + " tidak ditemukan.\n");
    }

    public static void hapus(ArrayList<AnggotaDPR> daftarAnggota, Scanner scanner) {
        System.out.print("Masukkan ID anggota DPR yang akan dihapus: ");
        int id = scanner.nextInt();
        boolean ditemukan = false;

        int i = 0;
        while (i < daftarAnggota.size() && !ditemukan) {
            if (daftarAnggota.get(i).getId() == id) {
                daftarAnggota.remove(i);
                ditemukan = true;
                System.out.println("Alert :: Anggota DPR dengan ID " + id + " telah dihapus.\n");
            }
            i++;
        }

        if (!ditemukan) {
            System.out.println("Alert :: Anggota DPR dengan ID " + id + " tidak ditemukan.\n");
        }
    }


    public static void main(String[] args) {
        ArrayList<AnggotaDPR> daftarAnggota = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("==================================");
            System.out.println("Tabel Anggota DPR :");
            if(daftarAnggota.size() == 0) {
                System.out.println("Data anggota DPR belum tersedia, Silakan input terlebih dahulu!");
            } else {
                displayAnggotaDPR(daftarAnggota);
            }
            System.out.println("==================================");

            System.out.println("1. Tambah Anggota DPR");
            System.out.println("2. Update Anggota DPR");
            System.out.println("3. Hapus Anggota DPR");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");

            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tambah(daftarAnggota, sc);
                    break;
                case 2:
                    update(daftarAnggota, sc);
                    break;
                case 3:
                    hapus(daftarAnggota, sc);
                    break;
                case 4:
                    System.out.println("Alert :: Selesai.");
                    break;
                default:
                    System.out.println("Alert :: Pilihan tidak sesuai.");
            }
        } while (pilihan != 4);

        sc.close();
    }
}
