package week_4.day_1;

import javax.swing.tree.TreeNode;

public class same_tree {
    class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
         return isSameTree(p.left,q.left)&& isSameTree(p.right,q.right);

    }
}
    
}
