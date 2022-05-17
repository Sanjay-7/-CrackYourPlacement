class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null)  return true;
        if(root == null || subRoot == null) return false;
	
        boolean isSame = isSame(root, subRoot);
        return isSame ? true : (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
    }
    
    public boolean isSame(TreeNode n1, TreeNode n2) {
        if(n1 == null && n2 == null)  return true;
        if(n1 == null || n2 == null) return false;
        if(n1.val != n2.val) return false;
        return isSame(n1.left, n2.left) && isSame(n1.right, n2.right);
    }
}
