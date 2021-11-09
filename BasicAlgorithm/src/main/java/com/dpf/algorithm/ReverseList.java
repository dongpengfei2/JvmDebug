package com.dpf.algorithm;

public class ReverseList {

    static class Node{
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node reverse(Node head) {
        Node preNode = null;
        Node curNode = head;
        while (curNode != null) {
            Node tempNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = tempNode;
        }

        return preNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(3);
        n2.next = n3;

        Node head = reverse(n1);
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}
