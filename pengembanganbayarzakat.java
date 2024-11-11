/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zakatmalcindipbo2024;

/**
 *
 * @author ROG STRIX
 */
  import java.util.Scanner;
public class pengembanganbayarzakat {


    class Donatur {
        private String nama;
        private double harta;

        // Konstruktor berparameter
        public Donatur(String nama, double harta) {
            this.nama = nama;
            this.harta = harta;
        }

        // Metode setter dan getter
        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public double getHarta() {
            return harta;
        }

        public void setHarta(double harta) {
            this.harta = harta;
        }

        // Metode untuk menghitung zakat maal (2.5% dari total harta)
        public double hitungZakat() {
            return harta * 2.5 / 100;
        }
    }

    class Penerima {
        private String nama;
        private double jumlahZakatDiterima;

        // Konstruktor berparameter
        public Penerima(String nama, double jumlahZakatDiterima) {
            this.nama = nama;
            this.jumlahZakatDiterima = jumlahZakatDiterima;
        }

        // Metode setter dan getter
        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public double getJumlahZakatDiterima() {
            return jumlahZakatDiterima;
        }

        public void setJumlahZakatDiterima(double jumlahZakatDiterima) {
            this.jumlahZakatDiterima = jumlahZakatDiterima;
        }
    }

    public static void main(String[] args) {
        // Meminta input dari donatur
        try (Scanner input = new Scanner(System.in)) {
            ZakatmalcindiPBO2024 zakatApp = new ZakatmalcindiPBO2024();

            // Meminta input dari donatur
            System.out.print("Masukkan nama donatur: ");
            String namaDonatur = input.nextLine();
            System.out.print("Masukkan jumlah harta Anda (dalam bentuk desimal): ");
            double harta = input.nextDouble();

            // Membuat objek Donatur
            Donatur donatur = zakatApp.new Donatur(namaDonatur, harta);

            // Menghitung zakat
            double zakat = donatur.hitungZakat();
            System.out.printf("Jumlah zakat yang harus dibayarkan oleh %s: Rp %.2f\n", donatur.getNama(), zakat);

            // Meminta input untuk penerima zakat
            input.nextLine(); // Membersihkan newline
            System.out.print("Masukkan nama penerima zakat: ");
            String namaPenerima = input.nextLine();
            Penerima penerima = zakatApp.new Penerima(namaPenerima, zakat);

            // Menampilkan informasi penerima zakat
            System.out.printf("Nama penerima: %s, Jumlah zakat yang diterima: Rp %.2f\n", penerima.getNama(), penerima.getJumlahZakatDiterima());
        }
    }
}


