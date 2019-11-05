package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Dosen dosen = new Dosen();
        dosen.setNIP("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        System.out.println("NIP DOSEN = " + dosen.getNIP());
        dosen.siapaKamu();
        dosen.mengajarApa();

        System.out.println("");

        Mahasiswa mhs = new Mahasiswa();
        mhs.setNIM("10117074");
        mhs.setNama("Brigita Julia Puspita Nai Goncalves");
        mhs.setUmur(20);
        mhs.setKelas("PBO2");
        System.out.println("NIM MAHASISWA = " + dosen.getNIP());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
}
