
public class q1 {
	int info;
	q1 left;
	q1 right;
	public q1(int info){
		this.info = info;
		this.left = null;
		this.right=null;
	}
	public void insert(int value) {
		if(value <= info) {
			if(left == null) {
				left = new q1(value);
			}
			else {
				left.insert(value);
			}
		}else {
			if(right == null) {
				right = new q1(value);
			}else {
				right.insert(value);
			}
		}
	}
	public void preOrderTraversal() {
		System.out.print(info +" ");
		if(left != null) {
			left.preOrderTraversal();
		}
		if(right != null) {
			right.preOrderTraversal();
		}
	}
	public void inorderTraversal() {
		if(left != null) {
			left.inorderTraversal();
		}
		System.out.print(info+" ");
		if(right != null) {
			right.inorderTraversal();
		}
	}
	public void postOrdertraversal() {
		if(left != null) {
			left.preOrderTraversal();
		}
		if(right != null) {
			right.preOrderTraversal();
		}
		System.out.print(info+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q1 root = new q1(7);
		root.insert(3);
		root.insert(17);
		root.insert(4);
		root.insert(2);
		root.insert(23);
		root.inorderTraversal();
		System.out.println();
		root.preOrderTraversal();
		System.out.println();
		root.postOrdertraversal();
	}

}