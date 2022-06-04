/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2_20;

/**
 *
 * @author Dainty
 */
public class Node_20 {
    Pesanan data;
    Node_20 prev, next;
    
    Node_20(Node_20 prev, Pesanan data, Node_20 next){
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}
