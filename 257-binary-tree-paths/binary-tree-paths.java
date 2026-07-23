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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        height(root,"",list);
        return list;
    }
    private void height(TreeNode root,String path,List<String> list){
        if(root==null){
            return;
        }
        if(path.isEmpty()){
            path=String.valueOf(root.val);
        }
        else{
            path=path+"->"+root.val;
        }
        if(root.left==null && root.right==null){
            list.add(path);
            return;
        }
        height(root.left,path,list);
        height(root.right,path,list);
    }
}