/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2_20;
import java.util.Scanner;
/**
 *
 * @author Dainty
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedListPembeli listPembeli = new DoubleLinkedListPembeli();
        DoubleLinkedListPesanan listPesanan = new DoubleLinkedListPesanan();

        // Input data pembeli by program
        listPembeli.addLast(new Pembeli("Mamluatul", "08224500000"));
        listPembeli.addLast(new Pembeli("Abyaz A.M", "08224511111"));
        listPembeli.addLast(new Pembeli("Yoshinoya2", "08224522222"));

        mainLoop : while (true) {
            System.out.println();
            System.out.println("========= QUIZ 2 PRAKTIKUM ASD TI - 1B =========");
            System.out.println("Dibuat oleh : Rr. Denti Nurramadhona");
            System.out.println("NIM : 2141720250");
            System.out.println("Absen : 20");
            System.out.println("==================================================");
            System.out.println("Sistem Antrian Resto Royal Delish");
            printMenu();
            System.out.print("Pilih(1-6) : ");
            int pilihan = scan.nextInt(); scan.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("----------------------------------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("----------------------------------------------");
                    System.out.println("Nomor Antrian : " + (listPembeli.size + 1));
                    System.out.print("Nama Customer : ");
                    String nama = scan.nextLine();
                    System.out.print("No. HP : ");
                    String noHp = scan.nextLine();
                    listPembeli.addLast(new Pembeli(nama, noHp));
                    break;
                case 2:
                    listPembeli.print();
                    break;
                case 3:
                    System.out.println("----------------------------------------------");
                    System.out.println("Transaksi input pesanan");
                    System.out.println("----------------------------------------------");
                    listPembeli.removeFirst();
                    System.out.println("Nomor Pesanan : " + (listPesanan.size + 1));
                    System.out.print("Pesanan : ");
                    String pesanan = scan.nextLine();
                    System.out.print("Harga : ");
                    int harga = scan.nextInt(); scan.nextLine();
                    listPesanan.addLast(new Pesanan(listPesanan.size + 1, pesanan, harga));
                    listPesanan.print();
                    break;
                case 4:
                    listPesanan.printSortByName();
                    break;
                case 5:
                    listPesanan.printSum();
                    break;
                case 6:
                    break mainLoop;

            }
        }
        scan.close();
    }

    static void printMenu() {
        System.out.println("Menu");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurutan pesanan by nama");
        System.out.println("5. Hitung total Pendapatan");
        System.out.println("6. Keluar");
    }
}
