package com.dpf.binarytree;

import com.dpf.binarytree.pojo.TreeNode;

public class BuildTree {
    public static TreeNode build() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.setLeft(node2);
        node1.setRight(node3);
        TreeNode node4 = new TreeNode(4);
        node2.setRight(node4);
        return node1;
    }

}
