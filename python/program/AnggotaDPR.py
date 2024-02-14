class AnggotaDPR:
    def __init__(self, id=0, nama="", umur=0, jabatan="", namaBidang="", namaPartai=""):
        self.__id = id
        self.__nama = nama
        self.__umur = umur
        self.__jabatan = jabatan
        self.__namaBidang = namaBidang
        self.__namaPartai = namaPartai

    def get_id(self):
        return self.__id

    def get_nama(self):
        return self.__nama

    def get_umur(self):
        return self.__umur

    def get_jabatan(self):
        return self.__jabatan

    def get_namaBidang(self):
        return self.__namaBidang

    def get_namaPartai(self):
        return self.__namaPartai

    def set_id(self, id):
        self.__id = id

    def set_nama(self, nama):
        self.__nama = nama

    def set_umur(self, umur):
        self.__umur = umur

    def set_jabatan(self, jabatan):
        self.__jabatan = jabatan

    def set_namaBidang(self, namaBidang):
        self.__namaBidang = namaBidang

    def set_namaPartai(self, namaPartai):
        self.__namaPartai = namaPartai

    def get_identitas(self):
        return (str(self.__id), self.__nama, str(self.__umur), self.__jabatan, self.__namaBidang, self.__namaPartai)
