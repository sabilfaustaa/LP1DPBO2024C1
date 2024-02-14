import java.util.ArrayList;
import java.util.Scanner;

public class AnggotaDPR {
    private int id;
    private String nama;
    private int umur;
    private String jabatan;
    private String namaBidang;
    private String namaPartai;

    public AnggotaDPR() {
        this.id = 0;
        this.nama = "";
        this.umur = 0;
        this.jabatan = "";
        this.namaBidang = "";
        this.namaPartai = "";
    }

    public AnggotaDPR(int id, String nama, int umur, String jabatan, String namaBidang, String namaPartai) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.namaBidang = namaBidang;
        this.namaPartai = namaPartai;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getNamaBidang() {
        return namaBidang;
    }

    public String getNamaPartai() {
        return namaPartai;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setNamaBidang(String namaBidang) {
        this.namaBidang = namaBidang;
    }

    public void setNamaPartai(String namaPartai) {
        this.namaPartai = namaPartai;
    }

    public void showIdentitas(int idWidth, int namaWidth, int umurWidth, int jabatanWidth, int bidangWidth, int partaiWidth) {
        System.out.printf("%-" + idWidth + "d %-"
            + namaWidth + "s %-"
            + umurWidth + "d %-"
            + jabatanWidth + "s %-"
            + bidangWidth + "s %-"
            + partaiWidth + "s %n",
            id, nama, umur, jabatan, namaBidang, namaPartai);
    }
}
