package com.dpf.algorithm;

/**
 * 对输入字符串进行全排列，如abc   bac   bca
 */
public class Permutation {

    static class Node{
        public char value;
        public Node parent;
        public Node left;
        public Node right;

        public Node(char value) {
            this.value = value;
        }
    }

    public static void print(String line) {
        Node head = new Node(line.charAt(0));
        
        for (int i=1; i<line.length(); i++) {

        }
    }

    public static void main(String[] args) {

    }
}
