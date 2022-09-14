package com.gecg;
import java.util.*;
/*
    we mostly use this trees in searching
    Normally in binary tree if we search an element then it takes O(n) time
    but in this binary search tree case it will be takes O(height of tree) time
    Height of tree = log n        where n = no. of node

    BST properties :
    (i) It follows all properties of binary trees.
    (ii) Left subtree Node < root.
    (iii) Right subtree Node > root.
    (iv) Left & Right subtrees are also BST with no duplicates.

    Special properties :
    Inorder traversal of BST gives us a sorted sequence

    BST search :
    We do binary search algorithm to search it (In actual we compare our key with the middle element
    but here we compare  it with our root element

    **Important :-
    Most of the problem of BST are solved by recursion
    i.e., by dividing the problem into sub problems  & making recursive calls on subtrees
 */



public class BinarySearchTress {
    static class NodeBST
    {
        int data;
        NodeBST left;
        NodeBST right;

        NodeBST(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }
    
    public static NodeBST insert(NodeBST root, int data) {
        if (root==null)
        {
            root = new NodeBST(data);
//            System.out.println("Inserted element : " + root.data);
            return root;
        }

        if (root.data > data)
        {
//            System.out.println("Go to left");
            root.left = insert(root.left , data);
        }
        else
        {
//            System.out.println("Go to right");
            root.right = insert(root.right , data);
        }
        return root;
    }
    
     public static void inorderBST(NodeBST root)
    {
        if (root == null)
        {
            return;
        }

        inorderBST(root.left);
        System.out.print(root.data  + " ");
        inorderBST(root.right);
    }
    // search in bst
    public static boolean searchBST(NodeBST root , int key)
    {

        if (root == null)
        {
            return false;
        }
        if (root.data == key)
        {
            return true;
        }

        else if (root.data > key)
        {
            return searchBST(root.left , key);
        }

        else
        {
            return searchBST(root.right , key);
        }
    }

     /*
        Three cases for Delete Node
        (i) Leaf node                        delete and set as null to it
        (ii) One child                       delete and replace with children
        (iii) Two children                   delete and replace with inorder successor
        inorder successor in BST is left most in right subtree
        inorder successor always hve 0 or 1 child
     */

    public static NodeBST deleteNode(NodeBST root , int key)
    {
        if (root.data > key)
        {
            root.left = deleteNode(root.left , key);
        }

        else if (root.data < key)
        {
            root.right = deleteNode(root.right , key);
        }
        else
        {
            // root.data == key
            // case 1 : leaf node delete
            if (root.left == null && root.right == null)
            {
                return null;
            }

            // case 2 : one child
            if (root.left == null)
            {
                return root.right;
            }
            else if (root.right == null)
            {
                return root.left;
            }

            // case 3 :
            NodeBST inorderS = inorderSuccessor(root.right);
            root.data = inorderS.data;
            root.right = deleteNode(root.right ,inorderS.data);
        }
        return root;
    }

    public static NodeBST inorderSuccessor(NodeBST root)
    {
        while (root.left != null)
        {
            root = root.left;
        }
        return root;
    }

    // print number which are in range
    public static void printRange(int x , int y , NodeBST root)
    {
        if (root==null)
        {
            return;
        }
        if (root.data >= x && root.data <= y )
        {
            printRange(x , y , root.left);
            System.out.println("The element between " + x + " and " + y + " is " + root.data);
            printRange(x , y , root.right);
        }
        else if (y <= root.data)
        {
            printRange(x , y , root.left);
        }
        else
        {
            printRange(x , y , root.right);
        }
    }

    // printing all root to leaf paths
    // we use arraylist to store all paths of it
    public static void leafPath(NodeBST root , ArrayList<Integer> path)
    {
        if (root==null)
        {
            return;
        }
        path.add(root.data);

        if (root.left == null && root.right == null)
        {
            printPath(path);
        }
        else
        {
            leafPath(root.left , path);
            leafPath(root.right , path);
        }

        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path)
    {
        System.out.print("Path i is : ");
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println("");
    }
