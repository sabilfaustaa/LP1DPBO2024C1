<?php
require_once("AnggotaDPR.php");

$daftarAnggota = [];

function tambahAnggota($daftarAnggota, $id, $nama, $foto, $umur, $jabatan, $namaBidang, $namaPartai) {
    $anggotaBaru = new AnggotaDPR($id, $nama, $foto, $umur, $jabatan, $namaBidang, $namaPartai);
    array_push($daftarAnggota, $anggotaBaru);
    echo "Anggota DPR berhasil ditambahkan.<br><br>";

    return $daftarAnggota;
}

function updateAnggota($daftarAnggota, $id, $nama, $foto, $umur, $jabatan, $namaBidang, $namaPartai) {
    foreach ($daftarAnggota as $anggota) {
        if ($anggota->get_id() == $id) {
            $anggota->set_nama($nama);
            $anggota->set_foto($foto);
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
                <th>Foto</th>
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

$daftarAnggota = tambahAnggota($daftarAnggota, 1, "Sabil", "https://www.aquasafemine.com/wp-content/uploads/2018/06/dummy-man-570x570.png", 20, "Ketua", "Teknologi", "Gerindra");
$daftarAnggota = tambahAnggota($daftarAnggota, 2, "Hanif", "https://www.aquasafemine.com/wp-content/uploads/2018/06/dummy-man-570x570.png", 20, "Anggota", "Pertanian", "PDIP");
$daftarAnggota = tambahAnggota($daftarAnggota, 3, "Thia", "https://www.heuschenschrouff.com/wp-content/uploads/2017/11/team-dummy-woman-e1631101482457.png", 19, "Ketua", "Perhubungan", "Golkar");
$daftarAnggota = tambahAnggota($daftarAnggota, 4, "Boni", "https://www.aquasafemine.com/wp-content/uploads/2018/06/dummy-man-570x570.png", 35, "Anggota", "Transportasi", "Hanura");

displayAnggota($daftarAnggota);

$daftarAnggota = updateAnggota($daftarAnggota, 2, "Hanif Update", "https://www.aquasafemine.com/wp-content/uploads/2018/06/dummy-man-570x570.png", 20, "Ketua", "Pertanian update", "PKS");

displayAnggota($daftarAnggota);

$daftarAnggota = hapusAnggota($daftarAnggota, 4);

displayAnggota($daftarAnggota);