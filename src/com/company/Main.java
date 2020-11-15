package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        bst a=new bst();
        bst.Node root=new bst.Node();
        root=null;
        Scanner scan=new Scanner(System.in);
        int ch;
        do{
            System.out.println("-------------------------menu----------------------");
            System.out.println("1.insert an element into the binary search tree");
            System.out.println("2. display the elements in inorder series i.e sorted ");
            System.out.println("3.delete an element");
            System.out.println("4.exit");
            System.out.println("enter your choice");
            ch=scan.nextInt();
            switch(ch) {
                case 1:

                    System.out.println("enter the element to be inserted");
                    int data = scan.nextInt();
                    root = a.insert(root, data);
                    break;
                case 2:
                    System.out.println("the binary tree elements are:");
                    a.display(root);
                    break;
            }



        }while(ch!=3);

    }
}
