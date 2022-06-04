/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2_20;

/**
 *
 * @author Dainty
 */
public class DoubleLinkedListPembeli {
    Nodecust_20 head, tail;
    public int size;

    public DoubleLinkedListPembeli() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private void addFirst(Pembeli item) {
        if (isEmpty()) {
            head = new Nodecust_20(null, item, null);
            tail = head;
        } else {
            Nodecust_20 newNode = new Nodecust_20(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Pembeli item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Nodecust_20 newNode = new Nodecust_20(tail, item, null);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public Pembeli removeFirst() {
        if (!isEmpty()) {
            Pembeli item = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            size--;
            return item;
        } else {
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            Nodecust_20 current = head;
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("Daftar Antrian Resto Royal Delish");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama Customer\t\t|No hp");
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
            System.out.println("Total Antrian : " + size);
        } else {
            System.out.println("List masih kosong");
        }
    }
}
