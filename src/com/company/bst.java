package com.company;

public class bst {
    public static class Node{
        Node left;
        Node right;
        int data;
    }

    public Node createnewnode(int k){
        Node temp=new Node();
        temp.data=k;
        temp.left=null;
        temp.right=null;
        return temp;
    }
    public Node insert (Node node,int data){
        if(node==null){
            node=createnewnode(data);
            return node;
        }
        if(data<node.data){
            node.left=insert(node.left,data);
        }else if(data>node.data){
            node.right=insert(node.right,data);
        }
        return node;


    }
    public void display(Node node){
        if(node==null){
            return;
        }
        display(node.left);
        System.out.println(node.data);
        display(node.right);
    }

}
//code from marshy