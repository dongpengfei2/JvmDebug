package com.dpf.algorithm;

import com.dpf.algorithm.pojo.TreeNode;
import java.util.Stack;

/**
 * 中序遍历
 */
public class InOrderTraversal {

    //递归方式
    public static void recursion(TreeNode node) {
        if (node!=null) {
            recursion(node.getLeft());
            System.out.println(node.getVal());
            recursion(node.getRight());
        }
    }

    //基于栈
    public static void stack(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty()){//只要当前节点不为空(即当前节点的左右子树没有访问完毕)或者栈中还有节点(还有节点没有访问)
            while(root != null){
                stack.push(root);//根节点入栈
                root = root.getLeft();//访问左子树
            }
            root = stack.pop();//取出左子树的根节点
            System.out.println(root.getVal());//打印根节点
            root = root.getRight();//访问右子树
        }
    }

    public static void main(String[] args) {
        TreeNode root = BuildTree.build();
        stack(root);
    }
}
