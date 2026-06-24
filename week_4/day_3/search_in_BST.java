package week_4.day_3;

import javax.swing.tree.TreeNode;

public class search_in_BST {
    class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null || root.val==val){
            return root;
        }
        if(val<root.val){
            return searchBST(root.left,val);
        }
        
        return searchBST(root.right,val);   
    }
}
    
}
