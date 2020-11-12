/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan45.CetakNama;
import java.util.Scanner;
/**
 *
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program Cetak Nama
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Printer objPrinter = new Printer();
        Scanner input = new Scanner(System.in);
        System.out.println("=== Aplikasi Pencetak Nama ===");
        System.out.println("Masukan nama anda : ");
        objPrinter.setNama(input.nextLine());
        System.out.println("Mau cetak nama berapa kali ? : ");
        objPrinter.setJmlCetak(input.nextInt());
        objPrinter.cetak(objPrinter.getNama());
        System.out.println("Hasil Cetak :");
        objPrinter.cetak(objPrinter.getJmlCetak(), objPrinter.getNama());
        
    }
    
}
