
public class BSTNode extends Element {
	private int key;
	private BSTNode right, left;
	
	//default constructor
	public BSTNode() {
		this.key = 0;
		this.left = null;
		this.right = null;
	}
	//constructor
	public BSTNode(int k) {
		this.key = k;

		this.right = null;
		this.left = null;
	}
	
	//setter
	public void setLeft(BSTNode n) {
		this.left = null;
	}
	
	public void setRight(BSTNode n) {
		this.right = null;
	}
	
	public void setKey(int k) {
		this.key = k;
	}
	
	//getters
	public BSTNode getLeft() {
		return this.left;
	}
	
	public BSTNode getRight() {
		return this.right;
	}
	
	public int getKey() {
		return this.key;
	}
	




	// for this compareTo it forced me to change "int" to "Integer" in order for
	// this to not give me an error msg but i dont know what the difference is
	public Integer compareTo(Integer n) {
		if (this.key > n) {
			return 1;
		}
		if (this.key < n) {
			return -1;
		}
		return 0;
	}

}
