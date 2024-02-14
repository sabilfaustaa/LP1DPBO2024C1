from AnggotaDPR import AnggotaDPR

def display_anggota_dpr(daftar_anggota):
    for anggota in daftar_anggota:
        anggota.show_identitas()

def tambah_anggota(daftar_anggota):
    id = int(input("ID: "))
    nama = input("Nama: ")
    umur = int(input("Umur: "))
    jabatan = input("Jabatan: ")
    nama_bidang = input("Nama Bidang: ")
    nama_partai = input("Nama Partai: ")

    anggota_baru = AnggotaDPR(id, nama, umur, jabatan, nama_bidang, nama_partai)
    daftar_anggota.append(anggota_baru)
    print("Anggota DPR berhasil ditambahkan.\n")

def update_anggota(daftar_anggota):
    id = int(input("ID: "))
    for anggota in daftar_anggota:
        if anggota.get_id() == id:
            nama = input("Nama: ")
            umur = int(input("Umur: "))
            jabatan = input("Jabatan: ")
            nama_bidang = input("Nama Bidang: ")
            nama_partai = input("Nama Partai: ")

            anggota.set_nama(nama)
            anggota.set_umur(umur)
            anggota.set_jabatan(jabatan)
            anggota.set_namaBidang(nama_bidang)
            anggota.set_namaPartai(nama_partai)
            print("Data Anggota DPR berhasil diupdate.\n")
            return
    print(f"Anggota DPR dengan ID {id} tidak ditemukan.\n")

def hapus_anggota(daftar_anggota):
    id = int(input("Masukkan ID anggota DPR yang akan dihapus: "))
    for i, anggota in enumerate(daftar_anggota):
        if anggota.get_id() == id:
            del daftar_anggota[i]
            print(f"Anggota DPR dengan ID {id} telah dihapus.\n")
            return
    print(f"Anggota DPR dengan ID {id} tidak ditemukan.\n")

def main():
    daftar_anggota = []
    
    while True:
        print("===================")
        display_anggota_dpr(daftar_anggota)

        print("1. Tambah Anggota DPR")
        print("2. Update Anggota DPR")
        print("3. Hapus Anggota DPR")
        print("4. Keluar")
        pilihan = int(input("Pilih opsi: "))

        if pilihan == 1:
            tambah_anggota(daftar_anggota)
        elif pilihan == 2:
            update_anggota(daftar_anggota)
        elif pilihan == 3:
            hapus_anggota(daftar_anggota)
        elif pilihan == 4:
            print("Selesai.")
            break
        else:
            print("Pilihan tidak sesuai.")

if __name__ == "__main__":
    main()
