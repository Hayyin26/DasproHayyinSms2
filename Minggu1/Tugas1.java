package Minggu1;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar kode plat nomor dan nama kota
        char[][] KOTA = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' }
        };
        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };

        // Minta pengguna memasukkan kode plat nomor
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor : ");
        String code = scanner.nextLine();

        // Cari nama kota yang cocok
        String namakota = null;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == code.charAt(0)) {
                namakota = new String(KOTA[i]);
                break;
            }
        }

        // Cetak nama kota
        if (namakota != null) {
            System.out.println("Nama Kota : " + namakota);
        } else {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }
    }
}