/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter[] = new int [1];
        height(diameter,root);
        return diameter[0];
    }
    public int height(int diameter[], TreeNode node){
        if(node == null){
            return 0;
        }
        int lh = height(diameter, node.left);
        int rh = height(diameter, node.right);
        diameter[0] = Math.max(diameter[0],lh+rh);
        return 1+Math.max(lh,rh);
    }
    
}