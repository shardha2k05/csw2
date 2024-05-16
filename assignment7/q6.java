
class TreeNode1 {
    int data;
    TreeNode1 left, right;

    public TreeNode1(int data) {
        this.data = data;
        left = right = null;
    }
}
public class q6 {
     TreeNode1 root;
     
     boolean isBST() {
    	 return isBST1(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    			 
     }
     boolean isBST1(TreeNode1 node,int min,int max) {
    	 if(node==null)
    		 return true;
     
     if(node.data<=min||node.data>=max) 
    	 return false; 
    	 
     return isBST1(node.left,min,node.data) && isBST1(node.right,node.data,max);
     }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   q6 tree=new q6();
   tree.root=new TreeNode1(7);
   tree.root=new TreeNode1(5);
   tree.root=new TreeNode1(2);
   tree.root=new TreeNode1(3);
   tree.root=new TreeNode1(14);
   tree.root=new TreeNode1(18);
   
   if(tree.isBST()) {
	   System.out.println("The given binary tree is a binary search tree");
   }
   else {
	   System.out.println("The given binary tree is not a binary search tree");
   }
	}

}
