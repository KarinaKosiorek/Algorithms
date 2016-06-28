package main;

public class TreeAlgorithms {

  int maxTotalDistinctValuesOnPaths = 0;
  final int N = 50000;
  int tab[] = new int[N];
  int totalDistinctValuesOnPaths = 0;

  public int getMaxTotalDistinctValuesOnPaths(TreeNode root) {
    preorder(root);
    return maxTotalDistinctValuesOnPaths;
  }

  public void preorder(TreeNode root) {
    if (root != null) {
      tab[root.x]++;
      if (tab[root.x] == 1) {
        totalDistinctValuesOnPaths++;
        if (totalDistinctValuesOnPaths > maxTotalDistinctValuesOnPaths) {
          maxTotalDistinctValuesOnPaths = totalDistinctValuesOnPaths;
        }
      }
      preorder(root.left);
      preorder(root.right);
      tab[root.x]--;
      if (tab[root.x] == 0) {
        totalDistinctValuesOnPaths--;
      }
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
