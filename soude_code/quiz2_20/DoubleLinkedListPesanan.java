/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2_20;

/**
 *
 * @author Dainty
 */
public class DoubleLinkedListPesanan {
    Node_20 head, tail;
    public int size;

    public DoubleLinkedListPesanan() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private void addFirst(Pesanan item) {
        if (isEmpty()) {
            head = new Node_20(null, item, null);
            tail = head;
        } else {
            Node_20 newNode = new Node_20(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Pesanan item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node_20 newNode = new Node_20(tail, item, null);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public Pesanan removeFirst() {
        if (!isEmpty()) {
            Pesanan item = head.data;
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
            Node_20 current = head;
            System.out.println("+++++++++++++++++++++++++++++++");
            System.out.println("Daftar Pesanan Resto Royal Delish");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama Pesanan\t\t|Harga");
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        } else {
            System.out.println("List masih kosong");
        }
    }

    public void printSortByName() {
        if (!isEmpty()) {
            Node_20 current = head;
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Pesanan Resto Royal Delish");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama Pesanan\t\t|Harga");
            int i = 0;
            while (i < size) {
                int j = i + 1;
                while (j < size) {
                    if (current.data.namaPesanan.charAt(0) < current.next.data.namaPesanan.charAt(0)) {
                        Pesanan temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;
                    }
                    current = current.next;
                    j++;
                }
                current = head;
                i++;
            }
        } else {
            System.out.println("List masih kosong");
        }
    }

    public void printSum() {
        if (!isEmpty()) {
            Node_20 current = head;
            int sum = 0;
            while (current != null) {
                sum += current.data.harga;
                current = current.next;
            }
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("TOTAL PENDAPATAN");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("Pendapatan hari ini : " + sum);
        } else {
            System.out.println("List masih kosong");
        }
    }
}
