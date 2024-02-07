#include <iostream>
#include <string>

using namespace std;

class AnggotaDPR
{
    private:
        int id;
        string nama;
        int umur;
        string jabatan;
        string namaBidang;
        string namaPartai;

    public:
        /* Constructors. */
        AnggotaDPR() {
            this->id = 0;
            this->nama = "";
            this->umur = 0;
            this->jabatan = "";
            this->namaBidang = "";
            this->namaPartai = "";
        }
    
        AnggotaDPR(int id, string nama, int umur, string jabatan, string namaBidang, string namaPartai) {
            this->id = id;
            this->nama = nama;
            this->umur = umur;
            this->jabatan = jabatan;
            this->namaBidang = namaBidang;
            this->namaPartai = namaPartai;
        }

        int get_id() const {
            return id;
        }

        string get_nama() const {
            return nama;
        }

        int get_umur() const {
            return umur;
        }

        string get_jabatan() const {
            return jabatan;
        }

        string get_namaBidang() const {
            return namaBidang;
        }

        string get_namaPartai() const {
            return namaPartai;
        }

        void set_id(int newId) {
            id = newId;
        }

        void set_nama(string newNama) {
            nama = newNama;
        }

        void set_umur(int newUmur) {
            umur = newUmur;
        }

        void set_jabatan(string newJabatan) {
            jabatan = newJabatan;
        }

        void set_namaBidang(string newNamaBidang) {
            namaBidang = newNamaBidang;
        }

        void set_namaPartai(string newNamaPartai) {
            namaPartai = newNamaPartai;
        }

        void show_identitas() const {
            cout << "ID: " << id << ", Nama: " << nama << ", Umur: " << umur
                << ", Jabatan: " << jabatan << ", Bidang: " << namaBidang
                << ", Partai: " << namaPartai << endl;
        }

        /* Destructors. */
        ~AnggotaDPR() {

        }
};
