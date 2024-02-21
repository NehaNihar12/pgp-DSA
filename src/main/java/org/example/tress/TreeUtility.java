package org.example.tress;

import java.util.HashSet;

public class TreeUtility {
    public Node insert(Node root,int key){
        if(root == null ){
            return new Node(key);
        }
        if(key <root.data){
            root.left = insert(root.left,key);
        }else{
            root.right = insert(root.right,key);
        }
        return root;
    }

    public void findPair(Node root, int sum){
        HashSet<Integer> set = new HashSet<Integer>();
        if(!findPairUntil(root,sum,set)){
            System.out.println("No such pair");
        }
    }
    public boolean findPairUntil(Node root,int sum, HashSet<Integer> set){
        if(root == null){
            return false;
        }
        if(set.contains((sum-root.data))){
            System.out.println(root.data+" "+(sum-root.data));
            return true;
        }
        set.add(root.data);
        findPair(root.left,sum);
        return true;
    }

    public Node deleteRecursive(Node root, int key){
        if(root == null){
            return root;
        }
        if(key == root.data){

            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRecursive(root.right, root.data);

        }else if(key< root.data){
            root.left = deleteRecursive(root.left,key);
            return root;
        }else{
            root.right = deleteRecursive(root.right,key);
            return root;
        }
        return root;

    }
    int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);

    }
    public void postOrder(Node root){
        if(root==null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
}
