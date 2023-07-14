package org.data.tree;

public class Tree {
    // insert into tree if node value is small than current value  insert on right side
    // insert into tree if node value is larger  than current value  insert on left side

    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println(" Inserted " + value + " to left of " + node.value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + node.value);
                node.right = new Node(value);
            }
        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public void preorder(Node node){
        if (node == null)
            return;

        // First print data of node
        System.out.print(node.value + " ");

        // Then recur on left subtree
        preorder(node.left);

        // Now recur on right subtree
        preorder(node.right);
    }

    public void inorder(Node node){
        if (node == null)
            return;
        // Then recur on left subtree
        inorder(node.left);
        System.out.print(node.value + " ");
        // Now recur on right subtree
        inorder(node.right);
    }


    public void postorder(Node node){
        if (node == null)
            return;
        // Then recur on left subtree
        postorder(node.left);

        // Now recur on right subtree
        postorder(node.right);

        System.out.print(node.value + " ");
    }
    public static void main(String args[])
    {
        Tree tree = new Tree();
        Node root = new Node(5);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 7);
        tree.insert(root, 3);
        tree.insert(root, 9);
        System.out.println("Traversing tree in order");;
        System.out.println("Traversing tree in preorder");;
        tree.preorder(root);
        System.out.println("Traversing tree in inorder");;
        tree.inorder(root);
        System.out.println("Traversing tree in postorder");;
        tree.postorder(root);

    }

}
