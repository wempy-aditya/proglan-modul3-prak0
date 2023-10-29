// tugas 2

import java.util.ArrayList;
import java.util.List;

/**
 * Kelas Perpustakaan digunakan untuk mengelola perpustakaan dan daftar buku-bukunya.
 */
public class Perpustakaan {
    private List<String> daftarBuku;

    /**
     * Konstruktor untuk membuat objek Perpustakaan.
     */
    public Perpustakaan() {
        daftarBuku = new ArrayList<>();
    }

    /**
     * Menambahkan buku ke perpustakaan.
     * @param judul Judul buku yang akan ditambahkan.
     */
    public void tambahBuku(String judul) {
        daftarBuku.add(judul);
    }

    /**
     * Menghapus buku dari perpustakaan berdasarkan judul.
     * @param judul Judul buku yang akan dihapus.
     */
    public void hapusBuku(String judul) {
        daftarBuku.remove(judul);
    }

    /**
     * Mendapatkan daftar semua buku yang ada di perpustakaan.
     * @return Daftar judul buku-buku di perpustakaan.
     */
    public List<String> getDaftarBuku() {
        return daftarBuku;
    }

    /**
     * Metode utama untuk menguji kelas Perpustakaan.
     * @param args Argumen baris perintah (tidak digunakan dalam contoh ini).
     */
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        perpustakaan.tambahBuku("Harry Potter");
        perpustakaan.tambahBuku("Lord of the Rings");

        List<String> daftarBuku = perpustakaan.getDaftarBuku();
        System.out.println("Daftar Buku di Perpustakaan:");
        for (String buku : daftarBuku) {
            System.out.println(buku);
        }
    }
}
