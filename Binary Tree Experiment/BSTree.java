
public class BSTree {
	private BSTNode root;
	
	
	
	//constructor
	public BSTree()
	{
		root = null;
	}
	
	public boolean emptyRoot() {//checks if the root is empty or not
		if(root == null) {
			return true;
		}
		return false;
	}
	

	//insertion methods
	public void insert(int k) {
		root = insert(root,k);
	}
	
		
	
	private BSTNode insert(BSTNode n, int k) {
		if(n == null) {
			n = new BSTNode(k);
		}
		else if(n.compareTo(k) > 0) {//this is the case when n is greater than k
			n.setLeft(insert(n.getLeft(), k));
		}
		else if(n.compareTo(k) < 0) {
			n.setRight(insert(n.getRight(), k));
		}
		
			return n;
	}
	
	
	
	
/*	private void balTree(int[] arr,BSTNode obj) {

		int mid = arr.length / 2;
		int[] temporary = new int[mid];
		root.insert(mid,root);// this is the starting point of the balance tree

		for (int i = 0; i < mid; i++) {
			temporary[i] = arr[i];
			if(i == mid-1) {
				balTree(temporary,root);
			}
		}
		
		for(int i = mid; i < arr.length; i++) {
			temporary[i] = arr[i];
			if(i == arr.length - 1)
				balTree(temporary,root);
		}

	}
*/
	private void randTree() {

	}
	
	
	
	
	
	
	
	
	public void delete(int n) {
		
		root = delete(n,root);
	}
	
	private BSTNode delete(int k, BSTNode n) {
		//delete code
		return;
	}

}
