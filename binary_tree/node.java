public class node<T extends Comparable<T>> {
	T data;
	node left;
	node right;

	public node(T data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
