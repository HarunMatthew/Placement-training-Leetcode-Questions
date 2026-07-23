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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,targetSum,root,new ArrayList<>());
        return result;
    }
    private void backtrack(List<List<Integer>> result,int targetSum,TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        targetSum=targetSum-root.val;
        if(root.left==null && root.right==null && targetSum==0)
        {
            result.add(new ArrayList<>(list));
            
        }
        
        backtrack(result,targetSum,root.left,list);
        backtrack(result,targetSum,root.right,list);
        list.remove(list.size()-1);
    }
}