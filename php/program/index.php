<?php
require_once("AnggotaDPR.php");

$daftarAnggota = [];

function tambahAnggota($daftarAnggota, $id, $nama, $umur, $jabatan, $namaBidang, $namaPartai) {
    $anggotaBaru = new AnggotaDPR($id, $nama, $umur, $jabatan, $namaBidang, $namaPartai);
    array_push($daftarAnggota, $anggotaBaru);
    echo "Anggota DPR berhasil ditambahkan.<br><br>";

    return $daftarAnggota;
}

function updateAnggota($daftarAnggota, $id, $nama, $umur, $jabatan, $namaBidang, $namaPartai) {
    foreach ($daftarAnggota as $anggota) {
        if ($anggota->get_id() == $id) {
            $anggota->set_nama($nama);
            $anggota->set_umur($umur);
            $anggota->set_jabatan($jabatan);
            $anggota->set_namaBidang($namaBidang);
            $anggota->set_namaPartai($namaPartai);
            break;
        }
    }

    echo "Data Anggota DPR berhasil diupdate.<br><br>";
    return $daftarAnggota;
}

function hapusAnggota($daftarAnggota, $id) {
    foreach ($daftarAnggota as $key => $anggota) {
        if ($anggota->get_id() == $id) {
            unset($daftarAnggota[$key]);
            break;
        }
    }
    echo "Data Anggota DPR berhasil dihapus.<br><br>";
    return $daftarAnggota;
}

function displayAnggota($daftarAnggota) {
    echo "<table border='1'>
            <tr>
                <th>ID</th>
                <th>Nama</th>
                <th>Umur</th>
                <th>Jabatan</th>
                <th>Bidang</th>
                <th>Partai</th>
            </tr>";
    foreach ($daftarAnggota as $anggota) {
        $anggota->showIdentitas();
    }
    echo "</table>";
}

$daftarAnggota = tambahAnggota($daftarAnggota, 1, "Anggota 1", 50, "Jabatan A", "Bidang A", "Partai A");
$daftarAnggota = tambahAnggota($daftarAnggota, 2, "Anggota 2", 45, "Jabatan B", "Bidang B", "Partai B");
$daftarAnggota = tambahAnggota($daftarAnggota, 3, "Anggota 3", 40, "Jabatan C", "Bidang C", "Partai C");
$daftarAnggota = tambahAnggota($daftarAnggota, 4, "Anggota 4", 35, "Jabatan D", "Bidang D", "Partai D");

displayAnggota($daftarAnggota);

$daftarAnggota = updateAnggota($daftarAnggota, 2, "Anggota 2 Update", 46, "Jabatan Update B", "Bidang Update B", "Partai Update B");

displayAnggota($daftarAnggota);

$daftarAnggota = hapusAnggota($daftarAnggota, 3);

displayAnggota($daftarAnggota);