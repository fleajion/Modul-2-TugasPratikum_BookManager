package org.example;
public class Book {
    private final String judulBuku;
    private final String penulis;
    private final int tahun;

    public Book(String judulBuku, String penulis, int tahun) {
        if (judulBuku == null || judulBuku.trim().isEmpty()) {
            throw new IllegalArgumentException("Judul harus diisi");
        }
        if (penulis == null || penulis.trim().isEmpty()) {
            throw new IllegalArgumentException("Author harus diisi");
        }
        if (tahun < 2000 || tahun > 2100) {
            throw new IllegalArgumentException("Tahun hanya bisa diisi dari tahun 2000 sampai 2100");
        }
        this.judulBuku = judulBuku.trim();
        this.penulis = penulis.trim();
        this.tahun = tahun;
    }

    public String getJudulBuku() { return judulBuku; }
    public String getPenulis() { return penulis; }
    public int getTahun() { return tahun; }

    @Override
    public String toString() {
        return String.format("%s by %s (%d)", judulBuku, penulis, tahun);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return tahun == book.tahun &&
                judulBuku.equals(book.judulBuku) &&
                penulis.equals(book.penulis);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(judulBuku, penulis, tahun);
    }

    public boolean getTitle() {
        return false;
    }
}