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

}
