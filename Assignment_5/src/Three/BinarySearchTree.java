package Three;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	Node root;

	// Method to insert a new value in the BST
	void insert(int value) {
		root = insertRec(root, value);
	}

	Node insertRec(Node root, int value) {
		// If the tree is empty, return a new node
		if (root == null) {
			root = new Node(value);
			return root;
		}

		// Otherwise, recur down the tree
		if (value < root.value) {
			root.left = insertRec(root.left, value);
		} else if (value > root.value) {
			root.right = insertRec(root.right, value);
		}

		// return the unchanged node pointer
		return root;
	}

	// Method to display the tree level-wise
	void levelOrderTraversal() {
		if (root == null) {
			return;
		}

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node current = queue.poll();
			System.out.print(current.value + " ");

			// Add left and right children to the queue
			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}
	}
}
