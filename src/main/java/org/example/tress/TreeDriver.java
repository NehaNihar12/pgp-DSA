package org.example.tress;

import java.net.SocketOption;

public class TreeDriver {
    public static void main(String[] args){
        Node root = null;
        TreeUtility utility = new TreeUtility();
        root = utility.insert(root,40);
        /*
        1. check if root is null
           if null create the node and return
           and if not null check the value we're inserting
           if value>root data, insert into right
           else insert into left
        * */
        root=utility.insert(root,20);
        root=utility.insert(root,60);
        root=utility.insert(root,10);
        root=utility.insert(root,30);
        root=utility.insert(root,50);
        root=utility.insert(root,70);
        System.out.println("inorder traversal: ");
        utility.inOrder(root);
        System.out.println();
        System.out.println("preorder traversal: ");
        utility.preOrder(root);
        System.out.println();
        System.out.println("postorder traversal: ");
        utility.postOrder(root);
        System.out.println();
//        root = utility.deleteRecursive(root,10);
//        System.out.println("deleted 50: ");
//        utility.postOrder(root);
        utility.findPair(root,80);

    }
}
