/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class lca {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        ArrayList<TreeNode> a1 = lca(root,p);
        ArrayList<TreeNode> a2 = lca(root,q);
        
        for(TreeNode node:a1){
            System.out.print(node.val+" ");
        }
        System.out.println();
        for(TreeNode node:a2){
            System.out.print(node.val+" ");
        }
        int k = 0;
        int i=a1.size()-1,j=a2.size()-1;
        while( i>=0 && j>=0){
            if(a1.get(i) == a2.get(j)){
                k=i;
                
            }
            else{
                break;
            }
            i--;
            j--;
        }
        
        
        
        return a1.get(k);
        
    }
    
    public static ArrayList<TreeNode> lca(TreeNode root, TreeNode p){
        
        
        if(root == null){
            return new ArrayList<>();
        }
        if(root == p){
            ArrayList<TreeNode> base = new ArrayList<>();
            base.add(root);
            return base;
        }
        
        ArrayList<TreeNode> left = lca(root.left,p);
        if(left.size()>0){
            left.add(root);
            return left;
        }
        ArrayList<TreeNode> right = lca(root.right,p);
        if(right.size()>0){
            right.add(root);
            return right;
        }
        
        return new ArrayList<>();
    }
}
