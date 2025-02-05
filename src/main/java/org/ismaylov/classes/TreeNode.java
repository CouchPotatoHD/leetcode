package org.ismaylov.classes;

public class TreeNode {
    public Integer val;
      public TreeNode left;
    public TreeNode right;
      public TreeNode() {}
      public TreeNode(Integer val) { this.val = val; }
      public TreeNode(Integer val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

    public static TreeNode constructTreeFromArray(Integer[] arr) {
        return constructTreeHelper(arr, 0);
    }

    private static TreeNode constructTreeHelper(Integer[] arr, int index) {
        if (index >= arr.length || arr[index] == null) {
            return null;
        }

        TreeNode root = new TreeNode(arr[index]);
        root.left = constructTreeHelper(arr, 2 * index + 1);
        root.right = constructTreeHelper(arr, 2 * index + 2);

        return root;
    }
  }