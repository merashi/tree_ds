package main;

public class Tree {
    protected static class Node {
        protected int data;
        protected Node leftchild;
        protected Node rightchild;

        public Node(int data){
            this.data = data;
            this.leftchild = null;
            this.rightchild = null;
        }
    }
    protected Node root;
    public Tree(){
                this.root = null;
    }
    protected Tree(Node root){
        this.root = root;
    }

}
