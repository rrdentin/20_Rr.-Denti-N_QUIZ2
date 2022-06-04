/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2_20;

/**
 *
 * @author Dainty
 */
public class Nodecust_20 {
    Pembeli data;
    Nodecust_20 prev, next;
    
    Nodecust_20(Nodecust_20 prev, Pembeli data, Nodecust_20 next){
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}
