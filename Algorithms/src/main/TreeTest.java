package main;

public class TreeTest {

  public static void main(String[] args) {
    testMaxTotalDistinctValuesOnPaths();
  }

  private static void testMaxTotalDistinctValuesOnPaths() {
    TreeNode t1 = new TreeNode(1);
    TreeNode t2 = new TreeNode(3);
    TreeNode t3 = new TreeNode(2);
    TreeNode t4 = new TreeNode(1);
    TreeNode t5 = new TreeNode(5);
    TreeNode t6 = new TreeNode(6);
    TreeNode t7 = new TreeNode(7);
    TreeNode t8 = new TreeNode(7);
    TreeNode t9 = new TreeNode(1);

    t1.setLeftTree(t2);
    t1.setRightTree(t3);
    t2.setLeftTree(t4);
    t2.setRightTree(t5);
    t3.setLeftTree(t6);
    t6.setLeftTree(t7);
    t4.setLeftTree(t8);
    t6.setRightTree(t9);

    TreeAlgorithms ttc = new TreeAlgorithms();
    ttc.getMaxTotalDistinctValuesOnPaths(t1);

    System.out.println("Result maxTotalDistinctValuesOnPaths: " + ttc.getMaxTotalDistinctValuesOnPaths());
  }
}
