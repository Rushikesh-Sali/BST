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
    public Node delete(Node node,int x){
        if(node==null){
            return node;
        }
        if(x<node.data){
           node.left = delete(node.left,x);
        }else if(x>node.data){
           node.right = delete(node.right,x);
        }else {
            if (node.left==null || node.right==null){

                Node temp = node.left != null ? node.left : node.right;
                if (temp==null){
                    return null;
                }
                else {
                    return temp;
                }
            }else {
                Node successor=getSuccessor(node);
                node.data=successor.data;
                node.right=delete(node.right,successor.data);
            }
        } return node;
    }
    public Node getSuccessor(Node node){
        Node fenk=node.right;
        while(fenk.left!=null){
            fenk=fenk.left;
        } return fenk;


    }

}
//code from marshy