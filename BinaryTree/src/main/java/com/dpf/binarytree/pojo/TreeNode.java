package com.dpf.binarytree.pojo;

import lombok.Data;

@Data
public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
