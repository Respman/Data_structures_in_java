public class binarytree <T extends Comparable<T>> {
	node root;
	int count;

	public binarytree(){
		root = null;
		count = 0;
	}
	
	int amnt;

	private void printTreeLev(node<T> node, int lev, int in){
		if ((node != null) && (lev <= in)){
			lev++;
			printTreeLev(node.left, lev, in);
//			System.out.print(node.data.toString());
//			System.out.println(" ");
			amnt++;
			printTreeLev(node.right, lev, in);
		}
	}

	public int printLev(int in) {
		int lev = 0;
		amnt = 0;
		if (this.root != null){
			printTreeLev(this.root, lev, in);
		} else {
			System.out.println("Пустое дерево");
		}
		return(amnt);
	}

	private boolean findTo(node<T> node, T data){
		if (node != null){
			if (node.data == data){
				return(true);
			}else if (findTo(node.left, data)){
				return(true);
			}else if (findTo(node.right, data)){
				return(true);
			}else {
				return(false);
		}
		}else{
			return(false);
		}
	}

	public boolean find(T data){
		if (this.root != null){
			return(findTo(this.root, data));
		}else{
			return(false);
		}
	}

	public void add (T data){
		if(this.root == null){
			root = new node(data);
			count++;
		} else {
			AddTo(this.root, data);
		}
	}
	
	private void copyTo (node<T> node_to, node<T> node_from){
		if (node_from.left != null){
			node_to.left = new node(node_from.left.data);
			copyTo(node_to.left, node_from.left);
		}
		if (node_from.right != null){
			node_to.right = new node(node_from.right.data);
			copyTo(node_to.right, node_from.right);
		}

	}

	public void copy (binarytree<T> br){
		this.root = new node(br.root.data);
		if (br.root.left != null){
			this.root.left = new node(br.root.left.data);
			copyTo(this.root.left, br.root.left);
		}
		if (br.root.right != null){
			this.root.right = new node(br.root.right.data);
			copyTo(this.root.right, br.root.right);
		}
	}

	private void AddTo(node<T> node, T data){
		if (data.compareTo(node.data)<0){
			if (node.left == null){
				node.left = new node(data);
				count++;
			} else {
				AddTo(node.left, data);
			} 
		} else if (data.compareTo(node.data)>0){
			if (node.right == null){
				node.right = new node(data);
				count++;
			} else {
				AddTo(node.right, data);
			}
		} else {
			System.out.println("Данные есть в дереве");

			node<T> node1 = node.left;
			while (node.right != null) {
				node1 = node1.right;
			}
			node1.right = new node(data);
		}
	}

	private void print_btr(node<T> node){
		if (node != null){
			print_btr(node.left);
			System.out.print(node.data.toString());
			System.out.println(" ");
			print_btr(node.right);
		}
	}

	public void print() {
		if (this.root != null){
			print_btr(this.root);
		} else {
			System.out.println("Пустое дерево");
		}
	}
}

