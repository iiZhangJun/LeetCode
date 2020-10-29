package com.tanxin;

public class Leetcode129 {

    StringBuilder sb = new StringBuilder();
    int sum = 0;

    public int sumNumbers(TreeNode root) {
        helper(root);
        return sum;
    }

    public void helper(TreeNode root) {
        if(root == null) return ;
        sb.append(root.val);
        if (root.left==null && root.right==null){
            sum += Integer.parseInt(sb.toString());
            return;
        }
        if (root.left!=null){
            sumNumbers(root.left);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (root.right!=null){
            sumNumbers(root.right);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(5);
        root.right = node1;
        Leetcode129 lc = new Leetcode129();
        int ans = lc.sumNumbers(root);
        System.out.println(ans);
    }

    static class TreeNode{
        int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }
}

