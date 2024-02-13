import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void displayAnggotaDPR(ArrayList<AnggotaDPR> daftarAnggota) {
        for (AnggotaDPR anggota : daftarAnggota) {
            anggota.showIdentitas();
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
        System.out.println("Anggota DPR berhasil ditambahkan.\n");
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
                System.out.println("Data Anggota DPR berhasil diupdate.\n");
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
                System.out.println("Anggota DPR dengan ID " + id + " telah dihapus.\n");
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
            System.out.println("===================");
            displayAnggotaDPR(daftarAnggota);

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
                    System.out.println("Selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak sesuai.");
            }
        } while (pilihan != 4);

        sc.close();
    }
}
