
#include <bits/stdc++.h>
#include "AnggotaDPR.cpp"

using namespace std;

void displayAnggotaDPR(const vector<AnggotaDPR>& daftarAnggota) {
    for (const auto& anggota : daftarAnggota) {
        anggota.show_identitas();
    }
}

void tambah(vector<AnggotaDPR>& daftarAnggota) {
    int id, umur;
    string nama, jabatan, namaBidang, namaPartai;

    cout << "ID: ";
    cin >> id;
    cout << "Nama: ";
    cin >> nama;
    cout << "Umur: ";
    cin >> umur;
    cout << "Jabatan: ";
    cin >> jabatan;
    cout << "Nama Bidang: ";
    cin >> namaBidang;
    cout << "Nama Partai: ";
    cin >> namaPartai;

    AnggotaDPR anggotaBaru(id, nama, umur, jabatan, namaBidang, namaPartai);
    daftarAnggota.push_back(anggotaBaru);
    cout << "Anggota DPR berhasil ditambahkan.\n";
}


void update(vector<AnggotaDPR>& daftarAnggota) {
    int id, umur;
    string nama, jabatan, namaBidang, namaPartai;
    
    cout << "ID: ";
    cin >> id;

    for (auto& anggota : daftarAnggota) {
        if (anggota.get_id() == id) {
            cout << "Nama: ";
            cin >> nama;
            cout << "Umur: ";
            cin >> umur;
            cout << "Jabatan: ";
            cin >> jabatan;
            cout << "Nama Bidang: ";
            cin >> namaBidang;
            cout << "Nama Partai: ";
            cin >> namaPartai;

            anggota.set_nama(nama);
            anggota.set_umur(umur);
            anggota.set_jabatan(jabatan);
            anggota.set_namaBidang(namaBidang);
            anggota.set_namaPartai(namaPartai);
            cout << "Data Anggota DPR berhasil diupdate.\n";
            return;
        }
    }
    cout << "Alert :: Anggota DPR dengan ID " << id << " tidak ditemukan.\n";
}

void hapus(vector<AnggotaDPR>& daftarAnggota) {
    int id;
    cout << "ID: ";
    cin >> id;

    auto it = remove_if(daftarAnggota.begin(), daftarAnggota.end(), [id](const AnggotaDPR& anggota) { 
        return anggota.get_id() == id; 
    });

    if (it != daftarAnggota.end()) {
        daftarAnggota.erase(it, daftarAnggota.end());
        cout << "Alert :: Anggota DPR dengan ID " << id << " telah dihapus.\n";
    } else {
        cout << "Alert :: Anggota DPR dengan ID " << id << " tidak ditemukan.\n";
    }
}


int main() {
    vector<AnggotaDPR> daftarAnggota;
    int pilihan;
    
    do {
        cout << "===================" << endl;
        displayAnggotaDPR(daftarAnggota);

        cout << "1. Tambah Anggota DPR\n";
        cout << "2. Update Anggota DPR\n";
        cout << "3. Hapus Anggota DPR\n";
        cout << "4. Keluar\n";
        cout << "Pilih opsi: ";

        cin >> pilihan;

        switch (pilihan) {
            case 1: {
                tambah(daftarAnggota);
                break;
            }
            case 2: {
                update(daftarAnggota);
                break;
            }
            case 3: {
                hapus(daftarAnggota);
                break;
            }
            case 4:
                cout << "Selesai.\n";
                break;
            default:
                cout << "Pilihan tidak sesuai.\n";
        }
    } while (pilihan != 4);

    return 0;
}
