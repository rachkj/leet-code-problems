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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list =new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root==null)return list;

        stack.add(root);

        while(!stack.isEmpty()){
            TreeNode cur=stack.pop();
            list.addFirst(cur.val);

            if(cur.left!=null){
                stack.add(cur.left);
            }
            if(cur.right!=null){
                stack.add(cur.right);
            }

        }
        return list;

    }
}
