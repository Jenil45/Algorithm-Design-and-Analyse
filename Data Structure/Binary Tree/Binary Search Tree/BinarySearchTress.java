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
