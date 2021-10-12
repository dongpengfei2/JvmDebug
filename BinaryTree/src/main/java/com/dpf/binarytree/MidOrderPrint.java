package com.dpf.binarytree;

import com.dpf.binarytree.pojo.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 中序遍历
 */
public class MidOrderPrint {

    //递归方式
    public static List<TreeNode> recursion(List<TreeNode> nodeList) {
        List<TreeNode> childNodeList = new ArrayList<>();
        for (TreeNode node : nodeList) {
            if (node.getLeft()!=null) {
                childNodeList.add(node.getLeft());
            }
            if (node.getRight()!=null) {
                childNodeList.add(node.getRight());
            }
        }
        if (!childNodeList.isEmpty()) {
            childNodeList.addAll(recursion(childNodeList));
        }
        return childNodeList;
    }

    //队列方式
    public static List<TreeNode> queue(TreeNode root) {
        List<TreeNode> nodeList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        nodeList.add(root);
        if (root.getLeft()!=null) {
            queue.add(root.getLeft());
        }
        if (root.getRight()!=null) {
            queue.add(root.getRight());
        }
        while (!queue.isEmpty() && queue.element()!=null) {
            final TreeNode node = queue.poll();
            nodeList.add(node);
            if (node.getLeft()!=null) {
                queue.add(node.getLeft());
            }
            if (node.getRight()!=null) {
                queue.add(node.getRight());
            }
        }
        return nodeList;
    }

    public static void main(String[] args) {
        final TreeNode rootNode = BuildTree.build();
//        List<TreeNode> nodeList = new ArrayList<>();
//        nodeList.add(rootNode);
//        nodeList.addAll(recursion(nodeList));
        List<TreeNode> nodeList = queue(rootNode);
        for (TreeNode node : nodeList) {
            System.out.println(node.getVal());
        }
    }
}
