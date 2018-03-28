
public class BSTNode extends Element {
 private int key;
 private BSTNode right, left;

 
 public BSTNode(int k) {
	 this.key = k;
	 
	 this.right = null;
	 this.left = null;
 }
 protected void insert(int n, BSTNode obj) {
	 if(this.compareTo(n) > 0) { //this is the case if key is greater than int n
		 if(left == null)
		 {
			 left = new BSTNode(n);//if left is null then n becomes the new key to the left node
		 }else  if(this.left != null && this.left.compareTo(n) > 0) {
			 (this.left).insert(n, obj);//if left.key is greater than n then it goes through the method once again but this time "left.key" is the main key
		 }
	 }
	 if(this.compareTo(n) < 0) {//if key is less than n
		 if(this.right == null) {//if there is no right n becomes the new right
			 this.right = new BSTNode(n);
		 }else if(this.right != null && this.right.compareTo(n) > 0) {//if n is less than right it goes through the method again intill it gets inserted
			 (this.right).insert(n,obj);
		 }else if(this.right != null && this.right.compareTo(n) < 0) {//if n is greater than "right" than it goes through the method again until it goes finds the right spot to go
			 (this.right).insert(n,obj);
		 }
		 
	 }
 }
 
 protected void delete(int n) {
	 BSTNode temp;
	 if(this.key == n && this.right == null & this.left == null)
	 {
		//deletes BSTNode
	 }
	 //insert code that deletes stuff
 }
 //for this compareTo it forced me to change "int" to "Integer" in order for this to not give me an error msg but i dont know what the difference is
 public Integer compareTo(Integer n) {
		if(this.key > n) {
			return 1;
		}
		if(this.key < n) {
			return -1;
	 }
	 return 0;
}

}





 

