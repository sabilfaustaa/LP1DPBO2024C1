<?php
class AnggotaDPR {
    private $id;
    private $nama;
    private $umur;
    private $jabatan;
    private $namaBidang;
    private $namaPartai;

    public function __construct($id, $nama, $umur, $jabatan, $namaBidang, $namaPartai) {
        $this->id = $id;
        $this->nama = $nama;
        $this->umur = $umur;
        $this->jabatan = $jabatan;
        $this->namaBidang = $namaBidang;
        $this->namaPartai = $namaPartai;
    }

    public function get_id() {
        return $this->id;
    }
    
    public function get_nama() {
        return $this->nama;
    }
    
    public function get_umur() {
        return $this->umur;
    }
    
    public function get_jabatan() {
        return $this->jabatan;
    }
    
    public function get_namaBidang() {
        return $this->namaBidang;
    }
    
    public function get_namaPartai() {
        return $this->namaPartai;
    }

    public function set_id($id) {
        $this->id = $id;
    }

    public function set_nama($nama) {
        $this->nama = $nama;
    }

    public function set_umur($umur) {
        $this->umur = $umur;
    }

    public function set_jabatan($jabatan) {
        $this->jabatan = $jabatan;
    }

    public function set_namaBidang($namaBidang) {
        $this->namaBidang = $namaBidang;
    }

    public function set_namaPartai($namaPartai) {
        $this->namaPartai = $namaPartai;
    }
    
    public function showIdentitas() {
        echo "<tr>
                <td>{$this->id}</td>
                <td>{$this->nama}</td>
                <td>{$this->umur}</td>
                <td>{$this->jabatan}</td>
                <td>{$this->namaBidang}</td>
                <td>{$this->namaPartai}</td>
              </tr>";
    }
}
?>
