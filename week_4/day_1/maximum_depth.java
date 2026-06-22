package week_4.day_1;

import javax.swing.tree.TreeNode;

public class maximum_depth {
    class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;}

            int ldepth=maxDepth(root.left);
            int rdepth=maxDepth(root.right);
             
             return 1+ Math.max(ldepth,rdepth);
        
        
    }
}
    
}
