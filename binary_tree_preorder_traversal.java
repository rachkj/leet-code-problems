/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root==null) return list;

        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode cur =stack.pop();
            list.add(cur.val);

            if(cur.right!=null){
                stack.add(cur.right);
            }
            if(cur.left!=null){
                stack.add(cur.left);
            }
        }
        return list;
    }
}
