    public static boolean areIdentical(TreeNode root1, TreeNode root2) {
        // Base cases: if both roots are null, they are identical
        if (root1 == null && root2 == null) {
            return true;
        }

        // If one of the roots is null and the other is not, they are not identical
        if (root1 == null || root2 == null) {
            return false;
        }

        // Check if the current nodes have the same value
        if (root1.val != root2.val) {
            return false;
        }

        // Recursively check the left and right subtrees
        return areIdentical(root1.left, root2.left) && areIdentical(root1.right, root2.right);
    }
