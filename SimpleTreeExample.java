class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Method to insert a new node with a given key
    public void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in the binary tree
    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // Method to perform an in-order traversal of the tree
    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public void postOrderTraversal(Node root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print in-order traversal
        System.out.println("In-order traversal:");
        tree.inOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Pre-order traversal:");
        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Post-order traversal:");
        tree.postOrderTraversal(tree.root);
    }
}
