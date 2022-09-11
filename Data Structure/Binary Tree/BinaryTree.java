package com.gecg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class BinaryTree {
  
      static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // build a binary tree using a preorder
    static  class BuildBinaryTree
    {
        int idx = -1;

        public Node buildTree(int nodes[] )
        {
            // index to iterate over a nodes array
            idx++;
            if (nodes[idx] == -1)
            {
                return null;
            }

            // every iteration we create a new node with the data of that node index value
            Node newNode = new Node(nodes[idx]);
            // after every root creation we store pur new node to left subtree
            newNode.left = buildTree(nodes);
            // then we add it to right subtree
            newNode.right = buildTree(nodes);
            // at the last we return a newNode which is root
            return newNode;
        }
    }
  
      public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6 ,-1 ,-1};
        System.out.println("Binary Tree : ");
        BuildBinaryTree tree = new BuildBinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Root Element : "+root.data);
        System.out.print("Preorder : ");
        preorder(root);
        System.out.print("\nInorder : ");
        inorder(root);
        System.out.print("\nPostorder : ");
        postorder(root);
        System.out.print("\nLevelOrder : \n");
        levelorder(root);
        System.out.println("The count of node : " + countOfNode((root)));
        System.out.println("The sum of node : " + sumOfNodes((root)));
        System.out.println("The height of tree is : " + heightOfTree((root)));
        System.out.println("The diameter of tree is : " + diameterOfTree((root)));
        System.out.println("The diameter of tree from second approach is : " + diameter2(root).diameter);
        System.out.println(tree.idx);

        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Binary SubTree : ");
        int subnode[] = {2,4,-1,-1,5,-1,-1 };
        BuildBinaryTree subtree = new BuildBinaryTree();
        Node subRoot = subtree.buildTree(subnode);
        System.out.println("Root Element : "+subRoot.data);
        System.out.print("Preorder : ");
        preorder(subRoot);
        System.out.print("\nInorder : ");
        inorder(subRoot);
        System.out.print("\nPostorder : ");
        postorder(subRoot);
        System.out.print("\nLevelOrder : \n");
        levelorder(subRoot);
        System.out.println("The count of node : " + countOfNode((subRoot)));
        System.out.println("The sum of node : " + sumOfNodes((subRoot)));
        System.out.println("The height of tree is : " + heightOfTree((subRoot)));
        System.out.println("The diameter of tree is : " + diameterOfTree((subRoot)));
        System.out.println("The diameter of tree from second approach is : " + diameter2(subRoot).diameter);
        System.out.println("The node1 is subtree of nodes is : " + isSubtreeExist(root , subRoot));

        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Binary SubTree 1 : ");
        int subnode1[] = {1,2,4,-1,-1,5,-1,-1,8,-1,-1};
        BuildBinaryTree subtree1 = new BuildBinaryTree();
        Node subRoot1 = subtree1.buildTree(subnode1);
        System.out.println("Root Element : "+subRoot1.data);
        System.out.print("Preorder : ");
        preorder(subRoot1);
        System.out.print("\nInorder : ");
        inorder(subRoot1);
        System.out.print("\nPostorder : ");
        postorder(subRoot1);
        System.out.print("\nLevelOrder : \n");
        levelorder(subRoot1);
        System.out.println("The count of node : " + countOfNode((subRoot1)));
        System.out.println("The sum of node : " + sumOfNodes((subRoot1)));
        System.out.println("The height of tree is : " + heightOfTree((subRoot1)));
        System.out.println("The diameter of tree is : " + diameterOfTree((subRoot1)));
        System.out.println("The diameter of tree from second approach is : " + diameter2(subRoot1).diameter);
        System.out.println("The node1 is subtree of nodes is : " + isSubtreeExist(root , subRoot1));

    }
}
