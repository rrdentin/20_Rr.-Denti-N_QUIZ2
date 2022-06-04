/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2_20;

/**
 *
 * @author Dainty
 */
public class Pesanan {
    int kodePesanan, harga;
    String namaPesanan;
    
    public Pesanan(int a, String b, int d){
        this.kodePesanan = a;
        this.namaPesanan = b;
        this.harga = d;
    }
    
    public String toString() {
        return String.format("|%d\t|%s\t\t|%d", kodePesanan, namaPesanan, harga);
    }
}
