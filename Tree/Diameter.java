class Solution {
    int max = Integer.MIN_VALUE;
    public int Fun(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left = Fun(root.left);
        int right = Fun(root.right);
        
        max = Math.max(max, left+right);
        
        return Math.max(left,right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int x = Fun(root);
        return max;
    }
}
