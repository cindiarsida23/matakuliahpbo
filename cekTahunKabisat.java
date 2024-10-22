/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matakuliahpbo;

/**
 *
 * @author ROG STRIX
 */
 import java.util.Scanner;
public class cekTahunKabisat {
    public static void main(String[] args) {
        try { 
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Masukkan tahun: ");
                int tahun = scanner.nextInt();
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    System.out.println(tahun + " adalah tahun kabisat.");
                } else {
                    System.out.println(tahun + " bukan tahun kabisat.");
                }
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Masukkan angka tahun.");
        }
    }
}
    


