package Minggu2;

public class BukuMain25 {

    public static void main(String[] args) {

        Buku25 bk1 = new Buku25();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.restock(0);
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.hitungHargaTotal(5);
        bk1.hitungDiskon(bk1.total);
        bk1.hitungHargaBayar(bk1.Diskon, bk1.total);
        bk1.tampilInformasi();

        Buku25 bk2 = new Buku25("Self reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku25 Hayyin = new Buku25("Solo Leveling", "Chu-Gong", 189, 40, 99999);
        Hayyin.tampilInformasi();
        Hayyin.terjual(10);
        Hayyin.gantiHarga(65000);
        Hayyin.tampilInformasi();
        Hayyin.hitungHargaTotal(5);
        Hayyin.hitungDiskon(Hayyin.total);
        Hayyin.hitungHargaBayar(Hayyin.Diskon, Hayyin.total);
        Hayyin.tampilInformasi();

    }
}