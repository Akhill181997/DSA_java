package linkedlist;

public class LinkedListImplementation {
    private Node head; 

    public void insert(int data) {
        Node node = new Node(); 
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node; 
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void insertAt(int pos, int data) {
        Node node = new Node(); 
        node.data = data;
        node.next = null;

        if (pos == 0) {
            insertAtStart(data);
        } else {
            Node current = head;
            for (int i = 0; i < pos - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next; 
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next; 
        }
    }

    public void show() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node(); 
        node.data = data;
        node.next = head; 
        head = node;      
    }

    
    private class Node {
        int data;
        Node next;
    }
}
