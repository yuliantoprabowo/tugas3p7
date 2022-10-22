package Penggajian;

import java.util.Scanner;

public class Penggajian {
    public static void main(String[] args) {
        String Nama, NPM;
        int gajipokok = 0;
        int totalgaji = 0;
        int tunjangan = 0;
        int pajak = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Program Perhitungan Gaji Karyawan");
        System.out.println("Universitas Indraprasta PGRI");

        System.out.println("======================================");

        System.out.println("Masukkan Nama   :");
        Nama = sc.nextLine();

        System.out.println("Masukkan NPM    :");
        NPM = sc.nextLine();

        System.out.println("1. Golongan 1A");
        System.out.println("2. Golongan 1B");
        System.out.println("3. Golongan 2A");
        System.out.println("4. Golongan 2B");
        System.out.println("5. Golongan 3A");
        System.out.println("6. Golongan 3B");
        System.out.println("");

        System.out.println("Masukkan Pilihan Golongan");

        int pilih = sc.nextInt();
        if (pilih == 1) {
            gajipokok = 1000000;
            tunjangan = 100000;
        } else if (pilih == 2) {
            gajipokok = 2500000;
            tunjangan = 250000;
        } else if (pilih == 3) {
            gajipokok = 3000000;
            tunjangan = 300000;
        } else if (pilih == 4) {
            gajipokok = 4000000;
            tunjangan = 400000;
        } else if (pilih == 5) {
            gajipokok = 5000000;
            tunjangan = 500000;
        } else if (pilih == 6) {
            gajipokok = 5500000;
            tunjangan = 550000;
        }
        pajak = ((5 / 2) * (gajipokok + tunjangan)) / 100;
        totalgaji = ((gajipokok + tunjangan) - pajak);

        System.out.println("======================================");

        System.out.println("Nama Karyawan   = " + Nama);
        System.out.println("NPM Karyawan    = " + NPM);
        System.out.println("Gaji Pokok      = " + gajipokok);
        System.out.println("Tunjangan       = " + tunjangan);
        System.out.println("Pajak           = " + pajak);
    }
}
