//I honestly havent touched this class at all therefore it has the least amount of code
public class BSTree {
	BSTNode root;
	
	public BSTree()
	{
		root = null;
	}
	private void balTree(int[] arr, BSTNode obj) {

	     int mid = arr.length / 2;
	     int[] temporary = new int[mid];
	     root.insert(mid);// this is the starting point of the balance tree
		for (int i = 0; i < mid; i++) {//stores the first half the array into temp and goes through balTree again
			temporary[i] = arr[i];
			if(i == mid-1) {
				balTree(temporary, root);
			}
		}
		
		for(int i = mid; i < arr.length; i++) {
			temporary[i] = arr[i];
			if(i == arr.length - 1)
				balTree(temporary,root);
		}

	}
	public void insert(int n) {
		root.insert(n);
	}
	
	public void delete(int n) {
		root.delete(n);
	}

}
