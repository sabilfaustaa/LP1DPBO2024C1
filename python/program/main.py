from AnggotaDPR import AnggotaDPR

def display_anggota(daftar_anggota):
    kolom_names = ["ID", "Nama", "Umur", "Jabatan", "Bidang", "Partai"]
    max_lengths = [len(kolom) for kolom in kolom_names]

    for anggota in daftar_anggota:
        identitas = anggota.get_identitas()
        for i, value in enumerate(identitas):
            max_lengths[i] = max(max_lengths[i], len(value))

    header_row = " ".join(kolom.ljust(max_lengths[i]) for i, kolom in enumerate(kolom_names))
    print(header_row)

    for anggota in daftar_anggota:
        identitas = anggota.get_identitas()
        row = " ".join(value.ljust(max_lengths[i]) for i, value in enumerate(identitas))
        print(row)

def tambah(daftar_anggota):
    id = int(input("ID: "))
    nama = input("Nama: ")
    umur = int(input("Umur: "))
    jabatan = input("Jabatan: ")
    nama_bidang = input("Nama Bidang: ")
    nama_partai = input("Nama Partai: ")

    anggota_baru = AnggotaDPR(id, nama, umur, jabatan, nama_bidang, nama_partai)
    daftar_anggota.append(anggota_baru)
    print("Anggota DPR berhasil ditambahkan.\n")

def update(daftar_anggota):
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

def hapus(daftar_anggota):
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
        print("==================================")
        print("Tabel Anggota DPR :")
        if len(daftar_anggota) == 0:
            print("Data anggota DPR belum tersedia, Silakan input terlebih dahulu!")
        else:
            display_anggota(daftar_anggota)
        print("==================================")

        print("1. Tambah Anggota DPR")
        print("2. Update Anggota DPR")
        print("3. Hapus Anggota DPR")
        print("4. Keluar")
        pilihan = int(input("Pilih opsi: "))

        if pilihan == 1:
            tambah(daftar_anggota)
        elif pilihan == 2:
            update(daftar_anggota)
        elif pilihan == 3:
            hapus(daftar_anggota)
        elif pilihan == 4:
            print("Selesai.")
            break
        else:
            print("Pilihan tidak sesuai.")

if __name__ == "__main__":
    main()
