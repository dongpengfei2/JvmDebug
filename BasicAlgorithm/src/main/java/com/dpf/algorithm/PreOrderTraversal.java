package com.dpf.algorithm;

import com.dpf.algorithm.pojo.TreeNode;

import java.util.Stack;

/**
 * 先序遍历
 */
public class PreOrderTraversal {

    //递归方式
    public static void recursion(TreeNode node) {
        if (node!=null) {
            System.out.println(node.getVal());
            recursion(node.getLeft());
            recursion(node.getRight());
        }
    }

    //基于栈
    public static void stack(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();//用一个栈来存放树中的节点
        while(root != null || !stack.isEmpty()) {//只要当前节点不为空(即当前节点的左右子树没有访问完毕)或者栈中还有节点(还有节点没有访问)
            while (root != null) {//一直往左走
                stack.push(root);//根节点入栈
                System.out.println(root.getVal());//打印根节点
                root = root.getLeft();//访问左子树
            }
            root = stack.pop();//取出根节点
            root = root.getRight();//访问右子树
        }
    }

    public static void main(String[] args) {
        TreeNode root = BuildTree.build();
        stack(root);
    }
}
