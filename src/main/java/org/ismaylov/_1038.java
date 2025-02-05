package org.ismaylov;

import org.ismaylov.classes.TreeNode;

public class _1038 {

    int sum = 0;

    public TreeNode bstToGst(TreeNode root) {

        if (root != null) {
            bstToGst(root.right);
            sum += root.val;
            root.val = sum;
            bstToGst(root.left);
        }
        return root;
    }

}
