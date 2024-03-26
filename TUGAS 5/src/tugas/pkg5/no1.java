package tugas.pkg5;

import java.util.Scanner;

class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;

    // Constructor
    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    // Method untuk menghitung luas segitiga
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung keliling segitiga
    public double hitungKeliling() {
        return 3 * sisi;
    }
}

public class no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Hitung Luas Segitiga");
            System.out.println("2. Hitung Keliling Segitiga");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungLuasSegitiga();
                    break;
                case 2:
                    hitungKelilingSegitiga();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        input.close();
    }

    public static void hitungLuasSegitiga() {
        
        double alas = 5;
        double tinggi = 8;

        // Membuat objek segitiga
        Segitiga segitiga = new Segitiga(alas, tinggi, 0);

        // Menghitung luas segitiga
        double luas = segitiga.hitungLuas();
        System.out.println("Luas segitiga: " + luas);
    }

    public static void hitungKelilingSegitiga() {
       
        double sisi = 4;

        // Membuat objek segitiga
        Segitiga segitiga = new Segitiga(0, 0, sisi);

        // Menghitung keliling segitiga
        double keliling = segitiga.hitungKeliling();
        System.out.println("Keliling segitiga: " + keliling);
    }
}
