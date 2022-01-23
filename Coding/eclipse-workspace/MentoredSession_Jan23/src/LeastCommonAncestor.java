import java.util.ArrayList;
import java.util.List;

public class LeastCommonAncestor {

	Node root;
	List<Integer> path1 = new ArrayList<Integer>();
	List<Integer> path2 = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeastCommonAncestor tree = new LeastCommonAncestor();
		
		//hard code the values
		tree.root = new Node(10);
		
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		
		tree.root.right.left = new Node(60);
		tree.root.right.right = new Node(70);
		
		System.out.println("Least Common Ancestor (20, 30): " + tree.findLeastCommonAncestor(20, 30));
	}

	private int findLeastCommonAncestor(int node1, int node2) {
		
		//clear the lists == empty the lists
		path1.clear();
		path2.clear();
		
		return findLCAInternal(root, node1, node2);

	}

	private int findLCAInternal(Node root2, int node1, int node2) {
		if(!findPath(root, node1, path1) || !findPath(root, node2, path2)) {
			System.out.println((path1.size() > 0 ? "Node1 is present " : "Node1 is missing"));
			System.out.println((path2.size() > 0 ? "Node2 is present " : "Node2 is missing"));
			return -1;
		}
		
		int i=0;
		for(i=0; i<path1.size() && i<path2.size(); i++) {
			if(!path1.get(i).equals(path2.get(i))) {
				break;
			}
		}
		
		return path1.get(i-1);
		
	}

	private boolean findPath(Node root, int key, List<Integer> path) {
		if(root == null) {
			return false;
		}
		
		path.add(root.data);
		
		if(root.data == key) {
			return true;
		}
		
		if(root.left != null && findPath(root.left, key, path)) {
			return true;
		}
		
		if(root.right != null && findPath(root.right, key, path)) {
			return true;
		}
		
		path.remove(path.size() - 1);
		
		return false;
	}
}
