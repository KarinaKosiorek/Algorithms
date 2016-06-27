package main;

import java.util.Arrays;
import java.util.HashSet;

public class TreeAlgorithms {

  int maxTotalDistinctValuesOnPaths = 0;

  public int getMaxTotalDistinctValuesOnPaths(TreeNode root) {
    if (root != null) {
      HashSet<Integer> currentSet = new HashSet<Integer>();
      preorder(root, currentSet);
    }
    return maxTotalDistinctValuesOnPaths;
  }

  public void preorder(TreeNode root, HashSet<Integer> currentSet) {
    if (root != null) {
      currentSet.add(root.x);
      System.out.println(root.x);

      if (root.left == null && root.right == null) {
        if (currentSet.size() > maxTotalDistinctValuesOnPaths) {
          maxTotalDistinctValuesOnPaths = currentSet.size();
        }
        System.out.println("Distinct values on path: " + Arrays.toString(currentSet.toArray()));
      }

      HashSet<Integer> hashSetLeft = new HashSet<Integer>();
      hashSetLeft.addAll(currentSet);
      preorder(root.left, hashSetLeft);

      HashSet<Integer> hashSetRight = new HashSet<Integer>();
      hashSetRight.addAll(currentSet);
      preorder(root.right, hashSetRight);
    }
  }

  public int getMaxTotalDistinctValuesOnPaths() {
    return maxTotalDistinctValuesOnPaths;
  }

}

class TreeNode {
  int x;
  TreeNode left;
  TreeNode right;

  public TreeNode(int x) {
    this.x = x;
  }

  public void setLeftTree(TreeNode treeNode) {
    this.left = treeNode;
  }

  public void setRightTree(TreeNode treeNode) {
    this.right = treeNode;
  }
}
