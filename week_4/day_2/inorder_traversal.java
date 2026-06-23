package week_4.day_2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class inorder_traversal {
    lass Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        return ans;

    }
    private void inorder(TreeNode root,List<Integer> ans){
        if(root ==null) return;

        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}
    
}
